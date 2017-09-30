import java.util.*;
public class NUMBER {

	public static void main(String[] args) 
	{
		int i,n,ans=0;
		System.out.println("Enter your number");
		Scanner pn = new Scanner(System.in);
		n=pn.nextInt();
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					ans++;
					break;
					
				}
			}
				if(ans==0)
				{
					System.out.println("Number is prime number");
				}
				else
				{
					System.out.println("Number is NOT a prime number");
				}
	}
}
