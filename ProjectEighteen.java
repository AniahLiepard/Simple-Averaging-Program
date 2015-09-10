import java.util.Scanner;

public class ProjectEighteen {
	public static void main(String args[]){
		Scanner inside = new Scanner(System.in);
		int amount = 5;
		int dollars;
		int averageAmount;
		int counter = 0;
		
		while (counter < 3){
			dollars = inside.nextInt();
			amount = amount + dollars;
			counter++;
		}
		averageAmount = amount/3;
		System.out.println("Your average amount in dollars is " + averageAmount);
	}
}
