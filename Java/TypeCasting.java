import java.util.Scanner;

public class TypeCasting {
	/* 
	 * 
	 *   
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float num = input.nextFloat();//When we provide here int it automatically convert it to float 
		//but it does not convert automatically in smaller data type 
		System.out.println(num);
		
		
		// for converting in smaller data type we have to do type casting 
		int num1 = (int)(11.23);
		System.out.println(num1);
		
	}
	

}
