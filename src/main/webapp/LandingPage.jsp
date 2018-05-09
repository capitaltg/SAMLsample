<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Success</title>
</head>
<body>
	<div align="center">
		<h2>LandingPage.jsp</h2>

		<h2>
			You are logged in as:
			<%@ page
				import="org.springframework.security.core.context.SecurityContextHolder"%>
			<%
				out.print(SecurityContextHolder.getContext().getAuthentication().getName());
			%>
		</h2>
		<h3>Note, testshib does not support urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress out of the box, so in this example, you will see a unique identifier instead of email address</h3>
	</div>
</body>
</html>