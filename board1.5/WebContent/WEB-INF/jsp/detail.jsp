<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Page</title>
</head>
<body>
	<div>
		<a href="/list">리스트로 돌아가기</a>
		
		<a href="/del?i_board=${param.i_board}"><button>삭제</button></a>
		
		<a href="/update?i_board=${param.i_board}"><button>수정</button></a>
	</div>
	<div>
		<h1>글 번호 : ${param.i_board}</h1>
		<h1>글 번호 : ${data.i_board}</h1>
	</div>
	<div><h3>타이틀 : ${data.title}</h3></div>
	<div>-----------------------------</div>
	<div>${data.ctnt}</div>
</body>
</html>





