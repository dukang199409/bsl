<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<div class="easyui-panel" title="半成品销售出库报表" style="padding:10px 10px 10px 10px">
		<form id="M7109Form" class="itemForm" method="post">
		   <table>
		   		<tr>
		        	<td width="120" align="right">客户:</td>
		            <td width="210" align="right">
		            	<input name="prodCustomer" id="prodCustomerM7109" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,120]'" style="width:200px;"></input>
		            </td>  
		            <td width="120" align="right">合同类别:</td>
		            <td width="210" align="right">
		            	<select name="contractType" id="contractTypeM7109" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				          <option value="">请选择...</option>
				           <c:forEach items="${contractTypeList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          		</c:forEach>
						</select>
					</td>
		        </tr>
		   		 <tr>
		            <td width="120" align="right">产品规格:</td>
		            <td width="210" align="right">
	            		<input name="prodNorm" id="prodNormM7109" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,40]'" style="width:200px;"></input>
	            	</td>
		            <td width="120" align="right">钢种:</td>
		            <td width="210" align="right">
		            	<select name="prodMaterial" id="prodMaterialM7109" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				          <option value="">请选择...</option>
				           <c:forEach items="${prodMaterialList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          		</c:forEach>
						</select>
					</td>
		        </tr>
		        <tr>
		        	<td width="120" align="right">产品名称:</td>
		            <td width="210" align="right">
		            	<input name="prodName" id="prodNameM7109" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,40]'" style="width:200px;"></input>
		            </td>  
		        </tr>
		         <tr>
		            <td width="120" align="right">开始日期:</td>
		            <td width="210" align="right">
		            	<input name="startDate" id="startDateM7109" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">结束日期:</td>
		            <td width="210" align="right">
		            	<input name="endDate" id="endDateM7109" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">页码:</td>
		            <td width="210" align="right">
		            	<input name="page" id="pageM7109" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">每页记录数:</td>
		            <td width="210" align="right">
		            	<input name="rows" id="rowsM7109" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">类名:</td>
		            <td width="210" align="right">
		            	<input name="className" id="classNameM7109" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">方法名:</td>
		            <td width="210" align="right">
		            	<input name="methodName" id="methodNameM7109" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>			        
		    </table>
		</form>
		
		<div style="margin-top:10px" align="center">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="searchM7109Form()">查询</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearM7109Form()">重置</a>
		</div>
	</div>
	 <table class="easyui-datagrid" id="M7109List" title="半成品销售出库报表"  style="height:590px"
	       data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:true,url:'/report/listM7109',method:'post',onBeforeLoad:onBeforeLoadM7109,pageSize:30,toolbar:toolbarM7109">
	    <thead>
	        <tr>
	        	<th data-options="field:'ck',checkbox:true"></th>
	        	<th data-options="field:'dataDate',width:100">统计日期</th>
	            <th data-options="field:'contractType',width:100,formatter:BSL.formatContractType,sortable:true">合同类别</th>
   				<th data-options="field:'prodCustomer',sortable:true,width:150">客户</th>
   				<th data-options="field:'prodName',sortable:true,width:100">产品名称</th>
   				<th data-options="field:'prodNorm',sortable:true,width:100">产品规格</th>
	            <th data-options="field:'prodMaterial',width:120,formatter:BSL.formatProdMaterial">钢种</th>
	            <th data-options="field:'prodOutNum',width:100">出库数量</th>
	            <th data-options="field:'prodOutWeight',width:120">出库重量/吨</th>
	            <th data-options="field:'prodChaWeight',width:120">磅差重量/吨</th>
	            <th data-options="field:'prodRetWeight',width:120">退货重量/吨</th>
	            <th data-options="field:'salePrice',width:120">出库单价/元</th>
	            <th data-options="field:'saleAmt',width:120">出库金额/元</th>
	            <th data-options="field:'remark',width:125">备注</th>
	            <th data-options="field:'crtDate',width:125,formatter:BSL.formatDateTime,sortable:true">创建日期</th>
	        </tr>
	    </thead>
	</table>
</div>
<script>

	function onBeforeLoadM7109(){
		var queryParams = $('#M7109List').datagrid('options').queryParams;
		queryParams.prodCustomer = $('#prodCustomerM7109').val();
		queryParams.contractType = $('#contractTypeM7109').combobox("getValue");
		queryParams.prodNorm = $('#prodNormM7109').val();
		queryParams.prodMaterial = $('#prodMaterialM7109').combobox("getValue");
		queryParams.prodName = $('#prodNameM7109').val();
		queryParams.startDate = $('#startDateM7109').datebox("getValue");
		queryParams.endDate = $('#endDateM7109').datebox("getValue");
	}

	//查询按钮
	function searchM7109Form(){
		//page页码
		var page = $("#M7109List").datagrid('options').pageNumber;
		//rows每页记录条数  
        var rows = $("#M7109List").datagrid('options').pageSize; 
		$("#pageM7109").textbox('setValue',page);
		$("#rowsM7109").textbox('setValue',rows);
		//ajax的post方式提交表单
		//$("#receiptSearchForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/report/listM7109",$("#M7109Form").serialize(), function(data){
			if(data.status == 200){				
	            $('#M7109List').datagrid('loadData',  {"total":data.total,"rows":data.rows});
	            $("#classNameM7109").textbox('setValue',data.className);
				$("#methodNameM7109").textbox('setValue',data.methodName);
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
		onBeforeLoadM7109();
	}
	
	/* 重置表单 */
	function clearM7109Form(){
		$('#M7109Form').form('reset');
	}
	
	 var toolbarM7109 = [{
	    	text : '导出EXCEL',
	        iconCls : 'icon-save',
	        handler : function() {
	        	//获取后台传递参数className methodName
				var className = $("#M7109List").datagrid("getData").className;
				var methodName = $("#M7109List").datagrid("getData").methodName;
				/**
				 * datagrid属性中获取不到className、methodName时,需要从隐藏域中获取；
				 * 主要是查询时,datagrid属性className、methodName会丢失
				 */
				if(className == "" || className==null || className == undefined){
					className = $('#classNameM7109').val();
				}
				if(methodName == "" || methodName==null || methodName == undefined){
					methodName = $('#methodNameM7109').val();
				}
				//获取表头信息
				var header = $("#M7109List").datagrid("options").columns[0];
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
				mapParam.set("excelName","半成品销售出库报表-日报");
				mapParam.set("loginUserId",$("#user_id").html());
				mapParam.set("rows","5000");
				mapParam.set("page","1");
				//查询条件 把所有查询条件带上
				mapParam.set("prodCustomer", $('#prodCustomerM7109').val());
				mapParam.set("contractType",$('#contractTypeM7109').combobox("getValue"));
				mapParam.set("prodNorm", $('#prodNormM7109').val());
				mapParam.set("prodMaterial",$('#prodMaterialM7109').combobox("getValue"));
				mapParam.set("prodName", $('#prodNameM7109').val());
				mapParam.set("startDate",$('#startDateM7109').datebox("getValue"));
				mapParam.set("endDate",$('#endDateM7109').datebox("getValue"));
				BSL.toExcel(mapParam);
	        }
	    }];
    
</script>