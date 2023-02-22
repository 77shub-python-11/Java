import java.util.Scanner;
public class Condition {


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		

		if(age>0 && age < 18 ) {
			System.out.println("Your just kide ");
		}
		
		else if(age>= 18 && age <=60) {
			System.out.println("your adult");
		} 
		else if(age > 60 && age <= 122){
			System.out.println("your senier ");
		}
		else 
			System.out.println("Invalid input ");


	}
}