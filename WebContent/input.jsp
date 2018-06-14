<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script>
	$(document).ready(function(){
		$("#back").click(function(){
			$(location).attr("href","index.jsp");
		})
	})

</script>

</head>
<body>
	<form action="input.do">
		이름 : <input type="text" placeholder="이름을 입력하세요" name="name"><br>
		메시지 : <input type="text" placeholder="메시지를 입력하세요" name="message"><br>
		<input type="submit" vlaue="전송">
		<input type="button" value="뒤로가기" id="back">		
	</form>
</body>
</html>