package springcoretutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcoretutorial.services.PetStoreServiceImpl;

public class MainExampleWithXML {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
		
		PetStoreServiceImpl petStoreServiceImpl1 = (PetStoreServiceImpl) context.getBean("petStore");
		System.out.println(petStoreServiceImpl1);
		
		
		PetStoreServiceImpl petStoreServiceImpl2 = (PetStoreServiceImpl) context.getBean("petStoreName");
		System.out.println(petStoreServiceImpl2);
		
		PetStoreServiceImpl petStoreServiceImpl3 = (PetStoreServiceImpl) context.getBean("petStoreWithConstructor");
		System.out.println(petStoreServiceImpl3);
		
		((ConfigurableApplicationContext)context).close();
	}

}
