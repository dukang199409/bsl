<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<div class="easyui-panel" title="产成品销售出库报表统计" style="padding:10px 10px 10px 10px">
		<form id="M7110sForm" class="itemForm" method="post">
		   <table>
		   		 <tr>
		        	<td width="120" align="right">客户:</td>
		            <td width="210" align="right">
		            	<input name="prodCustomer" id="prodCustomerM7110s" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,120]'" style="width:200px;"></input>
		            </td>  
		            <td width="120" align="right">合同类别:</td>
		            <td width="210" align="right">
		            	<select name="contractType" id="contractTypeM7110s" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
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
	            		<input name="prodNorm" id="prodNormM7110s" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,40]'" style="width:200px;"></input>
	            	</td>
		            <td width="120" align="right">钢种:</td>
		            <td width="210" align="right">
		            	<select name="prodMaterial" id="prodMaterialM7110s" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				          <option value="">请选择...</option>
				           <c:forEach items="${prodMaterialList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          		</c:forEach>
						</select>
					</td>
		        </tr>
		        <tr>
		        	<td width="120" align="right">产品定尺:</td>
		            <td width="210" align="right">
		            	<input name="prodLength" id="prodLengthM7110s" class="easyui-numberbox" type="text" data-options="required:false,min:0,precision:3,validType:'length[0,10]'"  style="width:200px;"></input>
		            </td>  
		        	<td width="120" align="right">产品名称:</td>
		            <td width="210" align="right">
		            	<input name="prodName" id="prodNameM7110s" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,40]'" style="width:200px;"></input>
		            </td>  
		        </tr>
		         <tr>
		            <td width="120" align="right">开始日期:</td>
		            <td width="210" align="right">
		            	<input name="startDate" id="startDateM7110s" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">结束日期:</td>
		            <td width="210" align="right">
		            	<input name="endDate" id="endDateM7110s" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">页码:</td>
		            <td width="210" align="right">
		            	<input name="page" id="pageM7110s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">每页记录数:</td>
		            <td width="210" align="right">
		            	<input name="rows" id="rowsM7110s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">类名:</td>
		            <td width="210" align="right">
		            	<input name="className" id="classNameM7110s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">方法名:</td>
		            <td width="210" align="right">
		            	<input name="methodName" id="methodNameM7110s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>			        
		    </table>
		</form>
		
		<div style="margin-top:10px" align="center">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="searchM7110sForm()">查询</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearM7110sForm()">重置</a>
		</div>
	</div>
	 <table class="easyui-datagrid" id="M7110sList" title="产成品销售出库报表统计"  style="height:500px"
	       data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:true,method:'post',onBeforeLoad:onBeforeLoadM7110s,url:'/report/listM7110s',pageSize:30,toolbar:toolbarM7110s">
	    <thead>
	        <tr>
	        	<th data-options="field:'contractType',width:100,formatter:BSL.formatContractType,sortable:true">合同类别</th>
   				<th data-options="field:'prodCustomer',sortable:true,width:150">客户</th>
   				<th data-options="field:'prodName',sortable:true,width:100">产品名称</th>
   				<th data-options="field:'prodNorm',sortable:true,width:100">产品规格</th>
	            <th data-options="field:'prodMaterial',width:120,formatter:BSL.formatProdMaterial">钢种</th>
	            <th data-options="field:'prodLength',width:100">产品定尺</th>
	            <th data-options="field:'prodOutZnum',width:100">出库支数</th>
	            <th data-options="field:'prodOutBnum',width:100">出库包数</th>
	            <th data-options="field:'prodOutWeight',width:120">出库重量/吨</th>
	            <th data-options="field:'prodChaWeight',width:120">磅差重量/吨</th>
	            <th data-options="field:'prodRetWeight',width:120">退货重量/吨</th>
	            <th data-options="field:'salePrice',width:120">出库单价/元</th>
	            <th data-options="field:'saleAmt',width:120">出库金额/元</th>
	            <th data-options="field:'remark',width:125">备注</th>
	        </tr>
	    </thead>
	</table>
	 <table class="easyui-datagrid" id="M7110sListHJ" title="产成品销售出库报表合计"  style="height:90px"
	       data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:false,method:'post',onBeforeLoad:onBeforeLoadM7110s">
	    <thead>
	        <tr>
	        	<th data-options="field:'ck',checkbox:true"></th>
	        	<th data-options="field:'prodHJ',width:125">合计</th>
	        	<th data-options="field:'prodNormHJ',width:125">规格总数量</th>
	        	<th data-options="field:'prodOutZnum',width:100">出库总支数</th>
	        	<th data-options="field:'prodOutBnum',width:100">出库总包数</th>
	            <th data-options="field:'prodOutWeight',width:120">出库总重量/吨</th>
	            <th data-options="field:'prodChaWeight',width:120">磅差总重量/吨</th>
	            <th data-options="field:'prodRetWeight',width:120">退货总重量/吨</th>
	            <th data-options="field:'saleAmt',width:120">出库总金额/元</th>
	        </tr>
	    </thead>
	</table>
