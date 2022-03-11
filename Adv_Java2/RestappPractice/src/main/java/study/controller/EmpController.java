package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.dao.EmployeeDAO;
import study.entity.EmployeeEntity;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmployeeDAO dao;
	
	@PostMapping("/addemp/{name}/{salary}/{department}")
	public void addemp(@PathVariable String name,@PathVariable int salary,@PathVariable String department )
	{
		dao.addemp(name, salary, department);
	}

	@GetMapping("/showall")
	public List<EmployeeEntity> getall()
	{
		return dao.getall();
	}
	
	@GetMapping("/getbyid/{id}")
	public EmployeeEntity getbyID(@PathVariable int id)
	{
		return dao.getByID(id);
	}
	
	
	@GetMapping("/getbyname/{name}")
	public List<EmployeeEntity> getbyname(@PathVariable String name)
	{
		return dao.getByname(name);
	}
	
	
	@GetMapping("/getbysal/{salary}")
	public List<EmployeeEntity> getBySalary(@PathVariable int salary)
	{
		return dao.getBysalary(salary);
	}
	
	
	@GetMapping("/getbydept/{dept}")
	public List<EmployeeEntity> getbydept(@PathVariable String dept)
	{
		return dao.getBydepartment(dept);
	}
	
	@DeleteMapping("/deletbyid/{id}")
	public void delete(@PathVariable int id)
	{
		dao.delete(id);
	}
	
	@DeleteMapping("/deletbyobj/{id}")
	public void deletebyobj(@PathVariable int id)
	{
		dao.deletebyobj(id);
	}
	
	
}
