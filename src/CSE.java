
public class CSE extends Kuet_Students {
	private String Department;
	
	public CSE(String name,int age,double cg,String Department)
	{
		super(name,age,cg);
		this.Department=Department;
		super.PrintInfo();
	}
	public void PrintInfo()
	{
		System.out.println("Department is: "+this.Department);
	}
	
	
}
