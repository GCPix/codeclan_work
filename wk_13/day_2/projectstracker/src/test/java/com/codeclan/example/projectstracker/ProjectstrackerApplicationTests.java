package com.codeclan.example.projectstracker;

import com.codeclan.example.projectstracker.models.Project;
import com.codeclan.example.projectstracker.repositories.DepartmentRepository;
import com.codeclan.example.projectstracker.repositories.EmployeeRepository;
import com.codeclan.example.projectstracker.models.Department;
import com.codeclan.example.projectstracker.models.Employee;
import com.codeclan.example.projectstracker.repositories.ProjectRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectstrackerApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRespository projectRespository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddDepartment() {
		Department department = new Department("Accounting");
		departmentRepository.save(department);
	}

	@Test
	public void canAddEmployee() {
		Department department = new Department("Accounting");
		departmentRepository.save(department);


		Employee employee = new Employee("Gillian", "Campbell", 82746, department);
		employeeRepository.save(employee);

	}

	@Test
	public void canAddProject() {
		Department department = new Department("Accounting");
		departmentRepository.save(department);

		Employee employee = new Employee("Gillian", "Campbell", 82746, department);
		employeeRepository.save(employee);

		Project project = new Project("Java", 4);
		projectRespository.save(project);

	}

    @Test
    public void canAddProjectToEmployee() {
        Department department = new Department("Accounting");
        departmentRepository.save(department);

        Employee employee = new Employee("Gillian", "Campbell", 82746, department);
        employeeRepository.save(employee);

        Project project = new Project("Java", 4);
        projectRespository.save(project);

        employee.addProject(project);
        employeeRepository.save(employee);

    }

    @Test
    public void canAddEmployeeToProject() {
        Department department1 = new Department("IT");
        departmentRepository.save(department1);

        Employee employee1 = new Employee("Peter", "McGowan", 391826, department1);
        employeeRepository.save(employee1);

        Project project1 = new Project("Cashflow Modelling", 10);
        projectRespository.save(project1);

        project1.addEmployee(employee1);
        projectRespository.save(project1);
    }
}
