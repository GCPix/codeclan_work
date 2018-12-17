package com.codeclan.example.employeetracking;

import com.codeclan.example.employeetracking.Repositories.EmployeeRepository;
import com.codeclan.example.employeetracking.models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeetrackingApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("Gillian Campbell", 32, 17362523, "gccc0309@gmail.com");

		employeeRepository.save(employee);

	}

//    @Test
//    public void deleteEmployee() {
//        Employee employee = new Employee("Gillian Campbell", 32, 17362523, "gccc0309@gmail.com");
//        employeeRepository.save(employee);
//        Employee employee1 = new Employee("Gillian Campbell", 32, 17362523, "gccc0309@gmail.com");
//        employeeRepository.save(employee);
//        Employee employee2 = new Employee("Gillian Campbell", 32, 17362523, "gccc0309@gmail.com");
//
//        employeeRepository.save(employee);
//        employeeRepository.deleteById((long) x);
//
//
//    }
}
