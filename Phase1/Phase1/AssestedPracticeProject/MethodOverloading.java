package Phase1.AssestedPracticeProject;

public class MethodOverloading {
	
	public void cal(int a,int b)
	{
		System.out.println("Add two Number : "+ (a+b));
		
	}
	public void cal(int r)
	{
		System.out.println("Area of circle : "+(3.14*r*r));
	}
	public void cal(int l , float w) 
	{
		System.out.println("Area of Reactangle : "+(l*w));
	}
	public static void main(String[] args) {
		MethodOverloading c = new MethodOverloading();
		c.cal(20,30);
		c.cal(6);
		c.cal(4,6.0F);

	}
}
