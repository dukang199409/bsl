<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
	<div class="easyui-panel" title="产成品库存日报表统计" style="padding:10px 10px 10px 10px">
		<form id="M7106sForm" class="itemForm" method="post">
		   <table>
		   		 <tr>
		            <td width="120" align="right">规格:</td>
		            <td width="210" align="right">
	            		<input name="prodNorm" id="prodNormM7106s" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,40]'" style="width:200px;"></input>
	            	</td>
		            <td width="120" align="right">钢种:</td>
		            <td width="210" align="right">
		            	<select name="prodMaterial" id="prodMaterialM7106s" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
				          <option value="">请选择...</option>
				           <c:forEach items="${prodMaterialList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
						</select>
					</td>
		        </tr>
		         <tr>	
		            <td width="120" align="right">客户:</td>
		            <td width="210" align="right">
		            	<input name="prodCustomer" id="prodCustomerM7106s" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,120]'" style="width:200px;" maxLength="10"></input>
		            </td>
		        </tr>
		         <tr>
		            <td width="120" align="right">开始日期:</td>
		            <td width="210" align="right">
		            	<input name="startDate" id="startDateM7106s" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">结束日期:</td>
		            <td width="210" align="right">
		            	<input name="endDate" id="endDateM7106s" class="easyui-datebox" type="text" data-options="required:false" panelHeight="225px"  style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">页码:</td>
		            <td width="210" align="right">
		            	<input name="page" id="pageM7106s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">每页记录数:</td>
		            <td width="210" align="right">
		            	<input name="rows" id="rowsM7106s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>
		        <tr hidden="true">
		            <td width="120" align="right">类名:</td>
		            <td width="210" align="right">
		            	<input name="className" id="classNameM7106s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		            <td width="120" align="right">方法名:</td>
		            <td width="210" align="right">
		            	<input name="methodName" id="methodNameM7106s" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
		            </td>
		        </tr>			        
		    </table>
		</form>
		
		<div style="margin-top:10px" align="center">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="searchM7106sForm()">查询</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearM7106sForm()">重置</a>
		</div>
	</div>
	 <table class="easyui-datagrid" id="M7106sList" title="产成品库存日报表统计"  style="height:500px"
	       data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:true,method:'post',onBeforeLoad:onBeforeLoadM7106s,url:'/report/listM7106s',pageSize:30,toolbar:toolbarM7106s">
	    <thead>
	        <tr>
	        	<th data-options="field:'prodNorm',width:125">产品规格</th>
	        	<th data-options="field:'prodLength',width:80,sortable:true">定尺/米</th>
	            <th data-options="field:'prodMaterial',width:125,formatter:BSL.formatProdMaterial">钢种</th>
	            <th data-options="field:'prodRuZnum',width:100">产品入库支数</th>
	            <th data-options="field:'prodRuBnum',width:100">产品入库包数</th>
	            <th data-options="field:'prodRuWeight',width:125">产品入库重量/吨</th>
	            <th data-options="field:'prodOutZnum',width:100">产品出库支数</th>
	            <th data-options="field:'prodOutBnum',width:100">产品出库包数</th>
	            <th data-options="field:'prodOutWeight',width:125">产品出库重量/吨</th>
	            <th data-options="field:'prodAtZnum',width:100">产品库存支数</th>
	            <th data-options="field:'prodAtBnum',width:100">产品库存包数</th>
	            <th data-options="field:'prodAtWeight',width:125">产品出库重量/吨</th>
	            <th data-options="field:'prodCustomer',width:125">客户</th>
	            <th data-options="field:'remark',width:125">备注</th>
	        </tr>
	    </thead>
	</table>
	 <table class="easyui-datagrid" id="M7106sListHJ" title="产成品库存日报表合计"  style="height:90px"
	       data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:false,method:'post',onBeforeLoad:onBeforeLoadM7106s">
	    <thead>
	        <tr>
	        	<th data-options="field:'ck',checkbox:true"></th>
	        	<th data-options="field:'prodHJ',width:125">合计</th>
	            <th data-options="field:'prodNormHJ',width:125">规格总数量</th>
	            <th data-options="field:'prodRuZnum',width:100">产品入库总支数</th>
	            <th data-options="field:'prodRuBnum',width:100">产品入库总包数</th>
	            <th data-options="field:'prodRuWeight',width:125">产品入库总重量/吨</th>
	            <th data-options="field:'prodOutZnum',width:100">产品出库总支数</th>
	            <th data-options="field:'prodOutBnum',width:100">产品出库总包数</th>
	            <th data-options="field:'prodOutWeight',width:125">产品出库总重量/吨</th>
	            <th data-options="field:'prodAtZnum',width:100">产品库存总支数</th>
	            <th data-options="field:'prodAtBnum',width:100">产品库存总包数</th>
	            <th data-options="field:'prodAtWeight',width:125">产品库存总重量/吨</th>
	        </tr>
	    </thead>
	</table>
