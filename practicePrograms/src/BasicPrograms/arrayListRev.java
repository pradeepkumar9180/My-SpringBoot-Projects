package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arrayListRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> num = new ArrayList();
//		num.add(1);0
//		num.add(2);
//		num.add(3);
//		num.add(4);
//		num.add(5);
//		Collections.reverse(num);
//		System.out.println(num);

		List<Integer>num=new ArrayList();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the range of values");
		int range=input.nextInt();
		System.out.println("enter the numbers");
		for(int i=0;i<range;i++)
		{
			int num1=input.nextInt();
			num.add(num1);
		}
		Collections.reverse(num);
		System.out.println(num);
	}

}
