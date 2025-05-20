<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
</head>
<body>
	<h2>Servlet Test</h2>
	<form action="contact" method="post">
		氏名 <input type="text" name="name" required><br> <br>
		会社 <input type="text" name="conpany"><br> <br>
		メールアドレス <input type="email" name="email" required><br> <br>
		お問合せ内容<br>
		<textarea id="QnA" name="qna"></textarea><br> <br>
		
		<lable>メルマガ種類 <br>
		<input type="checkbox" name = "option" value ="総合案内">総合案内<br>
		<input type="checkbox" name = "option" value ="セミナー案内">セミナー案内<br>
		<input type="checkbox" name = "option" value ="求人採用情報">求人採用情報<br>
		</lable>
		<br>
		<br>
		
		<lable> 資料請求希望<br>
		YES<input type="radio" name="Btn" value = "Yes">
		NO<input type="radio"name="Btn" value = "No">
		</lable><br><br> 
		<input type="submit" value="送信">
		
	</form>

</body>
</html>