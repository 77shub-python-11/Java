/**
 * 
 * Singleton design pattern make only single object of class this called singleton design pattern 
 * this help to reduce memory wastes and it makes memory efficient   
 */

public class singletonDesignPattern {
	private static singletonDesignPattern S1;
	
	private singletonDesignPattern() {
	}
	
	static {
		S1 = new singletonDesignPattern();
	}
	
	
	
	public static singletonDesignPattern getIntance() {
		return S1;
		
	}
	
	
	
	
	
	public void starPattern(int lines) {
		for(int line = 0;line<lines ;line++) {
			for(int space =3;space>=line;space--) {
				System.out.print(" ");
				
			}
			for(int ast =0;ast<=line;ast++) {
				System.out.print("* ");
			}
			System.out.println();
	}
    }
	
	public boolean isPrime(int num) {
		boolean isPrime = false;
		
		int count = 0;
		for(int i =1;i<num;i++) {
			if(num%i==0)
				count++;
			if(count>2) {
				break;
				
			}
			if(count<=2)
				isPrime = true;
			else
				isPrime = false;
			
		}
		return isPrime;
		
	}
	
	

}
