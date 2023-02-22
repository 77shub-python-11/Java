import java.util.Scanner;

public class Maxnumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max = a;
		if(b>a) {
			max=b;
			
		}
		if(c>max) {
			max = c;
			
		}
		System.out.println(max);
		
		//we can also use math max function 
		int max1 = Math.max(c,Math.max(a, b));
		System.out.println(max1);
		
	}

}


