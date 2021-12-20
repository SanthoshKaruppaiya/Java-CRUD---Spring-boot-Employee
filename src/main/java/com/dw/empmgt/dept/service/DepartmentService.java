package com.dw.empmgt.dept.service;

import java.util.List;

import com.dw.empmgt.dept.model.DepartmentEntity;

public interface DepartmentService {

	//create
	public DepartmentEntity save(String departmentName);
	
	//read
	public List<DepartmentEntity> findAll();
	
	public DepartmentEntity findById(Long id);
	
	//update
	public DepartmentEntity update(Long id,String departmentName);
	
}
