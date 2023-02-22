import java.util.Scanner;
public class Loop {


	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter no. of times you have to print ");

		

		int i = 1;//Starting point

		while(i<=10){//ending point
			System.out.println("Hello");
			i = i+1;//i increment 
		}

		int j = 10;

		while(j>=1){
			System.out.println("hii");
			j = j-1;

		}
		
		int y = 0;
		while(y<10)
			System.out.println("hello"+(y++));


		
		int k = 1;

		while(k<=100){
			if(k%2==0){
				System.out.print(k+" ");

			k++;

			}

		}
		

		
		
	}
	
}