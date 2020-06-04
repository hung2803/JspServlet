<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- fn:contains() -->
	<c:set var="String" value="Hưng" />

	<c:if test="${fn:contains(String, 'g')}">
		<p>Tên : Hưng (phân biệt chữ hoa)
		<p>
	</c:if>
	<!-- fn:containsIgnoreCase() -->
	<c:if test="${fn:containsIgnoreCase(String, 'HƯNG')}">
		<p>Tên : Hưng (Không phân biệt chữ hoa chữ thường)
		<p>
	</c:if>

	<c:set var="string1" value="It is first String." />
	<c:set var="string2" value="It is <h1>second String.</h1>" />
	<!-- fn:escapeXml() -->
	<p>thoát file xml:</p>
	<p>string-1 : ${fn:escapeXml(string1)}</p>
	<p>string-2 : ${fn:escapeXml(string2)}</p>

	<p>có file xml:</p>
	<p>string-1 : ${string1}</p>
	<p>string-2 : ${string2}</p>

	<%-- <p>Index-1 : ${fn:indexOf(string1, "first")}</p>
	<p>Index-2 : ${fn:indexOf(string2, "String")}</p> --%>

	<c:set var="msg" value="The Example of JSTL fn:startsWith() Function" />
	Chuỗi bắt đầu "The": ${fn:startsWith(msg, 'The')}
	<br>Chuỗi bắt đầu "Example": ${fn:startsWith(msg, 'Example')}

	<c:set var="str1" value="Welcome-to-JSP-Programming." />
	<c:set var="str2" value="${fn:split(str1, '-')}" />
	<c:set var="str3" value="${fn:join(str2, ' ')}" />

	<p>String-3 : ${str3}</p>
	<c:set var="str4" value="${fn:split(str3, ' ')}" />
	<c:set var="str5" value="${fn:join(str4, '/')}" />

	<p>String-5 : ${str5}</p>


	<c:set var="string" value="This is the first string." />
	${fn:substring(string, 4, 17)}

	<c:set var="author" value="Ramesh Kumar" />
	<c:set var="string" value="pqr xyz abc PQR" />
	${fn:replace(author, "Ramesh", "Suresh")} ${fn:replace(string, "pqr", "hello")}
</body>
</html>