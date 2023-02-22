import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		i = sc.nextInt();

		while(i>=0){
			while(j<i){
				System.out.print("*");
				

			}
			i--;

		}


	}
}