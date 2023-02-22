import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		int num =0,reversed = 0;
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		num = sc.nextInt();
		int Onum = num;


		while(num != 0){
			int digit = num%10;
			reversed = reversed * 10 + digit;

			num /= 10;

		}

		if (Onum == reversed){
			System.out.println("Number is palindrome "+Onum);

		}
		else{
			System.out.println("Number is not  palindrome");
		}




	}
}