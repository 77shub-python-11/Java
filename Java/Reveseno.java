import java.util.Scanner;

public class Reveseno {
	/*
	 * Reverse the given no.
	 * using % and / function 
	 * %10 will give last no. of given input 
	 * and then rem no. with /10 it will give remaining input no. than store it in reverse no. such way that rev*10+rem  
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. to reverse ");
		int num = in.nextInt();
		
		int ans = 0;
		
		while(num>0) {
			int rem = num % 10;
			num = num/10;
			
			
			ans = ans*10+rem;
			
			
		}
		System.out.println("Reverse no. of give input is "+ ans);
	}

}
