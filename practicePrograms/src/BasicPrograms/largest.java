package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<Integer> i1=new ArrayList<>();
				System.out.println("enter the length");
				Scanner input=new Scanner(System.in);
				int n=input.nextInt();
				for(int i=0;i<n;i++)
				{
					int arr=input.nextInt();
					i1.add(arr);
					
				}
				Collections.sort(i1);
				System.out.println(i1);
				
		
	}

}
