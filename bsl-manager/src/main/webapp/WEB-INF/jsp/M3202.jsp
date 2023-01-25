<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<div class="easyui-panel" title="外厂来料产品信息查询" style="padding:10px 10px 10px 10px">
		<form id="otherProdSearchForm" class="itemForm" method="post">
		   <table>
		        <tr>
		            <td width="120" align="right">件号:</td>
		            <td width="210" align="right">
		            	<input name="prodId" id="prodIdM3202" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,20]'" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">来料通知单号:</td>
		            <td width="210" align="right">
		            	<input name="prodPlanNo" id="prodPlanNoM3202" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,20]'" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr>
		       		<td width="120" align="right">产品状态:</td>
		            <td width="210" align="right">
		            	<select name="prodStatus" id="prodStatusM3202" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				          <option value="">请选择...</option>
				           <c:forEach items="${prodStatusBList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          	 </c:forEach>
						</select>
		            </td>
		        	<td width="120" align="right">炉(批)号:</td>
		            <td width="210" align="right">
		            	<input name="prodLuno" id="prodLunoM3202" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,32]'" style="width:200px;"></input>
		            </td>
		        </tr>
		       <tr>
		       		<td width="120" align="right">钢种:</td>
		            <td width="210" align="right">
		            	<select name="prodMaterial" id="prodMaterialM3202" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				          <option value="">请选择...</option>
				           <c:forEach items="${prodMaterialList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
						</select>
					</td>
		            <td width="120" align="right">规格:</td>
		            <td width="210" align="right">
	            		<input name="prodNorm" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,40]'" style="width:200px;"></input>
	            	</td>
		        </tr>
		        <tr>
		            <td width="120" align="right">出库指令号:</td>
		            <td width="210" align="right">
		            	<input name="prodOutPlan" id="prodOutPlanM3202" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,20]'" style="width:200px;"></input>
		            </td>
		        </tr>
		         <tr>
		            <td width="120" align="right">开始日期:</td>
		            <td width="210" align="right">
		            	<input name="startDate" id="startDateM3202" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">结束日期:</td>
		            <td width="210" align="right">
		            	<input name="endDate" id="endDateM3202" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">页码:</td>
		            <td width="210" align="right">
		            	<input name="page" id="pageM3202" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">每页记录数:</td>
		            <td width="210" align="right">
		            	<input name="rows" id="rowsM3202" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">排序字段:</td>
		            <td width="210" align="right">
		            	<input name="sort" id="sortM3202" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">排序规则:</td>
		            <td width="210" align="right">
		            	<input name="order" id="orderM3202" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">类名:</td>
		            <td width="210" align="right">
		            	<input name="className" id="classNameM3202" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">方法名:</td>
		            <td width="210" align="right">
		            	<input name="methodName" id="methodNameM3202" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>			        
		    </table>
		</form>
		
		<div style="margin-top:10px" align="center">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="searchM3202Form()">查询</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearM3202Form()">重置</a>
		</div>
	</div>
	 <table class="easyui-datagrid" id="otherProdInfoList" title="委外仓产成品库存台账信息管理"  style="height:600px"
	       data-options="singleSelect:true,rownumbers:true,remoteSort:false,onSortColumn:sortSerachM3202,collapsible:true,pagination:true,url:'/otherProd/listByCriteria',method:'post',onBeforeLoad:onBeforeLoadM3202,pageSize:30,toolbar:toolbarM3202">
	    <thead>
	        <tr>
	        	<th data-options="field:'ck',checkbox:true"></th>
	            <th data-options="field:'prodId',width:130,sortable:true">产品编号</th>
	            <th data-options="field:'prodPlanNo',width:130,sortable:true">来料通知单号</th>
	        	<th data-options="field:'prodName',width:100,sortable:true">产品名称</th>
	            <th data-options="field:'prodStatus',width:100,formatter:BSL.formatProdStatus,sortable:true">状态</th>
	        	<th data-options="field:'prodNorm',sortable:true,width:100">规格</th>
	        	<th data-options="field:'prodMaterial',width:100,formatter:BSL.formatProdMaterial,sortable:true">钢种</th>
	            <th data-options="field:'prodPrintWeight',width:100,sortable:true">重量/吨</th>
	            <th data-options="field:'prodNum',width:100,sortable:true">件数</th>
	        	<th data-options="field:'prodLuno',width:100,sortable:true">炉(批)号</th>
	        	<th data-options="field:'prodOutPlan',width:100,sortable:true">出库指令号</th>
	        	<th data-options="field:'prodLength',width:100,sortable:true">定尺/米</th>
	            <th data-options="field:'prodLevel',width:110,formatter:BSL.formatProdLevel,sortable:true">质量等级</th>
	            <th data-options="field:'prodDclFlag',width:130,formatter:BSL.formatProdDclFlag,sortable:true">产成品外协厂标志</th>
	            <th data-options="field:'prodRuc',width:100,sortable:true,formatter:BSL.formatProdRuc">入库仓库/区</th>
	            <th data-options="field:'prodOutCarno',width:120,sortable:true">发货车次流水</th>
	            <th data-options="field:'prodCompany',width:100,sortable:true">厂家</th>
	            <th data-options="field:'prodCustomer',width:100,sortable:true">客户</th>
	            <th data-options="field:'prodInputuser',width:100,sortable:true">录入人</th>
	            <th data-options="field:'crtDate',width:140,formatter:BSL.formatFullDateTime,sortable:true">入库日期</th>
	            <th data-options="field:'prodOutDate',width:140,formatter:BSL.formatFullDateTime,sortable:true">出库日期</th>
	            <th data-options="field:'updDate',width:140,formatter:BSL.formatFullDateTime,sortable:true">修改日期</th>
	            <th data-options="field:'remark',width:100,sortable:true">备注</th>
	        </tr>
	    </thead>
	</table>
	<div id="otherProdAddWindow" class="easyui-window" title="新增" data-options="modal:true,closed:true,iconCls:'edit_add',href:'/otherProd/M3202-add'" style="width:780px;height:300px;padding:10px;">
	</div>
	<div id="otherProdEditWindow" class="easyui-window" title="编辑" data-options="modal:true,closed:true,iconCls:'receipt-edit',href:'/otherProd/M3202-edit'" style="width:780px;height:310px;padding:10px;">
	</div>
