package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ren.draven.service.PersonService;

class SpringTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void instanceSpring() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonService personService = (PersonService) context.getBean("personService");
		personService.save();
		context.close();
	}
}
