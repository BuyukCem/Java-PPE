package fr.descartes.cvvensample.services;

import java.util.List;
import java.util.Objects;
import org.hibernate.SessionFactory;
import fr.descartes.cvvensample.dao.Evenement;
import javax.persistence.Query;
import org.hibernate.Session;

public class EvenementService {
	
	private final SessionFactory sessionFactory;
	
	public EvenementService(SessionFactory sessionFactory) {
		this.sessionFactory = Objects.requireNonNull(sessionFactory);
	}
	
	/**
	 * Méthode permettant d'insérer un {@link Evenement} en base de données.
	 * 
	 * @param evenement
	 * Objet {@link Evenement} devant être inséré en base de données.
	 */
	public void insertEvenement(Evenement evenement) {
	    Session session= sessionFactory.openSession();
                     
            try {
                session.save(evenement);
                session.beginTransaction().commit();
                session.close();
                
            } catch (Exception e) {
                session.beginTransaction().rollback();
                e.printStackTrace();
            }    
	}
	

	/**
	 * Méthode permettant d'obtenir tous les {@link Evenement} présents en base de données.
	 * 
	 * @return Une liste d'objets {@link Evenement}.
	 */
	public List<Evenement> getAllEvenement(){
	    Session session= sessionFactory.openSession();
            Query query = session.createSQLQuery("From Participant");
            return query.getResultList();
	}
	
	/**
	 * Méthode permettant de mettre à jour un {@link Evenement}.
	 * 
	 * @param evenement
	 * Un {@link Evenement} présent en base de données qui doit être mis à jour.
	 */
	public void updateEvenement(Evenement evenement) {
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            try {
                session.beginTransaction().commit();
                session.update(evenement);
                session.close();
                
            } catch (Exception e) {
                session.beginTransaction().rollback();
                e.printStackTrace();
            }
	}
	
	/**
	 * Méthode permettant de supprimer un {@link Evenement} en base de données.
	 * 
	 * @param evenement
	 * Un objet {@link Evenement} présent en base de données.
	 */
        
	public void deleteEvenement(Evenement evenement) {
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            session.delete(evenement);
            session.close(); 
	}
	
	 /**
	 * Méthode permettant de supprimer un {@link Evenement} identifié par son id en base de données.
	 * 
	 * @param numEvenement
	 *Numéro de l'{@link Evenement} à supprimer en base de données.
	 */
        
	public void deleteEvenement(int numEvenement) {
            
                    Session session = sessionFactory.openSession();
                    session.beginTransaction();
            try {
                   
                   Evenement part1=session.get(Evenement.class, numEvenement); 
                     
                    session.delete(part1);
                     
            } catch (Exception e) {
              session.beginTransaction().rollback();
              e.printStackTrace();
              
            }finally{
                session.close();
            }
            
            
	}

}
 			