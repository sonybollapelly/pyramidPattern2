public class PyramidPattern2 {
	public static void main(String[]args) {
		int rows=5;
		for(inti=1;i<=rows;i++) {
			for(int j=rows-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.print();
		}
	}
}

