import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.EmpDao;
import DAO.EmpDaoImpl;

import model.Employee;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		EmpDao empDao= (EmpDaoImpl)context.getBean("empDaoImpl");
		

//		Employee emp1=new Employee();	
//		emp1.setId(2);
//		emp1.setName("Abhishek");
//		emp1.setAddress("Mumbai");
//		emp1.setSalary(123456);
//		empDao.insert(emp1);
		
		
//		System.out.println("No. of rows deleted: "+empDao.deleteEmpById(2));
		
		
		List<Employee> emp2;
		emp2=empDao.findAll();
		
		 Employee emp3= new Employee();
		 emp3=empDao.findById(2);
		 System.out.println(emp3);
		 
		System.out.println(emp2);
		
		
		

	}

}
