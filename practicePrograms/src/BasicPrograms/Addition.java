package BasicPrograms;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("enter two numbers:");
		a = input.nextInt();
		b = input.nextInt();
		c = a + b;
		System.out.println("Addition of two numbers are: " + c);

	}

}
