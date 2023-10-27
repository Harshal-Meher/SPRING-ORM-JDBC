package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDao;

@SpringBootApplication
public class SpringormDay2JdbcApplication {

	public static void main(String[] args) {

		  ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
		    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
		    int status=dao.saveEmployee(new Employee(102,"Harshal","Shankarpur")); 
//		    int status=dao.deleteEmployee(new Employee(101,"Amit","Nagpur")); 
//		    int status=dao.updateEmployee(new Employee(101,"Sonoo","Pune")); 
		   
		  		   
		    System.out.println("Inserted "+status);
		    
	}

}
