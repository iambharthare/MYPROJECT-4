<%@page import="in.co.rays.proj4.model.RoleModel"%>
<%@page import="in.co.rays.proj4.util.HTMLUtility"%>
<%@page import="in.co.rays.proj4.controller.RoleListCtl"%>
<%@page import="in.co.rays.proj4.controller.BaseCtl"%>
<%@page import="in.co.rays.proj4.bean.RoleBean"%>
<%@page import="in.co.rays.proj4.util.ServletUtility"%>
<%@page import="in.co.rays.proj4.util.HTMLUtility"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<html>
<head>
<link rel="icon" type="image/png"
	href="<%=ORSView.APP_CONTEXT%>/img/logo.png" sizes="16*16" />
<title>Role List</title>

<script src="<%=ORSView.APP_CONTEXT%>/js/jquery.min.js""></script>
<script src="<%=ORSView.APP_CONTEXT%>/js/Checkbox11.js"></script>
</head>
<body>
	<jsp:useBean id="bean" class="in.co.rays.proj4.bean.RoleBean"
		scope="request"></jsp:useBean>


	<%@include file="Header.jsp"%>
	<%
		List slist = (List) request.getAttribute("name");
	%>

	<center>
		<h1>Role List</h1>

		<form action="<%=ORSView.ROLE_LIST_CTL%>" method="post">
			<tr>
				<h2>
					<td colspan="8"><font color="green"><%=ServletUtility.getSuccessMessage(request)%></font></td>

					<td colspan="8"><font color="red"><%=ServletUtility.getErrorMessage(request)%></font></td>
				</h2>

			</tr>
			<table width="100%">
				<tr>
					<td align="center"><label>Name :</label> <%=HTMLUtility.getList("fname", String.valueOf(bean.getID()), slist)%>
						<input type="submit" name="operation"
						value="<%=RoleListCtl.OP_SEARCH%>"> <input type="submit"
						name="operation" value="<%=RoleListCtl.OP_RESET%>"></td>
					</td>
				</tr>
			</table>
			<table border="1" width="100%" align="center" cellpadding=6px
				cellspacing=".2">
				<tr align="center">
					<th><input type="checkbox" id="select_all">Select All</th>
					<th>S.No.</th>
					<!--   <th>Id</th> -->
					<th>Name</th>
					<th>Description</th>
					<th>Edit</th>
				</tr>


				<%
					int pageNo = ServletUtility.getPageNo(request);
					int pageSize = ServletUtility.getPageSize(request);
					int index = ((pageNo - 1) * pageSize) + 1;

					List list = ServletUtility.getList(request);
					Iterator<RoleBean> it = list.iterator();
					while (it.hasNext()) {
						RoleBean rb = it.next();
				%>
				<tr align="center">
					<td><input type="checkbox" class="checkbox" name="ids"
						value="<%=rb.getID()%>" <%if (rb.getID() == 1) {%>
						disabled="disabled" <%}%>></td>
					<td><%=index++%></td>
					<%--  <td><%=rb.getID()%></td> --%>
					<td><%=rb.getName()%></td>
					<td><%=rb.getDescription()%></td>
					<%
						if (rb.getID() == 1) {
					%>
					<td><a href="RoleCtl?id=<%=rb.getID()%>"
						onclick="return false;">Edit</a></td>
					<%
						} else {
					%><td><a href="RoleCtl?id=<%=rb.getID()%>">Edit</a></td>
					<%
						}
					%>
				</tr>
				<%
					}
				%>
			</table>
			<table width="100%">
				<tr>
					<%
						if (pageNo == 1) {
					%>
					<td><input type="submit" name="operation" disabled="disabled"
						value="<%=RoleListCtl.OP_PREVIOUS%>"></td>
					<%
						} else {
					%>
					<td><input type="submit" name="operation"
						value="<%=RoleListCtl.OP_PREVIOUS%>"></td>
					<%
						}
					%>

					<td><input type="submit" name="operation"
						value="<%=RoleListCtl.OP_DELETE%>"></td>
					<td><input type="submit" name="operation"
						value="<%=RoleListCtl.OP_NEW%>"></td>


					<%
						RoleModel model = new RoleModel();
					%>
					<%
						if (list.size() < pageSize || model.nextPK() - 1 == bean.getID()) {
					%><td align="right"><input type="submit" name="operation"
						disabled="disabled" value="<%=RoleListCtl.OP_NEXT%>"></td>
					<%
						} else {
					%>
					<td align="right"><input type="submit" name="operation"
						value="<%=RoleListCtl.OP_NEXT%>"></td>
					<%
						}
					%>
				</tr>
			</table>
			<input type="hidden" name="pageNo" value="<%=pageNo%>"> <input
				type="hidden" name="pageSize" value="<%=pageSize%>">
		</form>
	</center>
	<%@include file="Footer.jsp"%>
</body>
</html>