package com.itwill.spring.transaction;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDaoTestMain {

	public static void main(String[] args) {
		System.out.println("--------------conext 초기화시작------------");
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring_empdao_test.xml");
		System.out.println("--------------conext 초기화끝------------");
		
		EmployeeDao empDao=
				(EmployeeDao)context.getBean("empDao");
		System.out.println("--------insert---------");
		empDao.insert(new Employee(
						0, "김미숙", "mi@google.com", "111-2222", 0));
		
	
		System.out.println("--------update---------");
		empDao.update(new Employee(6, "육변경", "change@korea.com","666-6666", 6000));
		System.out.println("-------[Employee]------");
		System.out.println(empDao.getPerson(1));
		System.out.println(empDao.getPerson(6));
		System.out.println("-------[Employee increaseSalary]------");
		Map map=new HashMap();
		map.put("id",1);
		map.put("salary",56);
		empDao.increaseSalary(map);
		System.out.println("-------[Employee List]------");
		System.out.println(empDao.list());
		
		
		
		
		
	}

}
