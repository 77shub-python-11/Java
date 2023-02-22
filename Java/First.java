import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		//System.out.println("Hello ");
		//System.out.println("Shubham");
		//System.out.println("नमस्ते");
		//System.out.println("नमस्कार");
		
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter a string ");
		String original = sc.next();
		int count = 0;
		
		for(int i = 0;i<=original.length()/2;i++)
			for(int j=original.length()/2;j>=0;j--)
				if(original.charAt(i)==original.charAt(original.length())-j)
					count++;
				
		}
	}
		

	



 