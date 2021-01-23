package Inher;

public class Childclass extends Parentclass{
	
	public static void main(String[] args) {
		
		Childclass obj1=new Childclass();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
	
		
		
	}
	public void mul() 
	{
		System.out.println("Perform multiplication");
	}
	
	public void div() 
	{
		System.out.println("Perform division");
	}
}
