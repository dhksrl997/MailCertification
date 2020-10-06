<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="/css/Login.css">
</head>

<body>
    <section class="form-section">
        <form class="Login-form" action="CheckLogin" method="POST">
            <input type="text" name="id" placeholder="ID" class="id">
            <input type="password" name="password" placeholder="PW" class="pw">
            <input type="submit" value="로그인" class="login-btn">
            <input type="button" value="회원가입" class="Join-btn" onclick="location.href='join'">
        </form>
    </section>
</body>

</html>