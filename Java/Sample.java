public class Sample {
	int x = 10;// instance var 
	static int y = 20;// Static variable

	static{
		int p = 35;// local var 
		Sample S2 = new Sample();
		System.out.println(S2.y);// Static var

		System.out.println(p);// local variable



	}
	public static void main(String[] args) {
		Sample S1 = new Sample();//creating object 
		y = 30 + S1.x; // static  variable y 
		System.out.println(S1.x);// instance var 
		System.out.println(S1.y);// static var
		System.out.println(y);// static var



	}
}