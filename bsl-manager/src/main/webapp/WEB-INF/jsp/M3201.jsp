<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<div class="easyui-panel" title="外厂成品来料通知单信息查询" style="padding:10px 10px 10px 10px">
		<form id="otherProdReceiptSearchForm" class="itemForm" method="post">
		   <table>
		        <tr>
		        	<td width="120" align="right">外厂成品来料单号:</td>
		            <td width="210" align="right">
		            	<input name="bsId" id="bsIdM3201" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,20]'" style="width:200px;"></input>
		            </td>    
		        </tr>
		        <tr>
		            <td width="120" align="right">开始日期:</td>
		            <td width="210" align="right">
		            	<input name="startDate" id="startDateM3201" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">结束日期:</td>
		            <td width="210" align="right">
		            	<input name="endDate" id="endDateM3201" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">页码:</td>
		            <td width="210" align="right">
		            	<input name="page" id="pageM3201" class="easyui-textbox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">每页记录数:</td>
		            <td width="210" align="right">
		            	<input name="rows" id="rowsM3201" class="easyui-textbox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		         </tr>
	       		 <tr hidden="true">
		             <td width="120" align="right">排序字段:</td>
		            <td width="210" align="right">
		            	<input name="sort" id="sortM3201" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">排序规则:</td>
		            <td width="210" align="right">
		            	<input name="order" id="orderM3201" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		         </tr>
	       		 <tr hidden="true">
		            <td width="120" align="right">类名:</td>
		            <td width="210" align="right">
		            	<input name="className" id="classNameM3201" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">方法名:</td>
		            <td width="210" align="right">
		            	<input name="methodName" id="methodNameM3201" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>			        
		    </table>
		</form>
		
		<div style="margin-top:10px" align="center">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" id="searchM3201Form" onclick="searchM3201Form()">查询</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearM3201Form()">重置</a>
		</div>
	</div>
	 <table class="easyui-datagrid" id="otherProdReceiptList" title="外厂成品来料通知单信息管理"  style="height:620px"
	       data-options="singleSelect:true,rownumbers:true,remoteSort:false,onSortColumn:sortSerachM3201,collapsible:true,pagination:true,url:'/otherProdReceipt/listByCriteria',method:'post',onBeforeLoad:onBeforeLoadM3201,pageSize:30,toolbar:toolbarM3201">
	    <thead>
	        <tr>
	        	<th data-options="field:'ck',checkbox:true"></th>
	        	<th data-options="field:'bsId',width:150,sortable:true">外厂成品来料单号</th>
	            <th data-options="field:'bsCompany',width:150,sortable:true">供应商</th>
	            <th data-options="field:'bsCustomer',width:150,sortable:true">客户</th>
	            <th data-options="field:'bsHasguarantee',width:120,formatter:BSL.formatIsOrNotStatus,sortable:true">含质保书</th>
	            <th data-options="field:'bsAmt',width:120,sortable:true">包数</th>
	            <th data-options="field:'bsWeight',width:130,sortable:true">预计来料重量/吨</th>
	            <th data-options="field:'bsInputuser',width:120,sortable:true">制单人</th>
	            <th data-options="field:'crtDate',width:120,formatter:BSL.formatDateTime,sortable:true">创建日期</th>
	            <th data-options="field:'remark',width:120,sortable:true">备注</th>
	        </tr>
	    </thead>
	</table>
	<div id="otherProdReceiptAddWindow" class="easyui-window" title="新增外厂成品来料通知单" data-options="modal:true,closed:true,iconCls:'edit_add',href:'/otherProdReceipt/M3201-add'" style="width:780px;height:230px;padding:10px;">
	</div>
	<div id="otherProdReceiptEditWindow" class="easyui-window" title="编辑外厂成品来料通知单" data-options="modal:true,closed:true,iconCls:'otherProdReceipt-edit',href:'/otherProdReceipt/M3201-edit'" style="width:780px;height:260px;padding:10px;">
	</div>
