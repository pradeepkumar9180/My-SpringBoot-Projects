package BasicPrograms;

public class CountGap {
	public static void main(String[] args) {
		int a=529,count=0;
		String b=Integer.toBinaryString(a);
		char[] ch=b.toCharArray();
//		if(ch[0]=='1' && ch[ch.length-1]=='1')
//		{
//			for(int i=0;i<ch.length;i++)
//			{
//				if(ch[i]=='0')
//				{
//					count++;
//				}
//			}
//		}
//		System.out.println(count);	
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='1')
			{
				count++;
			}
		}
	int[] a1=new int[count];
	for(int i=0;i<a1.length;i++)
	{
		if(ch[i]=='1')
		{
			a1[count]=i;
		}
	}
		for(int i=0;i<a1.length-1;i++)
		{
			System.out.println(a1[i]);
		}
		
		}

}
