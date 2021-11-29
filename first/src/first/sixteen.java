
package first;

import java.util.Scanner;
public class sixteen {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int no = sc.nextInt();
    switch(no % 2 ) {
    case 1:
    	System.out.println("odd");
    	break;
    default:
    	System.out.println("even");
    }
    }
}

