$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'sys/secollection/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'ID', key: true,hidden: true },
			{ label: 'LOGO', name: 'logo', index: 'LOGO', width: 25 ,formatter:iconFormatter},			
			{ label: '站点名称', name: 'siteName', index: 'SITE_NAME', width: 100 }, 			
			{ label: 'URL', name: 'url', index: 'URL', width: 130,formatter:urlFormatter },
			{ label: '用户名', name: 'userName', index: 'USER_NAME', width: 50 }, 			
			{ label: '登录密码', name: 'password', index: 'PASSWORD', width: 80 }, 			
			{ label: '用户主键', name: 'userId', index: 'USER_ID',hidden: true },
			{ label: '备注', name: 'remark', index: 'REMARK', width: 80 },
			{ label: '排序', name: 'seq', index: 'SEQ', width: 20 }, 			
			{ label: '创建时间', name: 'createTime', index: 'CREATE_TIME', width: 65,formatter:dateFormatter }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});
function urlFormatter(value,options,row){
	if(value==''){
		return "";
	}else{
		return "<a title='"+value+"' href='"+value+"' target='_blank'>"+value+"</a>";
	}
	
}
function iconFormatter(value,options,row){
	var i = "<i data-icon='"+value+"' class='"+value+"'></i>";
	return i;
}
var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		showIcons:false,
		seCollection: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.seCollection = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			if(vm.seCollection.logo == null||vm.seCollection.logo == ''){
				vm.seCollection.logo = $("#logo-icon").attr("class",cla);
			}
			var url = vm.seCollection.id == null ? "sys/secollection/save" : "sys/secollection/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.seCollection),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "sys/secollection/delete",
                    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get(baseURL + "sys/secollection/info/"+id, function(r){
                vm.seCollection = r.seCollection;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		},
		showIcon: function () {
			vm.showIcons = true;
		}
	}
});
$(".fontawesome-icon-list a").click(function(){
	debugger;
	var cla = $(this).children("i").attr("class");
	vm.seCollection.logo = cla;
	$("#logo-icon").attr("class",cla);
	vm.showIcons = false;
});