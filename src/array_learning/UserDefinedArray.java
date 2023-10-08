package array_learning;

public class UserDefinedArray 
{
	public static void main(String [] args)
	{
		Student s[]=new Student[10];     //creating userDefined array
		for(int i=0;i<10;i++)
		{
			s[i]=new Student();    //creating object of user defined array
			s[i].rollNumber=100+i;
			s[i].name="student"+i;
			s[i].address="Address"+i;
			s[i].mobile="mobile"+i;
		 }
	    
		//printing array
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Roll_no: " + s[i].rollNumber + "  Name: " +s[i].name + 
			"  address: " +s[i].address + "  mobile: " +s[i].mobile);
		}
	}

}



