<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form:form action="memberLogin.do" method="post" modelAttribute="memberVO">
			<table>
				<tr>
					<td>ID</td>
					<td><form:input path="id"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="passwd"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="로그인"></td>
					<td><input type="reset" value="리셋"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>