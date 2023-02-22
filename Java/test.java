
public class test {
	public static void main(String[] args) {
		singletonDesignPattern L1 = singletonDesignPattern.getIntance();
		singletonDesignPattern L2 = singletonDesignPattern.getIntance();
		
		if(L1 == L2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}

}
