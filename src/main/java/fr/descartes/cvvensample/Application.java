 package fr.descartes.cvvensample;

import fr.descartes.ccvensample.swing.ApplicationWindow;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Application {
        public static void main( String[] args ){
              //  ParticipantService serv1 = new ParticipantService(getSessionFactory());
              // Participant p1=new Participant("BUYUK","cem","cembuyuk7@gmail.com","01/09/98","descartes","rien");
              // Participant p2=new Participant("hdf","sqdf","cembuyuk7@gmail.com","01/09/98","descartes","rien");
  
               //serv1.insertParticipant(p2);
                
           ApplicationWindow Fenetre = new ApplicationWindow();
           Fenetre.setVisible(true);
	}
	private static SessionFactory createSessionFactory() {
		/*
		 * TODO : Faites en sorte d'obtenir un objet SessionFactory (astuce : Lire la doc -> http://docs.jboss.org/hibernate/orm/5.4/quickstart/html_single/)
		 */
                final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
                try {
                  //return = new Configuration().configure().buildSessionFactory();
                  return new MetadataSources( registry ).buildMetadata().buildSessionFactory();
                          
               } catch (Throwable th) {
                    System.err.println("Enitial SessionFactory creation failed" + th);
                    throw new ExceptionInInitializerError(th);
              }
 
	}
	private static void closeSessionFactory(SessionFactory sessionFactory) {
		/*
		 * TODO : Fermer une SessionFactory
		 */
                sessionFactory.close();
                sessionFactory= null;
	}
         public static SessionFactory getSessionFactory() {
            return createSessionFactory();
        }
         
}