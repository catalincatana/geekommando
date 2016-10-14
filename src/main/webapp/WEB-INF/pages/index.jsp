<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>	Geekommando</title>
    <meta name="description" content="Geekommando" >
    <meta name="author" content="Jewel Theme">


</head>
<body>
<h2>Application Management Rocks because of:</h2>
<form:form method="POST" action="/" commandName="userForm">
    <table>
        <tr>
            <td>State your Name MyLord:</td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

