<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<div class="easyui-panel" title="成型机组生产报表统计" style="padding:10px 10px 10px 10px">
		<form id="M7108sForm" class="itemForm" method="post">
		   <table>
		   		 <tr>
		            <td width="120" align="right">产品规格:</td>
		            <td width="210" align="right">
	            		<input name="prodNorm" id="prodNormM7108s" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,40]'" style="width:200px;"></input>
	            	</td>
		            <td width="120" align="right">钢种:</td>
		            <td width="210" align="right">
		            	<select name="prodMaterial" id="prodMaterialM7108s" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				          <option value="">请选择...</option>
				           <c:forEach items="${prodMaterialList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
						</select>
					</td>
		        </tr>
		        <tr>
		        	<td width="120" align="right">生产机组:</td>
		            	<td width="210" align="right">
		            	<select name="prodMakeJz" id="prodMakeJzM7108s" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				           <option value="">请选择...</option>
				          <c:forEach items="${prodUnitsSCList}" var="a">
				          	   	<option value="${a.enumKey}">${a.enumValue}</option>
				          </c:forEach>
						</select>
		            </td> 
		            <td width="120" align="right">生产班次:</td>
		            	<td width="210" align="right">
		            	<select name="prodBc" id="prodBcM7108s" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				           <option value="">请选择...</option>
				          <c:forEach items="${prodBcList}" var="a">
				          	   	<option value="${a.enumKey}">${a.enumValue}</option>
				          </c:forEach>
						</select>
		            </td> 
		        </tr>
		         <tr>
		        	<td width="120" align="right">产品定尺:</td>
		            <td width="210" align="right">
		            	<input name="prodLength" id="prodLengthM7108s" class="easyui-numberbox" type="text" data-options="required:false,min:0,precision:3,validType:'length[0,10]'"  style="width:200px;"></input>
		            </td>  
		        </tr>
		         <tr>
		            <td width="120" align="right">开始日期:</td>
		            <td width="210" align="right">
		            	<input name="startDate" id="startDateM7108s" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">结束日期:</td>
		            <td width="210" align="right">
		            	<input name="endDate" id="endDateM7108s" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">页码:</td>
		            <td width="210" align="right">
		            	<input name="page" id="pageM7108s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">每页记录数:</td>
		            <td width="210" align="right">
		            	<input name="rows" id="rowsM7108s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">类名:</td>
		            <td width="210" align="right">
		            	<input name="className" id="classNameM7108s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">方法名:</td>
		            <td width="210" align="right">
		            	<input name="methodName" id="methodNameM7108s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>			        
		    </table>
		</form>
		
		<div style="margin-top:10px" align="center">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="searchM7108sForm()">查询</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearM7108sForm()">重置</a>
		</div>
	</div>
	 <table class="easyui-datagrid" id="M7108sList" title="成型机组生产报表统计"  style="height:500px"
	       data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:true,method:'post',onBeforeLoad:onBeforeLoadM7108s,url:'/report/listM7108s',pageSize:30,toolbar:toolbarM7108s">
	    <thead>
	        <tr>
	        	<th data-options="field:'prodNorm',width:125">产品规格</th>
	        	<th data-options="field:'prodMakeJz',width:120,formatter:BSL.formatPlanJz,sortable:true">生产机组</th>
   				<th data-options="field:'prodBc',width:120,formatter:BSL.formatProdBcStatus,sortable:true">班次</th>
	            <th data-options="field:'prodMaterial',width:125,formatter:BSL.formatProdMaterial">钢种</th>
	            <th data-options="field:'prodLength',sortable:true,width:100">定尺</th>
	            <th data-options="field:'prodRuZnum',width:100">产品入库支数</th>
	            <th data-options="field:'prodRuBnum',width:100">产品入库包数</th>
	            <th data-options="field:'prodRuWeight',width:125">产品入库重量/吨</th>
	            <th data-options="field:'prodTouNum',width:100">投料盘数</th>
	            <th data-options="field:'prodTouWeight',width:125">投料重量/吨</th>
	            <th data-options="field:'ccrate',width:125">成材率</th>
	            <th data-options="field:'remark',width:125">备注</th>
	        </tr>
	    </thead>
	</table>
	 <table class="easyui-datagrid" id="M7108sListHJ" title="成型机组生产报表合计"  style="height:90px"
	       data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:false,method:'post',onBeforeLoad:onBeforeLoadM7108s">
	    <thead>
	        <tr>
	        	<th data-options="field:'ck',checkbox:true"></th>
	        	<th data-options="field:'prodHJ',width:125">合计</th>
	        	<th data-options="field:'prodNormHJ',width:125">规格总数量</th>
	        	<th data-options="field:'prodRuZnum',width:100">产品入库总支数</th>
	            <th data-options="field:'prodRuBnum',width:100">产品入库总包数</th>
	            <th data-options="field:'prodRuWeight',width:125">产品入库总重量/吨</th>
	            <th data-options="field:'prodTouNum',width:100">投料总盘数</th>
	            <th data-options="field:'prodTouWeight',width:125">投料总重量/吨</th>
	            <th data-options="field:'ccrate',width:125">合计成材率</th>
	        </tr>
	    </thead>
	</table>
