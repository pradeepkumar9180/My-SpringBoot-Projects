package BasicPrograms;

import java.util.Scanner;

public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c,n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the max limit");
		n=input.nextInt();
		System.out.println("enter thne values of a,b");
		a = input.nextInt();
		b = input.nextInt();
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println("fibanocci series: " + c);
		}

	}

}
