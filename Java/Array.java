public class Array {
	public static void main(String[] args) {
		int[] x = new int[5];
		x[3]=2;
		int[] y = {30,90,80,54,23 };
		int[][] c={{12,23},{34,67},{77,55}};


		for(int i=0;i<x.length;i++){
			for(int j=0;j<[i].length;j++){
				System.out.print(x[i][j]+",");
			}
			System.out.println();
		}


		System.out.println(x[3]);
		System.out.println(y[3]);

	}
}