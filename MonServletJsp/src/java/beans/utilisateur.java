/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author tddiarra
 */
public class utilisateur {
    private String nom;
    private String prenom;
    private String email;
    private String pseudo;
    private String mot2passe;
    private String mot2passe2;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMot2passe(String mot2passe) {
        this.mot2passe = mot2passe;
    }

    public void setMot2passe2(String mot2passe2) {
        this.mot2passe2 = mot2passe2;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMot2passe() {
        return mot2passe;
    }

    public String getMot2passe2() {
        return mot2passe2;
    }

    public utilisateur() {
    }

    public utilisateur(String nom, String prenom, String email, String pseudo, String mot2passe, String mot2passe2) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.pseudo = pseudo;
        this.mot2passe = mot2passe;
        this.mot2passe2 = mot2passe2;
    }
    
    
}
