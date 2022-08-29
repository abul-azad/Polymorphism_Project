package polymor;
//In the same class, multiple method but method name should be same, Only change the parameter
    public class Overloading 
    {//start from here 
	
	public  void get_Opportunity (int a) 
	{
	System.out.println(a);	
	}
	
	public  void get_Property (int a, int b)
	{
	System.out.println(a*b);	
	}

	public  void get_Money (int a, int b, int c)
	{
	System.out.println(a-b-c);	
	}
	
	public  void get_Password (int a, int b, int c,int d)
	{
	System.out.println(a+b+c+d);	
	}
	
	}// end is here
