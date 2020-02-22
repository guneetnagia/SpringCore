package guneet.spring.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import guneet.spring.model.Person;

public class Utility {
	public static void main(String saa[]){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Person myPerson  = (Person) context.getBean("personBean",Person.class);
		System.out.println("Person name " + myPerson.getName());
		
		context.close();
	}
}
