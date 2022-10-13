package BasicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class index {
	public static int indexNumber(int n,List<Integer> i1) {
		int index =-1;
		for(int i=0;i<= i1.size();i++)
		{
		if(i1.get(i)==n)
		{
			 index=i;
			 return index;
		}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		List<Integer>i1=new ArrayList<>();
		i1.add(2);
		i1.add(3);
		i1.add(5);
		i1.add(9);
		i1.add(1);
		int res=indexNumber(n, i1);
		System.out.println(res);
	}
	
}
