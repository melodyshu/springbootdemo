package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private Student student;
	
	@Autowired
	private ApplicationContext context;
	@Test
	public void contextLoads() {
		System.out.println(student);
	}

	@Test
	public void test() {
		//StudentService studentService= (StudentService) context.getBean("stuService");
	}
}
