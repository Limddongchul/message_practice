<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
	<script>
		if(${result}>0){
			alert("입력이완료되었습니다.");
			location.href="index.jsp";
		}else{
			alert("입력에 실패하였습니다.");
			loaction.href="login.jsp";
		}
	</script>
</body>
</html>