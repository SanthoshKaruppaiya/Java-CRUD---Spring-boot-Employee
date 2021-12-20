package com.dw.empmgt.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dw.empmgt.employee.model.Employee;
@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}
