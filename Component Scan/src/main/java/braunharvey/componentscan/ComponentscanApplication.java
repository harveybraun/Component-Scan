package braunharvey.componentscan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Harvey Braun
 * @version 1.0
 * @since 20.04.2020
 */
@SpringBootApplication
@ComponentScan("externalclasses")
public class ComponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ComponentscanApplication.class, args);

		ClassDAO classDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + classDAO);
		System.out.println("Objeto JDBC: " + classDAO.getObjectJDBC());
	}

}
