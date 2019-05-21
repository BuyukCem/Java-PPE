package fr.descartes.cvvensample.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.swing.JTextField;


/*
 * TODO :
 * Rendre la classe Evenement persistante avec les annotations de Hibernate.
 */
@Entity
@Table(name="Evenement")//Indique le nom de la table dans la base de données
public class Evenement {
	@Id//Indique qu'il s'agit de la clé primaire
        @GeneratedValue(strategy=GenerationType.AUTO)//Indique comment la clé doit être généré
        @Column(name="num_even")//Colonne Sql à utiliser
        private int num_even;
        
        @Column(name="intitule")
        private String intitule;
        
        @Column(name="theme")
        private String theme;
        
        @Column(name="date_debut")
        private String  date_debut;
        
        @Column(name="duree")
        private String  duree;
        
        @Column(name="nb_part_max")
        private String  nb_part_max;
        
        @Column(name="decription")
        private String  decription;
        
        @Column(name="organisateur")
        private String organisateur;
        
        @Column(name="type_even")
        private Type_Evenement type_evenement;
        
        @OneToMany(mappedBy = "evenement")
        private List<Participant> participants = new ArrayList();
       
        
    public Evenement(){
    }    
    public Evenement(int num_even, String intitule, String theme, String date_debut, String duree, String nb_part_max, String decription, String organisateur, Type_Evenement type_even) {
        this.num_even = num_even;
        this.intitule = intitule;
        this.theme = theme;
        this.date_debut = date_debut;
        this.duree = duree;
        this.nb_part_max = nb_part_max;
        this.decription = decription;
        this.organisateur = organisateur;
        this.type_evenement = type_even;
    }
    
    public Evenement(JTextField TexteFieldIntitule, JTextField TexteFieldTheme, JTextField TexteFieldDateDebut, JTextField jComboBox1, JTextField TexteFieldDescription, JTextField TexteFieldOrganisateur) {
        this.intitule = TexteFieldIntitule.getText();
        this.theme = TexteFieldTheme.getText();
        this.date_debut = TexteFieldDateDebut.getText();
        this.duree = jComboBox1.getText();
        this.decription = TexteFieldDescription.getText();
        this.organisateur = TexteFieldOrganisateur.getText();
    }
  
    public int getNum_even() {
        return num_even;
    }

    public String getIFRntitule() {
        return intitule;
    }

    public String getTheme() {
        return theme;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public String getDuree() {
        return duree;
    }

    public String getNb_part_max() {
        return nb_part_max;
    }

    public String getDecription() {
        return decription;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public Type_Evenement getType_evenement() {
        return type_evenement;
    }

    public void setNum_even(int num_even) {
        this.num_even = num_even;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setNb_part_max(String nb_part_max) {
        this.nb_part_max = nb_part_max;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public void setOrganisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public void setType_even(Type_Evenement type_even) {
        this.type_evenement = type_even;
    }
    public void setType_evenement(Type_Evenement type_evenement) {
        this.type_evenement = type_evenement;
}

    @Override
    public String toString() {
        return "Evenement{" + "num_even=" + num_even + ", intitule=" + intitule + ", theme=" + theme + ", date_debut=" + date_debut + ", duree=" + duree + ", nb_part_max=" + nb_part_max + ", decription=" + decription + ", organisateur=" + organisateur + ", type_even=" + type_evenement + '}';
    }
    
        
        
        

}
