package study.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.EmployeeEntity;

@Service
public class EmployeeDAO {
	
	@Autowired
	MyRepository repo;
	
	public void addemp(String name, int salary, String department)
	{
		EmployeeEntity emp= new EmployeeEntity(name, salary, department);
		repo.save(emp);
	}
	
	public List<EmployeeEntity> getall()
	{
		return repo.findAll();
	}
	
	public EmployeeEntity getByID(int id)
	{
		
		/*
		 * first method
		 * Optional<EmployeeEntity> emp=repo.findById(id); EmployeeEntity
		 * emp1=emp.get();
		 */
		
		/*Second method
		 *  EmployeeEntity emp=repo.findById(id).get(); */
		
		/* Third method */
		return repo.findById(id).get();
		
	}
	
	public List<EmployeeEntity> getByname(String name)
	{
		return repo.findByName(name);
		
	}
	

	public List<EmployeeEntity> getBysalary(int salary)
	{
		return repo.findBySalary(salary);
		
	}

	public List<EmployeeEntity> getBydepartment(String department)
	{
		return repo.findByDepartment(department);
		
	}
	
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	
	public void deletebyobj(int id)
	{
		EmployeeEntity emp= repo.findById(id).get();
		repo.delete(emp);
		
	}
	
	
	

}
