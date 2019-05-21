package fr.descartes.cvvensample.dao;

import javax.persistence.*;

/*
 * TODO :
 * Rendre la classe Participant persistante avec les annotations de Hibernate.
 */
@Entity
@Table(name="Participant")//Indique le nom de la table dans la base de données pas obligatioir
public class Participant {
    
        @Id//Indique qu'il s'agit de la clé primaire
        @GeneratedValue(strategy=GenerationType.IDENTITY)//Indique comment la clé doit être généré
        @Column(name="num_pers")//Colonne Sql à utiliser
        private int num_pers;
        
        @Column(name="nom")// ce n'est pas obligatoir il prent automatiquement le nom de la variable
        private String nom;
        
        @Column(name="prenom")
        private String prenom;
        
        @Column(name="email")
        private String email;
        
        @Column(name="date_naiss")
        private String  date_naiss;
        
        @Column(name="organisation")
        private String  organisation;
        
        @Column(name="observation")
        private String  observations;

    public Participant(){
    }   
    public Participant( String nom, String prenom, String email, String date_naiss, String organisation, String observations) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date_naiss = date_naiss;
        this.organisation = organisation;
        this.observations = observations;
    }

    public int getNum_pers() {
        return num_pers;
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

    public String getDate_naiss() {
        return date_naiss;
    }

    public String getOrganisation() {
        return organisation;
    }

    public String getObservations() {
        return observations;
    }

    public void setNum_pers(int num_pers) {
        this.num_pers = num_pers;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Participant{" + "num_pers=" + num_pers + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", date_naiss=" + date_naiss + ", organisation=" + organisation + ", observations=" + observations + '}';
    }
       
	
}
