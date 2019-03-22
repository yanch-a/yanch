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

