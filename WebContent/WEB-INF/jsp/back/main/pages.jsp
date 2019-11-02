<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
			function jumpPage(pages) {
				$("#pages").val(pages);
				$("#pageForm").attr({"method":"post","action":"${url}"});
				$("#pageForm").submit();
			}
		</script>
		<form id="pageForm" >
			<input type="hidden" id="pages" name="pages">
			<input type="hidden" name="user_name" value="${user.user_name }">
				<input type="hidden" name="account" value="${user.account }">
			<div class="dataTables_wrapper">
				<div class="dataTables_info" id="DataTables_Table_0_info"
					role="status" aria-live="polite">当前第<font color="red">${pages }</font>页，共<font color="green">${sumPage }</font>页</div>
				<div class="dataTables_paginate paging_simple_numbers"
					id="DataTables_Table_0_paginate">
					<a class="paginate_button previous disabled"
						aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0" onclick="jumpPage(1)"
						id="DataTables_Table_0_previous" >首页</a>
						<a
						class="paginate_button next disabled"
						aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0" onclick="jumpPage(${(pages-1>0)?(pages-1):1})"
						id="DataTables_Table_0_next">上一页</a>
						<a
						class="paginate_button next disabled"
						aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0" onclick="jumpPage(${(pages+1>sumPage)?sumPage:(pages+1)})"
						id="DataTables_Table_0_next">下一页</a>
						<a class="paginate_button previous disabled" 
						aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0" onclick="jumpPage(${sumPage})"
						id="DataTables_Table_0_previous">尾页</a>
				</div>
			</div>																	
		</form>