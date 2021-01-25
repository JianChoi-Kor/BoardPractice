<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write Page</title>
</head>
<body>
	<div>
		<h1>글쓰기</h1>
	</div>
	<form action="/write" method="post">
		<div><input type="text" name="title" placeholder="제목"></div>
		<div><textarea name="ctnt" maxlength="2048"></textarea></div>
		<div>
			<input type="submit" value="글 등록">
			<input type="reset" value="다시 쓰기">
		</div>
	</form>
</body>
</html>