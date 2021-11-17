package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjetedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext cpx =  SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) cpx.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) cpx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) cpx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreetingService());

		System.out.println("------- Constructor");

		ConstructorInjetedController constructorInjetedController = (ConstructorInjetedController) cpx.getBean("constructorInjetedController");

		System.out.println(constructorInjetedController.getGreeting());

		System.out.println("------- Profiles");
		
		I18nController i18nController = (I18nController) cpx.getBean("i18nController");

		System.out.println(i18nController.getGreeting());
	}

}
