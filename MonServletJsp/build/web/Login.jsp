<%-- 
    Document   : Login
    Created on : 23 juil. 2022, 13:35:40
    Author     : tddiarra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="../dossierCss/style.css">
    </head>
    <body>
        <fieldset>
           <legend class="btn">Utilisateur</legend>
           <br>
           <form action="Acceuil.jsp" method="post" class="container">
                <div id="sp" >
                    <label for="" >Pseudo</label>
                    <input type="text" name="pseudo" value="" size="30"/>
                </div>
               <br>
                <div id="sp" >
                    <label for="" >Mot de passe</label>
                    <input type="text" name="password" value="" size="30"/>
                </div>
               <br>
               <div id="sp" >
                   <input type="submit" name="password" value="Connexion" size="30"/>
                </div>
           </form>
        </fieldset>
    </body>
</html>
