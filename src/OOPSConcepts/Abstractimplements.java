package OOPSConcepts;

public class Abstractimplements extends Demo
{

	public static void main(String[] args) 
	{
		//Abstractimplements a = new Abstractimplements();
	    Demo d = new Abstractimplements();
		d.parking();
		d.twowheel();
		d.fourwheel();

	}

	@Override
	void parking() 
	{
		System.out.println("parking fees are ");
		
	}

	@Override
	void twowheel() 
	{
	   System.out.println("twowheeler parking fee is $2");
	}

	@Override
	void fourwheel() 
	{
		System.out.println("fourwheeler parking fee is $4");
	}

}
