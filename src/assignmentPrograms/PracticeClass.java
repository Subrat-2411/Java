package assignmentPrograms;

public class PracticeClass {

	
	public void m1()
	{
		
		
		System.out.println("Running m1 method");
	}
	
	
	public void m2()
	{
		
		System.out.println("Running m2 method");
		
	   
		m1();
	}
	
	public static void main(String[] args)
	{
		
		PracticeClass p1=new PracticeClass();
		
		p1.m2();
	}
}