</div>
<script>

	function onBeforeLoadM7106s(){
		var queryParams = $('#M7106sList').datagrid('options').queryParams;
		queryParams.prodNorm = $('#prodNormM7106s').val();
		queryParams.prodMaterial = $('#prodMaterialM7106s').combobox("getValue");
		queryParams.prodCustomer = $('#prodCustomerM7106s').val();
		queryParams.startDate = $('#startDateM7106s').datebox("getValue");
		queryParams.endDate = $('#endDateM7106s').datebox("getValue");
	}

	//查询按钮
	function searchM7106sForm(){
		//page页码
		var page = $("#M7106sList").datagrid('options').pageNumber;
		//rows每页记录条数  
        var rows = $("#M7106sList").datagrid('options').pageSize; 
		$("#pageM7106s").textbox('setValue',page);
		$("#rowsM7106s").textbox('setValue',rows);
		//ajax的post方式提交表单
		//$("#receiptSearchForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/report/listM7106s",$("#M7106sForm").serialize(), function(data){
			if(data.status == 200){				
	            $('#M7106sList').datagrid('loadData',  {"total":data.total,"rows":data.rows});
	            $("#classNameM7106s").textbox('setValue',data.className);
				$("#methodNameM7106s").textbox('setValue',data.methodName);
				$.post("/report/listM7106sHJ",$("#M7106sForm").serialize(), function(data){
					if(data.status == 200){	
			            $('#M7106sListHJ').datagrid('loadData',data.data);
					}else{
						$.messager.alert('提示',data.msg);
					}
				});
			}else{
				$.messager.alert('提示',data.msg);
			}
		});
		
		onBeforeLoadM7106s();
	}
	
	/* 重置表单 */
	function clearM7106sForm(){
		$('#M7106sForm').form('reset');
	}
	
	 var toolbarM7106s = [{
	    	text : '导出EXCEL',
	        iconCls : 'icon-save',
	        handler : function() {
	        	//获取后台传递参数className methodName
				var className = $("#M7106sList").datagrid("getData").className;
				var methodName = $("#M7106sList").datagrid("getData").methodName;
				/**
				 * datagrid属性中获取不到className、methodName时,需要从隐藏域中获取；
				 * 主要是查询时,datagrid属性className、methodName会丢失
				 */
				if(className == "" || className==null || className == undefined){
					className = $('#classNameM7106s').val();
				}
				if(methodName == "" || methodName==null || methodName == undefined){
					methodName = $('#methodNameM7106s').val();
				}
				//获取表头信息
				var header = $("#M7106sList").datagrid("options").columns[0];
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
				mapParam.set("excelName","产成品库存报表统计");
				mapParam.set("loginUserId",$("#user_id").html());
				mapParam.set("rows","5000");
				mapParam.set("page","1");
				//查询条件 把所有查询条件带上
				mapParam.set("prodNorm", $('#prodNormM7106s').val());
				mapParam.set("prodMaterial",$('#prodMaterialM7106s').combobox("getValue"));
				mapParam.set("prodCustomer",$('#prodCustomerM7106s').val());
				mapParam.set("startDate",$('#startDateM7106s').datebox("getValue"));
				mapParam.set("endDate",$('#endDateM7106s').datebox("getValue"));
				BSL.toExcel(mapParam);
	        }
	    }];
    
</script>