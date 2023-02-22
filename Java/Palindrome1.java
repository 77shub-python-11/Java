import java.util.Scanner;
public class Palindrome1 {
	public static void main(String[] args){
		System.out.println("Enter a no.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		int rev=0,rem = 0;
		for(;copy>0;){
			rem = copy%10;
			rev = rev*10+rem;
			copy/=10;

		}
		if(num==rev){
			System.out.println(num+"no. is palindrome");

		}else{
			System.out.println("no. is not palindrome");
		}
	}
}