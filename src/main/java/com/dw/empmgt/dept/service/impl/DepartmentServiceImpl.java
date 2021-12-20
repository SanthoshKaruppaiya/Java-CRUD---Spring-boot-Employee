package com.dw.empmgt.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.empmgt.dept.model.DepartmentEntity;
import com.dw.empmgt.dept.repository.DepartmentRepository;
import com.dw.empmgt.dept.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public DepartmentEntity save(String departmentName) {
		DepartmentEntity entity = new DepartmentEntity();
		entity.setName(departmentName);
		return departmentRepository.save(entity);
	}

	@Override
	public List<DepartmentEntity> findAll() {
		return departmentRepository.findAll();
	}

	@Override
	public DepartmentEntity findById(Long id) {
		return departmentRepository.findById(id).get();
	}

	@Override
	public DepartmentEntity update(Long id, String departmentName) {
		DepartmentEntity departmentEntity = findById(id);
		departmentEntity.setName(departmentName);
		return departmentRepository.save(departmentEntity);
	}

}
