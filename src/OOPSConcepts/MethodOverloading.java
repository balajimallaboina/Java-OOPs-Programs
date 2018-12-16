package OOPSConcepts;

public class MethodOverloading {

	public void disp(int a) {
		System.out.println("a value is:"+a);
	}
	public void disp(char c) {
		System.out.println("c value is:"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		m.disp(2);
		m.disp('A');
	}

}
