<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
table {
	border: 1px solid blue;
}
</style>

</head>
<body>
	<table border="1">
		<tr>
			<th>id</th>
			<th>이름</th>
			<th>메시지</th>
		</tr>
		<c:choose>
			<c:when test="${result.size() != 0}">
				<c:forEach var="tmp" items="${result}">
					<tr>
						<td>${tmp.message_id}</td>
						<td>${tmp.name}</td>
						<td>${tmp.message}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td>표시할 내용이 없습니당!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>