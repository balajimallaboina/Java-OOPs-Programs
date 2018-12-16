package OOPSConcepts;

public class Static {

	static int e;
	public void Addition(int a,int b) {
		int result = a + b;
		System.out.println("result is:"+result);
		result = e;
		System.out.println("value of e is:"+e);
	}
	public static void Subraction(int c, int d) {
		int result1 = c - d;
		System.out.println("subraction of c&d is :"+result1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Static s = new Static();
          s.Addition(2, 2);
         Subraction(5,5);
	}

}
