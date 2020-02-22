package guneet.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,  DisposableBean{
	private String name;
	
	
	
	public Person() {
		super();
	}

	public Person(String name){
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// Bean initialization code

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization is invoked");
	}

	// Bean destroy code
	public void destroy() throws Exception {
		System.out.println("Destroy is invoked");
	}
	

}
