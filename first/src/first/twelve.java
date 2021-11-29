package first;
import java.util.Scanner;
public class twelve {//armstrong number
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
int t1 = no, len = 0;
while(t1 != 0) {
	t1 = t1 / 10;
	len = len + 1;
}
int t2 = no, rem, arm = 0;
while(t2 != 0) {
	rem = t2 % 10;
	int mul = 1;
	for(int i = 0; i < len; i++) {
		mul = mul * rem;
	}
	arm = arm + mul;
	t2 = t2 /10;
}
if(arm == no) {
	System.out.println("armstrong number");
	
}else {
	System.out.println("not armstrong number");
      }
}
}
