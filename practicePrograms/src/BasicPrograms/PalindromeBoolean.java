package BasicPrograms;

public class PalindromeBoolean {
	public static void main(String[] args) {
		String sb="mom";
		boolean t=palindrome(sb);
		System.out.println(t);
	}

	private static boolean palindrome(String sb) {
		// TODO Auto-generated method stub
		char[] ch=sb.toCharArray();
		int count=0;
		int j=ch.length-1;
		for(int i=0;i<j;i++,j--)
		{
			if(ch[i]==ch[j])
			{
				count++;
			}
		}
		if(count==ch.length/2)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
