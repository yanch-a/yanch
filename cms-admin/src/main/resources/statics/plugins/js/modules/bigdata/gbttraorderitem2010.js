$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'bigdata/traorderitem/list',
        datatype: "json",
        colModel: [			
			{ label: '采购医院代码', name: 'buyerOrgCode', index: 'BUYER_ORG_CODE', width: 80 }, 			
			{ label: '创建时间', name: 'createDate', index: 'CREATE_DATE', width: 80 }, 			
			{ label: '发货数量', name: 'deliveryQty', index: 'DELIVERY_QTY', width: 80 }, 			
			{ label: '药品编码', name: 'drugCode', index: 'DRUG_CODE', width: 80 }, 			
			{ label: '挂网价格', name: 'tenderUnitPrice', index: 'TENDER_UNIT_PRICE', width: 80 }, 			
			{ label: '单价', name: 'unitPrice', index: 'UNIT_PRICE', width: 80 }, 			
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

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		gbTTraOrderItem2010: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.gbTTraOrderItem2010 = {};
		},
		update: function (event) {
			var did = getSelectedRow();
			if(did == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(did)
		},
		saveOrUpdate: function (event) {
			var url = vm.gbTTraOrderItem2010.did == null ? "bigdata/gbttraorderitem2010/save" : "bigdata/gbttraorderitem2010/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.gbTTraOrderItem2010),
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
			var dids = getSelectedRows();
			if(dids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "bigdata/gbttraorderitem2010/delete",
                    contentType: "application/json",
				    data: JSON.stringify(dids),
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
		getInfo: function(did){
			$.get(baseURL + "bigdata/gbttraorderitem2010/info/"+did, function(r){
                vm.gbTTraOrderItem2010 = r.gbTTraOrderItem2010;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});