</div>
<script>

	function onBeforeLoadM3201(){
		var queryParams = $('#otherProdReceiptList').datagrid('options').queryParams;
		queryParams.bsId = $('#bsIdM3201').val();
		queryParams.startDate = $('#startDateM3201').datebox("getValue");
		queryParams.endDate = $('#endDateM3201').datebox("getValue");
	}
	
	//排序查询
	function sortSerachM3201(sort,order){
		$("#sortM3201").textbox('setValue',sort);
		$("#orderM3201").textbox('setValue',order);
		searchM3201Form();
	}

	//查询按钮
	function searchM3201Form(){
		//page页码
		var page = $("#otherProdReceiptList").datagrid('options').pageNumber;
		//rows每页记录条数  
        var rows = $("#otherProdReceiptList").datagrid('options').pageSize; 
		$("#pageM3201").textbox('setValue',page);
		$("#rowsM3201").textbox('setValue',rows);
		//ajax的post方式提交表单
		//$("#otherProdReceiptSearchForm").serialize()将表单序列号为key-value形式的字符串
		$('#searchM3201Form').linkbutton('disable');
		$.post("/otherProdReceipt/listByCriteria",$("#otherProdReceiptSearchForm").serialize(), function(data){
			if(data.status == 200){
	            $('#otherProdReceiptList').datagrid('loadData', {"total":data.total,"rows":data.rows});
	            $("#classNameM3201").textbox('setValue',data.className);
				$("#methodNameM3201").textbox('setValue',data.methodName);
			}else{
				$.messager.alert('提示',data.msg);
			}
			$('#searchM3201Form').linkbutton('enable');
		});
		 onBeforeLoadM3201();
	}
	
	/* 重置表单 */
	function clearM3201Form(){
		$('#otherProdReceiptSearchForm').form('reset');
	}

    function getM3201SelectionsIds(){
    	var otherProdReceiptList = $("#otherProdReceiptList");
    	var sels = otherProdReceiptList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].bsId);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbarM3201 = [{
        text:'新增',
        iconCls:'icon-add',
        handler:function(){
        	$("#otherProdReceiptAddWindow").window({
        		onLoad :function(){
        			var ids = getM3201SelectionsIds();
        			if(ids.length > 0){
	        			//回显数据
	        			var data = $("#otherProdReceiptList").datagrid("getSelections")[0];
	        			$("#otherProdReceiptAddForm").form("load",data);
        			}
        		}
        	}).window("open");
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getM3201SelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一条记录编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一条记录编辑!');
        		return ;
        	}
        	
        	$("#otherProdReceiptEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			var data = $("#otherProdReceiptList").datagrid("getSelections")[0];
        			$("#otherProdReceiptEditForm").form("load",data);
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var ids = getM3201SelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一条记录删除!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','一次最多删除一条记录!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除本条记录？',function(r){
        	    if (r){
        	    	var params = {"bsId":ids};
                	$.post("/otherProdReceipt/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除成功!',undefined,function(){
            					searchM3201Form();
            				});
            			} else {
            				$.messager.alert('提示','删除失败：'+data.msg);
            			}
            		});
        	    }
        	});
        }
    },{
    	text : '导出EXCEL',
        iconCls : 'icon-save',
        handler : function() {
        	//获取后台传递参数className methodName
			var className = $("#otherProdReceiptList").datagrid("getData").className;
			var methodName = $("#otherProdReceiptList").datagrid("getData").methodName;
			/**
			 * datagrid属性中获取不到className、methodName时，需要从隐藏域中获取；
			 * 主要是查询时，datagrid属性className、methodName会丢失
			 */
			if(className == "" || className==null || className == undefined){
				className = $('#classNameM3201').val();
			}
			if(methodName == "" || methodName==null || methodName == undefined){
				methodName = $('#methodNameM3201').val();
			}
			//获取表头信息
			var header = $("#otherProdReceiptList").datagrid("options").columns[0];
			var fields = "";
			var titles = "";
			for(var i=1;i<header.length;i++){
				var field = header[i].field;
				var title = header[i].title;
				var hiddenFlag = header[i].hidden;
				if(!hiddenFlag){
					var dh = i == (header.length-1) ? "":",";
					fields = fields + field + dh;
					titles = titles + title + dh;
				}
			}
			var mapParam = new Map();
			//必传
			mapParam.set("url","/export/exportExcelExtra");
			mapParam.set("fields",fields);
			mapParam.set("titles",titles);
			mapParam.set("className",className);
			mapParam.set("methodName",methodName);
			mapParam.set("excelName","外厂成品来料通知单信息");
			mapParam.set("loginUserId",$("#user_id").html());
			mapParam.set("rows","5000");
			mapParam.set("page","1");
			//查询条件 把所有查询条件带上
			mapParam.set("bsId",$('#bsIdM3201').val());
			mapParam.set("startDate",$('#startDateM3201').datebox("getValue"));
			mapParam.set("endDate",$('#endDateM3201').datebox("getValue"));
			
			BSL.toExcel(mapParam);
        }
    }];
    
</script>