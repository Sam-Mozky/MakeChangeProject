package makeChange;

public class CashRegister {
	public static void main(String[] args) {
		
		System.out.println("Hello, welcome to the cash register");
		
		//printCost();
		printChange();
		
		System.out.println("Have a wonderful day!");
		
	}
	
	public static void printChange() {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("Please enter the amount of your item: ");
		double cost = scanner.nextDouble();
		System.out.println("The total cost of your item is: " + cost);
		System.out.println("Please enter the amount of money recieved: ");
		double moneyRecieved = scanner.nextDouble();
	
		double change = (moneyRecieved - cost); 
		
		System.out.println("Your change is: " + change);	
		
	}
	
}
