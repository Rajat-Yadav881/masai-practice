package com.masaischool.emp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import com.masaischool.emp.dto.EmployeeDto;
import com.masaischool.emp.entity.Employee;
import com.masaischool.emp.exception.NoEmployeeException;
import com.masaischool.emp.exception.NoManagerException;
import com.masaischool.emp.repo.EmployeeRepository;

import jakarta.transaction.Transactional;


@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository repo;
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		//get an entity object from the dto
		Employee employee = new Employee();
		employee.setEmpid(dto.getEmpis());
		employee.setName(dto.getName());
		employee.setCtc(dto.getCtc());
		employee.setState(dto.getState());
		
		
		repo.save(employee);
		return dto;
	}
	
	@Override
	public void assignEmployeeToManager(String empId,String managerId)throws NoEmployeeException {
		//get the information of the employee
		Optional<Employee> opt = repo.findById(empId);
		opt.orElseThrow(()-> new NoEmployeeException("No Employee for the given emp ID"+empId));
		Employee emp = opt.get();
		//get information of the manager
		opt = repo.findById(managerId);
		opt.orElseThrow(()-> new NoEmployeeException("No Manager for the given emp ID"+managerId));
		Employee manag = opt.get();
		
		emp.setManager(manag);
		manag.getList().add(emp);
		
		repo.save(manag);

	}

	@Override
	public String getFirstLevelManager(String empId) throws NoManagerException ,NoEmployeeException{
		Optional<Employee> opt = repo.findById(empId);
		opt.orElseThrow(()-> new NoEmployeeException("No Employee for the given emp ID"+empId));
		Employee employee = opt.get();
		Employee manager = employee.getManager();
		if(manager==null) {
			throw new NoManagerException("No first manager..");
		}
		return manager.getName();
	}

	@Override
	public String getSecondLevelManager(String empId) throws NoManagerException,NoEmployeeException {
		Employee employee = repo.findById(empId).orElseThrow(()-> new NoEmployeeException("No Employee for the given emp ID"+empId));
		Employee manager = employee.getManager();
		if(manager==null) {
			throw new NoManagerException("No first level manager..");
		}
		manager = repo.findById(manager.getEmpid()).orElseThrow(()-> new NoEmployeeException("No Employee with id "));
		manager = manager.getManager();
		if(manager==null) {
			throw new NoManagerException("No second level manager..");
		}
		return manager.getName();
	}

	@Override
	public List<String> getFirstLevelReportees(String managerId) throws NoEmployeeException,NoManagerException{
		Employee manager = repo.findById(managerId).orElseThrow(()-> new NoEmployeeException("No Employee with id "+managerId));
		List<Employee>list= manager.getList();
		if(list==null || list.isEmpty()) {
			throw new NoManagerException("list is empty no first level reportees");
		}
		return list.stream().map(emp -> emp.getName()).collect(Collectors.toList());
	}

	@Override
	public List<String> getSecondLevelReportees(String managerId) throws NoEmployeeException,NoManagerException {
		Employee manager = repo.findById(managerId).orElseThrow(()-> new NoEmployeeException("No Employee with id "+managerId));
		List<Employee>list= manager.getList();
		if(list==null || list.isEmpty()) {
			throw new NoManagerException("list is empty no first level reportees");
		}
		if(manager.getManager()!=null) {
			throw new NoManagerException("No second leel reportees");
		}
		List<String> secondLevelReporteesNames = new ArrayList<>();
		for(Employee emp:list) {
			List<Employee> secondLevelRepotees = emp.getList();
			secondLevelReporteesNames.addAll(secondLevelRepotees.stream().map(emp1 -> emp1.getName()).collect(Collectors.toList()));
			
		}
		return secondLevelReporteesNames;
	}

}