</div>
<script>

	function onBeforeLoadM7108s(){
		var queryParams = $('#M7108sList').datagrid('options').queryParams;
		queryParams.prodNorm = $('#prodNormM7108s').val();
		queryParams.prodMaterial = $('#prodMaterialM7108s').combobox("getValue");
		queryParams.prodBc = $('#prodBcM7108s').combobox("getValue");
		queryParams.prodMakeJz = $('#prodMakeJzM7108s').combobox("getValue");
		queryParams.prodLength = $('#prodLengthM7108').numberbox("getValue");
		queryParams.startDate = $('#startDateM7108s').datebox("getValue");
		queryParams.endDate = $('#endDateM7108s').datebox("getValue");
	}

	//查询按钮
	function searchM7108sForm(){
		//page页码
		var page = $("#M7108sList").datagrid('options').pageNumber;
		//rows每页记录条数  
        var rows = $("#M7108sList").datagrid('options').pageSize; 
		$("#pageM7108s").textbox('setValue',page);
		$("#rowsM7108s").textbox('setValue',rows);
		//ajax的post方式提交表单
		//$("#receiptSearchForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/report/listM7108s",$("#M7108sForm").serialize(), function(data){
			if(data.status == 200){				
	            $('#M7108sList').datagrid('loadData',  {"total":data.total,"rows":data.rows});
	            $("#classNameM7108s").textbox('setValue',data.className);
				$("#methodNameM7108s").textbox('setValue',data.methodName);
				$.post("/report/listM7108sHJ",$("#M7108sForm").serialize(), function(data){
					if(data.status == 200){	
			            $('#M7108sListHJ').datagrid('loadData',data.data);
					}else{
						$.messager.alert('提示',data.msg);
					}
				});
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
		
		onBeforeLoadM7108s();
	}
	
	/* 重置表单 */
	function clearM7108sForm(){
		$('#M7108sForm').form('reset');
	}
	
	 var toolbarM7108s = [{
	    	text : '导出EXCEL',
	        iconCls : 'icon-save',
	        handler : function() {
	        	//获取后台传递参数className methodName
				var className = $("#M7108sList").datagrid("getData").className;
				var methodName = $("#M7108sList").datagrid("getData").methodName;
				/**
				 * datagrid属性中获取不到className、methodName时,需要从隐藏域中获取；
				 * 主要是查询时,datagrid属性className、methodName会丢失
				 */
				if(className == "" || className==null || className == undefined){
					className = $('#classNameM7108s').val();
				}
				if(methodName == "" || methodName==null || methodName == undefined){
					methodName = $('#methodNameM7108s').val();
				}
				//获取表头信息
				var header = $("#M7108sList").datagrid("options").columns[0];
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
				mapParam.set("excelName","成型机组生产报表统计");
				mapParam.set("loginUserId",$("#user_id").html());
				mapParam.set("rows","5000");
				mapParam.set("page","1");
				//查询条件 把所有查询条件带上
				mapParam.set("prodNorm", $('#prodNormM7108s').val());
				mapParam.set("prodMaterial",$('#prodMaterialM7108s').combobox("getValue"));
				mapParam.set("prodBc",$('#prodBcM7108s').combobox("getValue"));
				mapParam.set("prodMakeJz",$('#prodMakeJzM7108s').combobox("getValue"));
				mapParam.set("prodLength", $('#prodLengthM7108').numberbox("getValue"));
				mapParam.set("startDate",$('#startDateM7108s').datebox("getValue"));
				mapParam.set("endDate",$('#endDateM7108s').datebox("getValue"));
				BSL.toExcel(mapParam);
	        }
	    }];
    
</script>