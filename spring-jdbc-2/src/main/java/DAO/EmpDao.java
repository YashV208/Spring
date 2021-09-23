package DAO;

import java.util.List;

import model.Employee;

public interface EmpDao {
	void insert(Employee emp);
	
	int deleteEmpById(int id);
	
	List<Employee> findAll();
	
	Employee findById(int id);
}
