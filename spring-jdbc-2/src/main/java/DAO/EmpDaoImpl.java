package DAO;

import model.Employee;

import java.util.List;

import javax.sql.DataSource;
import rowMapper.empRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmpDaoImpl implements EmpDao {
//	private DataSource source= new DriverManagerDataSource("jdbc:mysql://127.0.0.1/billdesk","root","");
//	private JdbcTemplate template= new JdbcTemplate(source);
	private JdbcTemplate template;
	

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void insert(Employee emp) {
		
		String sql="INSERT INTO `emp` VALUES (?,?,?,?)";
		Object[] arg= {emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary()};
		
		int noOfRowsINserted=template.update(sql,arg);
		System.out.println("NO of rows: "+noOfRowsINserted);
	}

	public int deleteEmpById(int id) {
		String sql="Delete from emp where eid=?";
		
		int noOfRowsDeleted=template.update(sql,id);
		return noOfRowsDeleted;
	}

	public List<Employee> findAll() {
		String sql="Select * from emp";
		List<Employee> empList=template.query(sql,new empRowMapper());
		return empList;
	}

	public Employee findById(int id) {
		String sql="Select * from emp where eid=?";
		Employee emp= template.queryForObject(sql, new Object[] {id}, new empRowMapper());
		return emp;
	}

}
