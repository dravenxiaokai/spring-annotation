package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ren.draven.dao.PersonDao;
import ren.draven.service.PersonService;

class SpringTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

//	@Test
//	void instanceSpring() {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		PersonService personService = (PersonService) context.getBean("personService");
//		personService.save();
//		context.close();
//	}
	@Test
	void instanceSpring() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		PersonService personService = (PersonService) context.getBean("personServiceBean");
		PersonService personService = (PersonService) context.getBean("personService");
		System.out.println(personService);
//		PersonService personService1 = (PersonService) context.getBean("personService");
//		System.out.println(personService==personService1);
		context.close();
	}
}
