package com.dw.empmgt.employee.service;
import java.util.List;

import com.dw.empmgt.employee.model.Employee;


	public interface EmployeeService {
	    List < Employee > getAllEmployees();
	    void saveEmployee(Employee employee);
	    Employee getEmployeeById(long id);

}

