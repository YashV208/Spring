package Assignment2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empName=null;
		int empPhoneNumber;
		String empAddress;
		int probation=0;
		int experience;
		String err="Errors: ";
		Scanner sc=new Scanner(System.in);
		
	    
		try {
		System.out.println("Enter Name");
		empName=sc.nextLine();
		 
		System.out.println("Enter Contact Number");
		empPhoneNumber=sc.nextInt();
		
		System.out.println("Experience(in years)");
		experience=sc.nextInt();
		probation=12/experience;
		
		}
		catch(NullPointerException aex) {
			err=err+" All the values are Mandotry";
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Probation is 2 years for Freshers(Experience 0) ");
			probation=2;
		}catch (InputMismatchException e) {
//			System.out.println("Input Mismatch, Please Enter Required value type");
//			result = 1;
			err=err+"Input Mismatch, Please Enter Required value type \n";
		}
			
		
		finally {
			
			// close all res
			System.out.println(err);
			System.out.println(empName +" Has a probation period of "+ probation+" months");
		}

	}

}
