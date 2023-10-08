package expansion;

import java.util.Scanner;

public class InterestCalculator 
{
	public static void main(String[] args)
	{
	  double interest;
	  float amount,rate,time;
	System.out.println("Enter the values for calculating interest");
	  Scanner r=new Scanner(System.in);
	  
	  System.out.println("Enter amount:");
	  amount=r.nextFloat();
	  System.out.println("Enter rate:");
	  rate=r.nextFloat();
	  System.out.println("Enter time:");
	  time=r.nextFloat();
	  
	  interest=amount*rate*time;
	  System.out.println("Interest is:"+interest);
	}


}
