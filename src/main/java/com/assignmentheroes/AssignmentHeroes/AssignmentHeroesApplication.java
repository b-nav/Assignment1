package com.assignmentheroes.AssignmentHeroes;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AssignmentHeroesApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("heroes.xml");
		SuperMan superman = context.getBean(SuperMan.class);
		WonderWomen wonderwomen = context.getBean(WonderWomen.class);
		TalkingCat tc = context.getBean(TalkingCat.class);
		superman.action();
		wonderwomen.action();
		tc.action();
	}

}
