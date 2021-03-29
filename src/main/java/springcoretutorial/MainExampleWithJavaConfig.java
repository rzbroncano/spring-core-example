package springcoretutorial;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcoretutorial.config.MyConfig;
import springcoretutorial.dtos.BeanOne;
import springcoretutorial.services.PetStoreServiceImpl;

public class MainExampleWithJavaConfig {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyConfig.class);
		context.refresh();

		System.out.println("Se inicia el Spring Container");
		
		PetStoreServiceImpl petStoreServiceImpl1 = (PetStoreServiceImpl) context.getBean("petStore");
		System.out.println(petStoreServiceImpl1);

		PetStoreServiceImpl petStoreServiceImpl2 = context.getBean("petStoreName", PetStoreServiceImpl.class);
		System.out.println(petStoreServiceImpl2);
		
		BeanOne beanOne = context.getBean("beanOne", BeanOne.class);
		System.out.println(beanOne);
		
		System.out.println("Se empieza a cerrar el Spring Container");
		//https://stackoverflow.com/questions/14423980/how-to-close-a-spring-applicationcontext
		((ConfigurableApplicationContext)context).close();
		System.out.println("Se cerro el Spring Container");
	}

}
