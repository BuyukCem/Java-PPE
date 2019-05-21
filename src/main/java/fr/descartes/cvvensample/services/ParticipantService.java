package fr.descartes.cvvensample.services;

import java.util.List;
import java.util.Objects;
import org.hibernate.SessionFactory;
import fr.descartes.cvvensample.dao.Participant;
import javax.persistence.Query;
import org.hibernate.Session;

public class ParticipantService {
	
	private final SessionFactory sessionFactory;
    
	public ParticipantService(SessionFactory sessionFactory) {
		this.sessionFactory = Objects.requireNonNull(sessionFactory);
	}

  
	/**
	 * Méthode permettant d'insérer un {@link Participant} en base de données.
	 * 
	 * @param Participant
	 * Objet {@link Participant} devant être inséré en base de données.
	 */
	public void insertParticipant(Participant participant) {
            Session session= sessionFactory.openSession();
   
            try {
                session.save(participant);
                session.beginTransaction().commit();
                session.close();
            } catch (Exception e) {
                session.beginTransaction().rollback();
                e.printStackTrace();
            }
	}
	/**
	 * Méthode permettant d'obtenir tous les {@link Participant} présents en base de données.
	 * 
	 * @return
	 * 			Une liste d'objets {@link Participant}.
	 */
	public List<Participant> getAllParticipant(){
            Session session= sessionFactory.openSession();
            Query query = session.createSQLQuery("From Participant");
            return query.getResultList();
	}
	
	/**
	 * Méthode permettant de mettre à jour un {@link Participant}.
	 * 
	 * @param Participant
	 * 			Un {@link Participant} présent en base de données qui doit être mis à jour.
	 */
        
	public void updateParticipant(Participant participant) {
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            try {
                session.beginTransaction().commit();
                session.update(participant);
                session.close();
                
            } catch (Exception e) {
                session.beginTransaction().rollback();
                e.printStackTrace();
            }
	}
	/**
	 * Méthode permettant de supprimer un {@link Participant} en base de données.
	 * 
	 * @param Participant
	 * 			Un objet {@link Participant} présent en base de données.
	 */
	public void deleteParticipant(Participant participant) {
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            session.delete(participant);
            session.close();      
	}
	/**
	 * Méthode permettant de supprimer un {@link Participant} identifié par son id en base de données.
	 * 
	 * @param numParticipant
	 * 			Numéro du {@link Participant} à supprimer en base de données.
	 */

	public void deleteParticipant(int numParticipant) {
                    Session session = sessionFactory.openSession();
                    session.beginTransaction();
            try {
                   
                    Participant part1=session.get(Participant.class, numParticipant); 
                     
                    session.delete(part1);
                     
            } catch (Exception e) {
              session.beginTransaction().rollback();
              e.printStackTrace();
              
            }finally{
                session.close();
            }
	}

}
