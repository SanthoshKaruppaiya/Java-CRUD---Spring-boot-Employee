package com.dw.empmgt.dept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dw.empmgt.dept.model.DepartmentEntity;
import com.dw.empmgt.dept.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping(value = "/department/list")
	public String index(Model model) {
		List<DepartmentEntity> allDepartment = departmentService.findAll();
		model.addAttribute("allDepartment", allDepartment);
		return "departmentList";
	}

    @GetMapping("/showdepartmentform")
    public String showdepartmentform(Model model) {
        return "departmentform";
    }


	@PostMapping("/saveDepartment")
	public String saveDepartment(@RequestParam("departmentName") String name) {
		departmentService.save(name);
		return "redirect:/department/list";
	}
}
