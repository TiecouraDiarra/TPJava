<%-- 
    Document   : Inscrire
    Created on : 22 juil. 2022, 16:50:02
    Author     : tddiarra
--%>

<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./dossierCss/style.css">
        <title>JSP Page</title>
    </head>
    <body>
    <Center>
        <fieldset>
            <h1>Bienvenu dans le formulaire d'inscription</h1>
            <hr>
            <%
                String erreur = (String) request.getAttribute("erreur");
                if(erreur !=null){
                 %>
            
                 <h3 class="erreur"><%out.print(erreur);%></h3>
            <%   
                }
                
            %>
            
            <form action="monServlet" method="post">
                <div id="sp">
                    <label for="">Nom</label>
                    <input type="text" name="nom" value="" size="30"/>
                </div>
                <div id="sp">
                    <label for="">Prenom</label>
                    <input type="text" name="prenom" value="" size="30"/>
                </div>
                <div id="sp">
                    <label for="">Speudo</label>
                    <input type="text" name="pseudo" value="" size="30"/>
                </div>
                <div id="sp">
                    <label for="">E-mail</label>
                    <input type="email" name="email" value="" size="30" />
                </div>
                <div id="sp">
                    <label for="">Mot de passe</label>
                    <input type="password" name="mot2passe" value="" size="30" />
                </div>
                <div id="sp">
                    <label for="">Comfirmer MDP</label>
                    <input type="password" name="mot2passe2" value="" size="30" />
                </div>
                <br>
                <div id="sp">
                    <label for="">&nbsp;</label>
                    <input type="submit" id="valider" name="valider" value="Valider" />
                </div>
            </form>
        </fieldset>
        </Center>
        
        <style>
            body{
                padding: 0px;
                margin: 0px;
            }
            fieldset{
                margin-top: 70px;
                width: 50%;
                background-color: #318CE7;
                box-shadow: 5px 5px 20px 1px 10px rgb(85, 85, 85);
                border: 0px;
                padding-left: 10px;
                border-radius: 10px 10px 10px 10px;
                color: white;
                height: 430px
            }
            td{
                letter-spacing: 1px;
            }
            h1{
                font-family: andalus;
                letter-spacing: 3px;
                text-align: center;
                color: white;
            }
            hr{
                border: 3px solid white;
                border-radius: 10px;
                width: 60%;
                margin-bottom: 20px;
            }
            #valider{
                margin: 20px 35px;
                color: #318CE7;
                background-color: white;
                width: 80%;
                font-size: 17px;
                border-radius: 20px;
                border: 1px solid white;
            }
            #valider:hover{
                color: white;
                background-color: white;
            }
            .erreur{
                color: red;
            }
        </style>
</body>
</html>
