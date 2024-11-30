package com.firstSpring.demoSpring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoSpringApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("app_context.xml");
		ComputerEngineer computerEngineer = context.getBean("compEng",ComputerEngineer.class);
		System.out.println(computerEngineer.toString());
		AnnotationEngineer annotationEngineer = applicationContext.getBean("anEng",AnnotationEngineer.class);
		System.out.println(annotationEngineer.toString());
	}

}
