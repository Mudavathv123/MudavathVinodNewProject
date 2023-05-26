package emailapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApp {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("emailapp/email.xml");
		Email email1 = context.getBean("email1",Email.class);
		System.out.println(email1.showInfo());
		
	}
}
