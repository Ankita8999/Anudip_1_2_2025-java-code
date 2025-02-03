package project1;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		  int P,N;
	        float R;
	        System.out.println("enter P: ");
	        P = sc.nextInt();
	        sc.nextLine();

	        System.out.println("enter R");
	        R = sc.nextFloat();
	        sc.nextLine();

	        System.out.println("enter N: ");
	        N = sc.nextInt();
	        sc.nextLine();
	       
	        float  result = (P*R*N)/100; 
	        System.out.println("simple Interest : "+ result);

	}

}
