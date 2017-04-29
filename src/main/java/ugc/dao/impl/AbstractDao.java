package ugc.dao.impl;

import javax.persistence.EntityManager;

import ugc.util.EntityManagerUtil;

public abstract class AbstractDao {
	
	protected EntityManager entityManager = EntityManagerUtil.entityManager();

}
