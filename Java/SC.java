import java.util.Scanner;
public class SC {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int num = 0;
		int reversed = 0;

		

		while(number>0){
			int x = number%10;
			number = number/10;
			num = x;
			switch(x){
			case 0:System.out.print(" Zero ");
				break;
			case 1:System.out.print(" one ");
				break;
			case 2:System.out.print(" Two ");
				break;
			case 3:System.out.print(" Three ");
				break;
			case 4:System.out.print(" Four ");
				break;
			case 5:System.out.print(" Five ");
				break;
			case 6:System.out.print(" Six ");
				break;
			case 7:System.out.print(" Seven ");
				break;
			case 8:System.out.print(" Eight ");
				break;
			case 9:System.out.print(" Nine ");
				break;
			}

		





			

		
		}
		System.out.println(num);


									
		}
	}
