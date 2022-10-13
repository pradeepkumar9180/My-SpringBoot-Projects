package BasicPrograms;

public class a1 {
	public static void main(String[] args) {
int tokenNumber=1021;
		        if(tokenNumber>=1000 && tokenNumber<=2000)
		        {

		    int res1=tokenNumber%10;
		    int res=tokenNumber/10;
		    int res2=res%10;
		    int res3=res2+res1;
		    if(res3==3||res3==8)
		    {
		       System.out.println( "Lucky Draw winner");
		    }
		    else
		    {
		    System.out.println("Not a Lucky Draw winner");
		    }

			}
		    }
	}
