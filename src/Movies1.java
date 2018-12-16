 interface Movies
{
	public void play();
	public void pause();
	public void exit();

}
interface Games
{
	public void Start();
	public void Quit();
}

public class Movies1
{

	public static void main(String[] args) 
	{
		Movies t = new Television();
		t.play();
		t.exit();
	   Games g = new Television();
	   g.Start();
	   g.Quit();
	   Movies  lp = new Laptop();
		lp.play();
		lp.pause();
		
		
	}

}
