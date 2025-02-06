package project1;
import java.util.Scanner;
public class Food_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int choice,quantity ;
		char ans ;
		int bill =0;
		System.out.println("Welcome to my Hotal :)");
		do {
			System.out.println("1: Starters \n 2: Main Course\n 3: Desserts \n 4: Drinks");
			System.out.println("enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("\n Menu Statrters");
				System.out.println("1. Spring Rolls - 100Rs");
				System.out.println("2.Panner Chilly - 110 Rs");
				System.out.println("3.Manchurian  - 120Rs");
				
				System.out.println("enter your choice: ");
				int ch1;
				ch1 = sc.nextInt();
				System.out.println("Enter quantity: ");
				quantity = sc.nextInt();
				if(ch1 == 1) {
					bill += quantity* 100;
				}
				else if(ch1 == 2) {
					bill +=  quantity* 160;
				}
				else if(ch1 ==3 ){
					bill += quantity*  140;
				}
				break;
			case 2:
				System.out.println("Main Course");
				System.out.println("1. Panner Tikka - 140Rs");
				System.out.println("2. Kaju Curry- 180 Rs");
				System.out.println("3.Dal Makhni - 150Rs");
				
				System.out.println("enter your choice: ");
				int ch2;
				ch2 = sc.nextInt();
				System.out.println("Enter quantity: ");
				quantity = sc.nextInt();
				if(ch2 == 1) {
					bill += quantity*  140;
				}
				else if(ch2 == 2) {
					bill += quantity*  180;
				}
				else if(ch2 ==3 ){
					bill += quantity*  150;
				}
				break;
			case 3 :
				System.out.println("Menu Desserts");
				System.out.println("1. Gulab Jamun - 30");
				System.out.println("2. chocolate Pastry - 50");
				System.out.println("3. Ice Cream  = 40");
				System.out.println("enter your choice: ");
				int ch3;
				ch3 = sc.nextInt();
				System.out.println("Enter quantity: ");
				quantity = sc.nextInt();
				if(ch3 == 1) { 
					bill +=  quantity * 30;
				}
				else if(ch3 == 2) {
					bill += quantity * 50;
				}
				else if(ch3 ==3 ){
					bill +=  quantity * 40;
				}
				break;
			case 4:
				System.out.println(" Drinks");
				System.out.println("1. Juice - 60");
				System.out.println("2. Coca-cola - 30");
				System.out.println("3. Lime Water  - 40");
				System.out.println("4. Diet coke  - 50");
				System.out.println("enter your choice: ");
				int ch4;
				ch4 = sc.nextInt();
				System.out.println("Enter quantity: ");
				quantity = sc.nextInt();
				if(ch4 == 1) {
					bill += quantity * 60;
				}
				else if(ch4 == 2) {
					bill +=quantity *30;
				}
				else if(ch4 ==3 ){
					bill +=quantity * 40;
				}
				else if(ch4 ==4){
					bill +=quantity * 50;
				}
				break;
			default:
				System.out.println("this is not available in our Menu");
			}
	        System.out.println("Do you want to add any other item: Y/N");
	        ans = sc.next().charAt(0);
				
		}while(ans=='Y'||ans=='y');
		
		System.out.println("\n Total bill : "+ bill);
		System.out.println("thank you for ordering! ");
		sc.close();
		
	}

}
