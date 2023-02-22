//import java.util.Scanner;
public class Block {
	{
		System.out.println("I'm instances block ");

	}

	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter age ");
		//int age = sc.nextInt();
		//System.out.println(age);

	}
	static{
		System.out.println("I'm Static block ");
		Block B1 = new Block();// calling instances block 
		{
			System.out.println("I'm inner block or local ");
		}


	}
}