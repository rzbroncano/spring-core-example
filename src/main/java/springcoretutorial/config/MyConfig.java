package springcoretutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springcoretutorial.dao.JpaAccountDao;
import springcoretutorial.dao.JpaItemDao;
import springcoretutorial.dtos.BeanOne;
import springcoretutorial.services.PetStoreServiceImpl;

@Configuration
public class MyConfig {

	@Bean(value = "accountDao")
	public JpaAccountDao accountDao() {
		return new JpaAccountDao();
	}
	
	@Bean(value = "itemDao")
	public JpaItemDao itemDao() {
		return new JpaItemDao();
	}
	
	@Bean(value = {"petStore","petStoreName"})
	public PetStoreServiceImpl petStore() {
		return new PetStoreServiceImpl(accountDao(),itemDao());
	}
	
	
	@Bean(value = "beanOne", initMethod = "init", destroyMethod = "cleanup")
	public BeanOne getGeanOne() {
		return new BeanOne();
	}
	
}
