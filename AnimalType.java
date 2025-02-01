package project1;
import java.util.Scanner;
public class AnimalType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Animal name: ");
        String animal = sc.nextLine().toLowerCase(); 

        if (animal.equals("dog")) {
            System.out.println("Mammal");
        } 
        else if (animal.equals("crocodile") || animal.equals("tortoise") || animal.equals("snake")) {
            System.out.println("Reptile");
        } 
        else {
            System.out.println("Unknown");
        }
        
        sc.close();
	}

}
 