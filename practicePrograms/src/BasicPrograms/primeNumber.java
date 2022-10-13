package BasicPrograms;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println(" enter the number");
		num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime");
		} else
			System.out.println("not prime");

	}

}
