import java.util.Scanner;

public class Q9 {
public static void main(String[]args) {
		
		// Q9 print number pyramid (advance question)
	    /*
	     *        1
	     *       2 2
	     *      3 3 3
	     *     4 4 4 4
	     *    5 5 5 5 5 
	     */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give row number");
		int rows = sc.nextInt();
		
		for(int i=1; i<=rows;i++) {
			// spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			// number -> printing row number,row number of times
		    for(int j=1;j<=i;j++) {
		    	System.out.print(i+" ");
		    }
		    System.out.println();
		}
		
	}
}
