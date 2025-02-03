package project1;

import java.util.Scanner;

public class emp_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
//			String name;
//			System.out.println("enter your name: ");
//			name = sc.nextLine();
//			System.out.println(name);
			
			
			int emp_id;
	        String name,dept,designation;
	        float salary;
	        char gender;
	
	        System.out.println("enter employee id");
	        emp_id = sc.nextInt();
	        sc.nextLine();
	
	        System.out.println("enter your name: ");
	        name = sc.nextLine();
	
	        System.out.println("enter your department: ");
	        dept = sc.nextLine();
	
	        System.out.println("enter your designation:");
	        designation = sc.nextLine();
	
	        System.out.println("enter your salary: ");
	        salary = sc.nextFloat();
	        sc.nextLine();
	
	        System.out.println("enter your Gender M/F: ");
	        gender = sc.next().charAt(0);
	        
	        
	     //display all data
	
	        System.out.println("employee id: "+emp_id);
	        System.out.println("name :"+name);
	        System.out.println("department: "+dept);
	        System.out.println("designation: "+designation);
	        System.out.println("gender: "+gender);
	        System.out.println("salary: "+salary);
	        
	        sc.close();

	}

}
