<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
	<%@taglib  uri="http://www.springframework.org/tags/form" prefix="f" %>  

<html>
<head>

  <meta charset="UTF-8">

  <title>CodePen - Login</title>

    <link rel="stylesheet" href="resources/css/stylelogin.css">

</head>

<body>

  <div class="container">

  <div id="login-form">

    <h3>Login</h3>

    <fieldset>

      <f:form action="login.html" method="post" modelAttribute="agent">

        <input type="email" name="email_agent" placeholder="Email" required="required" value="" onBlur="if(this.value=='')this.value='Email'" onFocus="if(this.value=='Email')this.value='' "> <!-- JS because of IE support; better: placeholder="Email" -->

        <input type="password" name="password_agent" placeholder="Password" required="required"  value="" onBlur="if(this.value=='')this.value='Password'" onFocus="if(this.value=='Password')this.value='' "> <!-- JS because of IE support; better: placeholder="Password" -->

        <input type="submit" value="Login">

        <footer class="clearfix">

          

        </footer>

      </f:form>

    </fieldset>

  </div> <!-- end login-form -->

</div>

</body>
</html>