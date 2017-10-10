
public class EEE extends Kuet_Students{

private String Department;
	
	public EEE(String name,int age,double cg,String Department)
	{
		super(name,age,cg);
		this.Department=Department;
		super.PrintInfo();
	}
	public void PrintInfo()
	{
		System.out.print("Department is: "+this.Department);
	}
}
