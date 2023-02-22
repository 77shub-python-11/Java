import java.util.Scanner;
/*
 * int n = 45535;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
}
 */
public class countnohowmanytimeappeared {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter no ");
	int n = in.nextInt();
	System.out.println("Enter no. to find how many times appered ");
	int b = in.nextInt();
	
	     int count = 0;
	     while(n > 0) {
	    	 int rem = n % 10;
	    	 if(rem == b) {
	    		 count++;
	    		 
	    	 }
	    	 n = n/10;
	    	 
	     }
		System.out.println("Number appared in given input "+count);
	}

}


