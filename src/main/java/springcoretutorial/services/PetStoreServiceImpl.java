package springcoretutorial.services;

import springcoretutorial.dao.JpaAccountDao;
import springcoretutorial.dao.JpaItemDao;

public class PetStoreServiceImpl {

	private JpaAccountDao accountDao;
	private JpaItemDao itemDao;

	public PetStoreServiceImpl() {
	}

	public PetStoreServiceImpl(JpaAccountDao accountDao, JpaItemDao itemDao) {
		this.accountDao = accountDao;
		this.itemDao = itemDao;
	}

	public JpaAccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(JpaAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public JpaItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(JpaItemDao itemDao) {
		this.itemDao = itemDao;
	}

}