</div>
<script>

	function onBeforeLoadM7110s(){
		var queryParams = $('#M7110sList').datagrid('options').queryParams;
		queryParams.prodCustomer = $('#prodCustomerM7110s').val();
		queryParams.contractType = $('#contractTypeM7110s').combobox("getValue");
		queryParams.prodNorm = $('#prodNormM7110s').val();
		queryParams.prodMaterial = $('#prodMaterialM7110s').combobox("getValue");
		queryParams.prodName = $('#prodNameM7110s').val();
		queryParams.prodLength = $('#prodLengthM7110s').numberbox("getValue");
		queryParams.startDate = $('#startDateM7110s').datebox("getValue");
		queryParams.endDate = $('#endDateM7110s').datebox("getValue");
	}

	//查询按钮
	function searchM7110sForm(){
		//page页码
		var page = $("#M7110sList").datagrid('options').pageNumber;
		//rows每页记录条数  
        var rows = $("#M7110sList").datagrid('options').pageSize; 
		$("#pageM7110s").textbox('setValue',page);
		$("#rowsM7110s").textbox('setValue',rows);
		//ajax的post方式提交表单
		//$("#receiptSearchForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/report/listM7110s",$("#M7110sForm").serialize(), function(data){
			if(data.status == 200){				
	            $('#M7110sList').datagrid('loadData',  {"total":data.total,"rows":data.rows});
	            $("#classNameM7110s").textbox('setValue',data.className);
				$("#methodNameM7110s").textbox('setValue',data.methodName);
				$.post("/report/listM7110sHJ",$("#M7110sForm").serialize(), function(data){
					if(data.status == 200){	
			            $('#M7110sListHJ').datagrid('loadData',data.data);
					}else{
						$.messager.alert('提示',data.msg);
					}
				});
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
		
		onBeforeLoadM7110s();
	}
	
	/* 重置表单 */
	function clearM7110sForm(){
		$('#M7110sForm').form('reset');
	}
	
	 var toolbarM7110s = [{
	    	text : '导出EXCEL',
	        iconCls : 'icon-save',
	        handler : function() {
	        	//获取后台传递参数className methodName
				var className = $("#M7110sList").datagrid("getData").className;
				var methodName = $("#M7110sList").datagrid("getData").methodName;
				/**
				 * datagrid属性中获取不到className、methodName时,需要从隐藏域中获取；
				 * 主要是查询时,datagrid属性className、methodName会丢失
				 */
				if(className == "" || className==null || className == undefined){
					className = $('#classNameM7110s').val();
				}
				if(methodName == "" || methodName==null || methodName == undefined){
					methodName = $('#methodNameM7110s').val();
				}
				//获取表头信息
				var header = $("#M7110sList").datagrid("options").columns[0];
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
				mapParam.set("excelName","产成品销售出库报表统计");
				mapParam.set("loginUserId",$("#user_id").html());
				mapParam.set("rows","5000");
				mapParam.set("page","1");
				//查询条件 把所有查询条件带上
				mapParam.set("prodCustomer", $('#prodCustomerM7110s').val());
				mapParam.set("contractType",$('#contractTypeM7110s').combobox("getValue"));
				mapParam.set("prodNorm", $('#prodNormM7110s').val());
				mapParam.set("prodMaterial",$('#prodMaterialM7110s').combobox("getValue"));
				mapParam.set("prodName", $('#prodNameM7110s').val());
				mapParam.set("prodLength", $('#prodLengthM7110s').numberbox("getValue"));
				mapParam.set("startDate",$('#startDateM7110s').datebox("getValue"));
				mapParam.set("endDate",$('#endDateM7110s').datebox("getValue"));
				BSL.toExcel(mapParam);
	        }
	    }];
    
</script>