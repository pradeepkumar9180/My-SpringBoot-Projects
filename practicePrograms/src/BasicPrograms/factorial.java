package BasicPrograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int fact;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number:");
		fact = input.nextInt();
		int total_fact=1;
		for (int i = 1; i <= fact; i++) {
			total_fact=total_fact*i;

		}
		System.out.println("factorial of "+fact+" is: "+total_fact);

	}
}
