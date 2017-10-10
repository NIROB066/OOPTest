
public class Kuet_Students {

	private String name;
	private int age;
	private double cg;
	
	public Kuet_Students(String name,int age,double cg) {
		this.name=name;
		this.age=age;
		this.cg=cg;
	}
	
	public void PrintInfo()
	{
		System.out.println("Name is: "+this.name);
		System.out.println("Age is: "+this.age);
		System.out.println("CG is: "+this.cg);
		
	}
}
