package app.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
	
	public EntityManager getEntityManger() {
		
		return emf.createEntityManager();
	}
	
	public <T> void save(T t){
		
		EntityManager em = JPAUtil.emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(t);
		
		em.getTransaction().commit();
		
		em.close();
	};
	
	public <T> T findById(T t, Integer id) {
		
		EntityManager em = JPAUtil.emf.createEntityManager();
		
		em.getTransaction().begin();
		
		T obj = (T) em.find(t.getClass(), id);
		
		em.getTransaction().commit();
		
		em.close();
		
		return obj;
		
	}

}
