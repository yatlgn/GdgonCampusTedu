import java.util.Scanner;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter integer k :" );
		int k = scan.nextInt();
		
		System.out.print("Enter integer l :" );
		int l = scan.nextInt();
		
		System.out.print("Enter integer m :" );
		int m = scan.nextInt();
		
		System.out.print("Enter integer n :" );
		int n = scan.nextInt();
		
		 int min = k; 

	        if (Math.abs(l) < Math.abs(min)) {
	            min = l;
	        }
	        else if (Math.abs(m) < Math.abs(min)) {
	            min = m;
	        }
	        else if(Math.abs(n) < Math.abs(min)) {
	            min = n;
	        }

	        System.out.println("The integer with minimum absolute value is: " + min);
	}
}