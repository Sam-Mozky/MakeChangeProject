package makeChange;

public class CashRegister {
	public static void main(String[] args) {
		
		System.out.println("Hello, welcome to the cash register");
		
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
		int result = 0;
		
		if(change < 1 && change % 25 == 1) {
			System.out.println("Quarters: " + result);
		} else if (change < 1 && change % 10 == 1) {
			System.out.println("Dimes: " + result);
		} else if (change < 1 && change % 5 == 1) {
			System.out.println("Nickels: " + result);
		} else if(change < 1 && change % 1 == 1) {
			System.out.println("Pennies: " + result);
		}
		
		if (cost > moneyRecieved) {
			System.out.println("Error, payment denied.");
		}
		
		if(cost == moneyRecieved) {
			System.out.println("You've given the exact amount. No change needed!");
		}
		
		System.out.println("Your change is: " + change);
		System.out.println(result);
		
		scanner.close();
	}
	
}
