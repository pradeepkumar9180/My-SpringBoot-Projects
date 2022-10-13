package BasicPrograms;

public class addNextElement {
	public static void main(String[] args) {
	int[] a= {2,3,4,5,6,9};
	int sum=0;
	for(int i=0;i<a.length-1;i++)
	{
	int j=i+1;
			sum=a[i]+a[j];
			System.out.println(sum);
	}
	
	}

}

