package OOPSConcepts;

public class Constructor 
{
	int id;
	String name;
	Constructor(int a,String n)
	{
		id = a;
		name = n;
		
	}
	void display()
	{
		System.out.println(id +"------"+ name);	
	}

	public static void main(String[] args) 
	{
	    Constructor c = new Constructor(12,"Parameterized Constructor");	
	    c.display();
	    
	    
	    
	}

}
