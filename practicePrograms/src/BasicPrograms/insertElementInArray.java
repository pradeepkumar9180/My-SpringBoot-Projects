package BasicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insertElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		List<Integer>i=new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		System.out.println("enter the position and element to be inserted");
		int k=input.nextInt();
		int value=input.nextInt();
		i.add(k,value);
		System.out.println("before insertion the elements are : "+i );
		System.out.println("After insertion the elements are : "+i);
		

	}

}
