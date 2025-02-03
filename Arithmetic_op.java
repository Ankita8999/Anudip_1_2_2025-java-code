package project1;
import java.util.Scanner;
public class Arithmetic_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		int a ,b;

        System.out.println("enter value of a: ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.println("enter value of b: ");
        b = sc.nextInt();
        sc.nextLine();

        System.out.println("perform addition operation");
        System.out.println("a+b= "+ (a+b));

        System.out.println("perform substraction operation: ");
        System.out.println("a-b= "+ (a-b));

        System.out.println("perform multiplication operation: ");
        System.out.println("a*b= "+ (a*b));

        System.out.println("perform division operation: ");
        System.out.println("a/b= "+ (a/b));

        System.out.println("perform modulo operation: ");
        System.out.println("a%b= "+ (a%b));

	}

}
