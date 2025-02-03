package project1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		int length,breadth;
        System.out.println("enter length: ");
        length = sc.nextInt();
        sc.nextLine();

        System.out.println("enter breadth: ");
        breadth = sc.nextInt();
        sc.nextLine();

        int area = length *breadth;
        System.out.println("area : "+ area);

        int perimeter = (length + breadth)*2;
        System.out.println("perimeter: "+ perimeter);
        sc.close();
	}

}
