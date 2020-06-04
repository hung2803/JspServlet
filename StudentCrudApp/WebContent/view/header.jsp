
<%
	String session_userName = (String) session.getAttribute("userName");
%>
<div style="float: left">
	<%
		if (session_userName != null) {
	%>
	<a href="${pageContext.request.contextPath }">Add</a> 
	<a href="${pageContext.request.contextPath}/listing">List</a>
	<%
		}
	%>
</div>


<div style="float: right">
	<%
		if (session_userName != null) {
	%>
	<a href="${pageContext.request.contextPath }/login">login</a> 
	<a href="${pageContext.request.contextPath }">logout</a>
	<%
		}
	%>
</div>