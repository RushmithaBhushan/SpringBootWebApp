package com.example.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.web.model.Employee;
import com.example.springboot.web.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired 
	private EmployeeService employeeService;
	
	@Autowired
    private Environment env;
	
	@Autowired
	private Sample sample;
 
	@GetMapping("/")
	public String indexpage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployee());
		System.out.println(env.getProperty("spring.datasource.password"));
		System.out.println(sample.dbUsername);
		return "index";
	}
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/showUpdateForm/{id}")
	public String showUpdateForm(@PathVariable (value = "id") int id, Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee";
		
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value = "id") int id) {
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/";
	}
	

}
