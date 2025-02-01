package project1;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1: Accept min,max .Display only even number");
	    System.out.println(" 2: check number is prime or not");
	    System.out.println(" 3: check number is palindrome or not");
	    System.out.println(" 4: check number is armstrong or not");
	    System.out.println("enter your choice: ");
	    choice = sc.nextInt();
		switch(choice) {
		case 1:
			int min,max;
			System.out.println("enter min number: ");
			min = sc.nextInt();
			System.out.println("enter max number: ");
			max = sc.nextInt();
			for(int i= min; i<max; i+=2) {
				if(min%2==0) {
					System.out.println(i);
				
				}
				else {
					System.out.println(i+1);
				}
			}
			break;
		case 2:
			int num;
			System.out.println("enter a number: ");
			num = sc.nextInt();
			boolean isPrime = true;
			if(num<=1) {
				isPrime = false;
			}
			else {
				for(int i=2; i<num; i++) {
					if(num%i ==0) {
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime) {
				System.out.println("number is prime ");
			}
			else {
				System.out.println("number is not prime");
			}
			break;
		case 3:
			System.out.println("enter a number: ");
			int palindromeNum = sc.nextInt();
			int original = palindromeNum;
			int reverse =0;
			while(palindromeNum > 0) {
				int last_digit = palindromeNum % 10;
				reverse = reverse * 10 +last_digit;
				palindromeNum /= 10;
			}
			if(original == reverse) {
				System.out.println("number is palindrome number");
			}
			else {
				System.out.println("number is not palindrome number");
			}
			break;
		case 4:
			System.out.println("enter a number:");
			int num1 = sc.nextInt();
			int temp =num1;
			int sum=0,digit =0;
			while(temp>0) {
				digit ++;
				temp = temp/10;
			}
			temp = num1;
			while(temp>0) {
				int last_digit = temp %10;
				sum += Math.pow(last_digit,digit);
				temp /= 10;
			}
			if(num1 == sum) {
				System.out.println("number is armstrong number");
			}
			else {
				System.out.println("number is  not a armstrong number");
			}
			break;
		default:
			System.out.println("Invalid choice");
		}
		
         sc.close();
	}

}
