package com.dw.empmgt.dept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dw.empmgt.dept.model.DepartmentEntity;

@Repository
public interface DepartmentRepository  extends JpaRepository<DepartmentEntity, Long>{ 

}
