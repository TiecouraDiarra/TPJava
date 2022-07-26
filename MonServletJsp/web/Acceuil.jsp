<%-- 
    Document   : Acceuil
    Created on : 22 juil. 2022, 16:50:20
    Author     : tddiarra
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String pseudoform = request.getParameter("pseudo");
        %>

        <h2> Bienvenue <%=pseudoform%></h2> 

        <table border=1 width="100%">
            <tr>
                <th>numero </th>
                <th>nom </th>
                <th>prenom </th>
                <th>email </th>
                <th>pseudo </th>
                <!--<th>mot2passe </th>
                 <th>pseudo </th>-->



            </tr>
            <!--variable simple pour stoquer un objet de liste d'ou cour et varstatut pour compter-->

            <c:forEach items="${liste}" var="cour"  varStatus="v">

                <tr>
                    <td>${v.count} </td>
                    <td>${cour.nom}</td>
                    <td>${cour.prenom}</td>
                    <td>${cour.email}</td>
                    <td>${cour.pseudo}</td>





                </tr>

            </c:forEach>
                
        </table>



        <form action="./servlet2" method="post">
            <br>
            <input type="submit" name="deconnecter" value="Deconnecter" />

        </form>



    </body>
</html>
