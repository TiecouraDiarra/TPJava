/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serletDossier;

import beans.utilisateur;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tddiarra
 */
public class monServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     */
    List<utilisateur> liste = new ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("valider") != null) {
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String email = request.getParameter("email");
            String pseudo = request.getParameter("pseudo");
            String mot2passe = request.getParameter("mot2passe");
            String mot2passe2 = request.getParameter("mot2passe2");
            if (nom.equals("") || prenom.equals("") || email.equals("") || pseudo.equals("") || mot2passe.equals("") || mot2passe2.equals("")) {
                 request.setAttribute("erreur", "Veuillez renseigner tous les champs");
                this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
            } else {
               
                if (mot2passe.equals(mot2passe2)) {

                    utilisateur u1 = new utilisateur(nom, prenom, email, pseudo, mot2passe, mot2passe2);
                    liste.add(u1);

                    request.setAttribute("liste", liste);
                    request.setAttribute("nom", nom);
                    request.setAttribute("prenom", prenom);

                    this.getServletContext().getRequestDispatcher("/Acceuil.jsp").forward(request, response);
                    //request.getRequestDispatcher("/Acceuil.jsp").forward(request, response);

                } else {
                    request.setAttribute("erreur", "Les deux mots de passe sont les même");
                    this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
                }
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
