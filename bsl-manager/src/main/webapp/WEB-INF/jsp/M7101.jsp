<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<div class="easyui-panel" title="成型机组生产报表" style="padding:10px 10px 10px 10px">
		<form id="M7101Form" class="itemForm" method="post">
		   <table>
		   		<tr>
		            <td width="120" align="right">报表类别:</td>
		            <td width="210" align="right">
		            	<select name="dataType" id="dataTypeM7101" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				          <option value="">请选择...</option>
				            <c:forEach items="${dataTypeList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          	  </c:forEach>
						</select>
		            </td>
		        </tr>
		         <tr>
		            <td width="120" align="right">开始日期:</td>
		            <td width="210" align="right">
		            	<input name="startDate" id="startDateM7101" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">结束日期:</td>
		            <td width="210" align="right">
		            	<input name="endDate" id="endDateM7101" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">页码:</td>
		            <td width="210" align="right">
		            	<input name="page" id="pageM7101" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">每页记录数:</td>
		            <td width="210" align="right">
		            	<input name="rows" id="rowsM7101" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">类名:</td>
		            <td width="210" align="right">
		            	<input name="className" id="classNameM7101" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">方法名:</td>
		            <td width="210" align="right">
		            	<input name="methodName" id="methodNameM7101" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>			        
		    </table>
		</form>
		
		<div style="margin-top:10px" align="center">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="searchM7101Form()">查询</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearM7101Form()">重置</a>
		</div>
	</div>
	 <table class="easyui-datagrid" id="M7101List" title="成型机组生产报表"  style="height:590px"
	       data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:true,url:'/report/listByCriteriaM7101',method:'post',onBeforeLoad:onBeforeLoadM7101,pageSize:30,toolbar:toolbarM7101">
	    <thead>
	        <tr>
	        	<th data-options="field:'ck',checkbox:true"></th>
	        	<th data-options="field:'dataDate',width:100">统计日期</th>
	        	<th data-options="field:'dataType',width:100,formatter:BSL.formatDataType">报表类别</th>
	        	<th data-options="field:'prodJz',width:120,formatter:BSL.formatPlanJz">机组班次</th>
	        	<th data-options="field:'prodPlanNo',width:140">生产批号</th>
	        	<th data-options="field:'prodNorm',width:100">产品规格</th>
	            <th data-options="field:'prodMaterial',width:100,formatter:BSL.formatProdMaterial">钢种</th>
	            <th data-options="field:'prodBs',width:100">产品包数</th>
	            <th data-options="field:'prodZs',width:100">产品支数</th>
	            <th data-options="field:'prodWeight',width:125">产品重量/吨</th>
	            <th data-options="field:'prodUseNorm',width:100">投料规格</th>
	            <th data-options="field:'prodUseNum',width:100">投料件数</th>
	            <th data-options="field:'prodUseWeight',width:100">投料重量/吨</th>
	            <th data-options="field:'prodDclWeight',width:100">待处理品重量/吨</th>
	            <th data-options="field:'prodFlWeight',width:100">废钢重量/吨</th>
	            <th data-options="field:'prodCcl',width:100">成材率</th>
	            <th data-options="field:'remark',width:100">备注</th>
	            <th data-options="field:'crtDate',width:120,formatter:BSL.formatDateTime,sortable:true">创建日期</th>
	            
	        </tr>
	    </thead>
	</table>
</div>
<script>

	function onBeforeLoadM7101(){
		var queryParams = $('#M7101List').datagrid('options').queryParams;
		queryParams.dataType = $('#dataTypeM7101').combobox("getValue");
		queryParams.startDate = $('#startDateM7101').datebox("getValue");
		queryParams.endDate = $('#endDateM7101').datebox("getValue");
	}

	//查询按钮
	function searchM7101Form(){
		//page页码
		var page = $("#M7101List").datagrid('options').pageNumber;
		//rows每页记录条数  
        var rows = $("#M7101List").datagrid('options').pageSize; 
		$("#pageM7101").textbox('setValue',page);
		$("#rowsM7101").textbox('setValue',rows);
		//ajax的post方式提交表单
		//$("#receiptSearchForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/report/listByCriteriaM7101",$("#M7101Form").serialize(), function(data){
			if(data.status == 200){				
	            $('#M7101List').datagrid('loadData',  {"total":data.total,"rows":data.rows});
	            $("#classNameM7101").textbox('setValue',data.className);
				$("#methodNameM7101").textbox('setValue',data.methodName);
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
		onBeforeLoadM7101();
	}
	
	/* 重置表单 */
	function clearM7101Form(){
		$('#M7101Form').form('reset');
	}
	
	 var toolbarM7101 = [{
	    	text : '导出EXCEL',
	        iconCls : 'icon-save',
	        handler : function() {
	        	//获取后台传递参数className methodName
				var className = $("#M7101List").datagrid("getData").className;
				var methodName = $("#M7101List").datagrid("getData").methodName;
				/**
				 * datagrid属性中获取不到className、methodName时，需要从隐藏域中获取；
				 * 主要是查询时，datagrid属性className、methodName会丢失
				 */
				if(className == "" || className==null || className == undefined){
					className = $('#classNameM7101').val();
				}
				if(methodName == "" || methodName==null || methodName == undefined){
					methodName = $('#methodNameM7101').val();
				}
				//获取表头信息
				var header = $("#M7101List").datagrid("options").columns[0];
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
				mapParam.set("excelName","成型机组生产报表");
				mapParam.set("loginUserId",$("#user_id").html());
				mapParam.set("rows","5000");
				mapParam.set("page","1");
				//查询条件 把所有查询条件带上
				mapParam.set("dataType",$('#dataTypeM7101').combobox("getValue"));
				mapParam.set("startDate",$('#startDateM7101').datebox("getValue"));
				mapParam.set("endDate",$('#endDateM7101').datebox("getValue"));
				BSL.toExcel(mapParam);
	        }
	    }];
    
</script>