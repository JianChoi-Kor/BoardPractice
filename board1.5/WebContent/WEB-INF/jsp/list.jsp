<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Page</title>
</head>
<body>
	<h1>글 리스트</h1>
	<div><a href="/write"><button>글쓰기</button></a></div>
	<div>
		<table>
			<tr>
				<td>글 번호</td>
				<td>제목</td>
				<td>작성일자</td>
			</tr>
		<c:forEach items="${requestScope.list}" var="item">	
			<tr>
				<td>${pageScope.item.i_board}</td>
				<td><a href="/detail?i_board=${pageScope.item.i_board}">${pageScope.item.title}</a></td>
				<td>${pageScope.item.r_dt}</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>

