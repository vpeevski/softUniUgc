package ugc.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("discoverita");

	public static EntityManager entityManager() {
		return entityManagerFactory.createEntityManager();
	}

}
