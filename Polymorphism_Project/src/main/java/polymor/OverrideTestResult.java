package polymor;

    public class OverrideTestResult extends OverrideClass 
    {//Start From here
	
	public static void main(String[] args) 
	{
    OverrideTestResult obj=new OverrideTestResult();
    obj.Get_homeLoan();
    obj.Get_PersonalLoan();
    obj.Get_StudentLoan();
    obj.Get_ConstructionLoan();
    
    System.out.println (obj.Get_homeLoan());
    System.out.println (obj.Get_PersonalLoan());
    System.out.println (obj.Get_StudentLoan());
    System.out.println ( obj.Get_ConstructionLoan());
    
    
	}
	public double Get_homeLoan() 
	{
		return 10.5;
	}
	
	public double Get_PersonalLoan() 
	{
		return 9.99;
	}
	
	public double Get_StudentLoan() 
	{
		return 11.5;
	}
	
	public double Get_ConstructionLoan() 
	{
		return 12.99;
	}

    }//End is here
