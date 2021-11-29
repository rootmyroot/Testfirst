


package first;
import java.util.*;
public class ten {
	
public static void whileLoop() {
	int i = 1;
	while(i <= 20) {
		System.out.print("\t"+ i);
		i++;
	}
}
public void oddEven(int i) {
	if(i % 2 == 0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	
	
}
public void oEven() {
	int i = 10;
	while(i <= 100) {
		if(i % 2 == 0) {
			System.out.println(i+" even");
		}
		else {
			System.out.println(i+" "
					+ "odd");
		}
		i++;
	}
}
public void doWhile() {
	int i = 1;
	do{
		System.out.println(i);
		i++;
	}while(i < 11);
}
public static void main(String[] args) {
	whileLoop();
    ten t = new ten();
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	t.oddEven(i);
	t.oEven();
	t.doWhile();
	
	
}
}
