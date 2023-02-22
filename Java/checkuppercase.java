import java.util.Scanner;

public class checkuppercase {
	/*
	 * this will find first letter case in word
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word");
		char ch = in.next().trim().charAt(0);
		
		if (ch>='a'&& ch<='z') {
			System.out.println("lower case");
			
		}else{
			System.out.println("uppercase"); 
			
		}
		
	}

}
