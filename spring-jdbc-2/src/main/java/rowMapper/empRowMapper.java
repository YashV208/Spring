package rowMapper;

import model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class empRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee tempEmp=new Employee();
		
		tempEmp.setId(rs.getInt("eid"));
		tempEmp.setName(rs.getString("empname"));
		tempEmp.setAddress(rs.getString("empadd"));
		tempEmp.setSalary(rs.getDouble("empsal"));
		
		return tempEmp;
	}

	
	
	}


