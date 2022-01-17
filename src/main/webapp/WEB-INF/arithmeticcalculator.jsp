<%-- 
    Document   : arithmeticcalculator
    Created on : Jan. 17, 2022, 12:20:54 a.m.
    Author     : Jin-young Park
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <label for="first">First: </label>
            <input type="number" name="first" id="first" value="${first}"><br>
            <label for="second">Second: </label>
            <input type="number" name="second" id="second" value="${second}"><br>
            
           
            <button type="submit" name="calculation" value="plus">+</button>
            <button type="submit" name="calculation" value="minus">-</button>
            <button type="submit" name="calculation" value="times">*</button>
            <button type="submit" name="calculation" value="remainders">%</button>
        </form>
        
        <p><label for="result">Result: </label>${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