</div>
<script>

	function onBeforeLoadM3202(){
		var queryParams = $('#otherProdInfoList').datagrid('options').queryParams;
		queryParams.prodId = $('#prodIdM3202').val();
		queryParams.prodPlanNo = $('#prodPlanNo').val();
		queryParams.prodStatus = $('#prodStatusM3202').combobox("getValue");
		queryParams.prodLuno = $('#prodLunoM3202').val();
		queryParams.prodMaterial = $('#prodMaterialM3202').combobox("getValue");
		queryParams.prodNorm = $('#prodNormM3202').val();
		queryParams.prodOutPlan = $('#prodOutPlanM3202').val();
		queryParams.startDate = $('#startDateM3202').datebox("getValue");
		queryParams.endDate = $('#endDateM3202').datebox("getValue");
	}

	//排序查询
	function sortSerachM3202(sort,order){
		$("#sortM3202").textbox('setValue',sort);
		$("#orderM3202").textbox('setValue',order);
		searchM3202Form();
	}

	//查询按钮
	function searchM3202Form(){
		//page页码
		var page = $("#otherProdInfoList").datagrid('options').pageNumber;
		//rows每页记录条数  
        var rows = $("#otherProdInfoList").datagrid('options').pageSize; 
		$("#pageM3202").textbox('setValue',page);
		$("#rowsM3202").textbox('setValue',rows);
		//ajax的post方式提交表单
		//$("#receiptSearchForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/otherProd/listByCriteria",$("#otherProdSearchForm").serialize(), function(data){
			if(data.status == 200){				
	            $('#otherProdInfoList').datagrid('loadData', {"total":data.total,"rows":data.rows});
	            $("#classNameM3202").textbox('setValue',data.className);
				$("#methodNameM3202").textbox('setValue',data.methodName);
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
		onBeforeLoadM3202();
	}
	
	/* 重置表单 */
	function clearM3202Form(){
		$('#otherProdSearchForm').form('reset');
	}

    function getM3202SelectionsIds(){
    	var receiptList = $("#otherProdInfoList");
    	var sels = receiptList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].prodId);
    	}
    	ids = ids.join(",");
    	return ids;
    }
    
    var toolbarM3202 = [{
        text:'新增',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getM3202SelectionsIds();
        	var data = {};
        	if(ids.length != 0){
        		data = $("#otherProdInfoList").datagrid("getSelections")[0];
        	}
        	$("#otherProdAddWindow").window({
        		onLoad :function(){
        			//回显数据
        			$("#otherProdAddForm").form("load",data);
        		}
        	}).window("open");
        }
    },{
        text:'编辑',
        iconCls:'icon-edit',
        handler:function(){
        	var ids = getM3202SelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一条记录编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一条记录编辑!');
        		return ;
        	}
        	var data = $("#otherProdInfoList").datagrid("getSelections")[0];
        	var user = $("#user_id").html(); 
        	if(user != '000000'){
        		$.messager.alert('提示','只有超级管理员才允许修改产品信息!');
        		return ;
        	}
        	$("#otherProdEditWindow").window({
        		onLoad :function(){
        			//回显数据
        			$("#otherProdEditForm").form("load",data);
        		}
        	}).window("open");
        }
    },{
        text:'删除',
        iconCls:'icon-cancel',
        handler:function(){
        	var ids = getM3202SelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一条记录删除!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','一次最多删除一条记录!');
        		return ;
        	}
        	var data = $("#otherProdInfoList").datagrid("getSelections")[0];
        	if(data.prodStatus != "1"){
	    		$.messager.alert('提示','只有在库状态的产品才允许删除!');
	    		return ;
	    	}
        	var user = $("#user_id").html(); 
        	if(user != '000000'){
        		$.messager.alert('提示','只有超级管理员才允许删除产品信息!');
        		return ;
        	}
        	$.messager.confirm('确认','确定删除本条记录？',function(r){
        	    if (r){
        	    	var params = {"prodId":ids,'user':user};
                	$.post("/otherProd/delete",params, function(data){
            			if(data.status == 200){
            				$.messager.alert('提示','删除成功!',undefined,function(){
            					searchM3202Form();
            				});
            			} else {
            				$.messager.alert('提示', data.msg);
            			}
            		});
        	    }
        	});
        }
    },{
        text:'补打PDF标签文件',
        iconCls:'icon-print',
        handler:function(){
        	var ids = getM3202SelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一条记录补打PDF!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一条记录补打PDF!');
        		return ;
        	}
        	var data = $("#otherProdInfoList").datagrid("getSelections")[0];
        	if(data.prodStatus == "0"){
        		$.messager.alert('提示','未入库的产品不支持补打PDF!');
        		return ;
        	}
        	$.messager.confirm('确认','是否需要补打PDF标签文件？',function(r){
				if (r){
					var prodId = data.prodId;
        	    	var mapParam = new Map();
        			mapParam.set("url","/import/importPdf");
        			mapParam.set("prodId",prodId);
        			mapParam.set("tradeType","M3005");
        			BSL.toNewPagePDF(mapParam);
        	    }
			});
        }
    },{
    	text : '导出EXCEL',
        iconCls : 'icon-save',
        handler : function() {
        	//获取后台传递参数className methodName
			var className = $("#otherProdInfoList").datagrid("getData").className;
			var methodName = $("#otherProdInfoList").datagrid("getData").methodName;
			/**
			 * datagrid属性中获取不到className、methodName时，需要从隐藏域中获取；
			 * 主要是查询时，datagrid属性className、methodName会丢失
			 */
			if(className == "" || className==null || className == undefined){
				className = $('#classNameM3202').val();
			}
			if(methodName == "" || methodName==null || methodName == undefined){
				methodName = $('#methodNameM3202').val();
			}
			//获取表头信息
			var header = $("#otherProdInfoList").datagrid("options").columns[0];
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
			mapParam.set("excelName","外场来料产品库存台账信息");
			mapParam.set("loginUserId",$("#user_id").html());
			mapParam.set("rows","10000");
			mapParam.set("page","1");
			//查询条件 把所有查询条件带上
			mapParam.set("prodId",$('#prodIdM3202').val());
			mapParam.set("prodPlanNo",$('#prodPlanNoM3202').val());
			mapParam.set("prodStatus",$('#prodStatusM3202').combobox("getValue"));
			mapParam.set("prodLuno",$('#prodLunoM3202').val());
			mapParam.set("prodMaterial",$('#prodMaterialM3202').combobox("getValue"));
			mapParam.set("prodNorm",$('#prodNormM3202').val());
			mapParam.set("prodOutPlan",$('#prodOutPlanM3202').val());
			mapParam.set("startDate",$('#startDateM3202').datebox("getValue"));
			mapParam.set("endDate",$('#endDateM3202').datebox("getValue"));
			BSL.toExcel(mapParam);
        }
    }];
    
</script>