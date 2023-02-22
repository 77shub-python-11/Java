package TypeOfBlocks;
/**
 *Set of instruction 
 *block are also called as initializer  block 
 *programmer cannot call block 
 *only java complier can call them 
 *block cannot return value 
 *block can run one time in lifetime 
 * 
 * blocks works same way as variables works 
 * @author shubham
 *
 */

public class Blocks {
	static {
		System.out.println("I am static block");
	}
	
	{
		System.out.println("I am instcance block ");
		
	}
	public static void main(String[] args) {
		Blocks b1 = new Blocks();
		{
			System.out.println( "I am local block ");
			
		}
	}

}
