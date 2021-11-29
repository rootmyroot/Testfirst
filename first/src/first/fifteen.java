package first;
import java.util.Scanner;
public class fifteen {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rev = 0, rem, temp = no;
		while(temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp /10;
		}
		if(rev == no) {
			System.out.println(no+ " is palindrome");
		}
		else {
			System.out.println(no+" is not palindrome");
		}
	
}
}
