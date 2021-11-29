package first;

public class four {
public int add(int a, int b) {
	return a+b;
}
public int sub(int a, int b) {
	return a-b;
	
}
public int mul(int a, int b) {
	return a*b;
}
public int div(int a, int b) {
	return a/b;
}
public int mod(int a, int b) {
	return a%b;
}
public static void main(String [] args) {
	four f = new four();
	System.out.println(f.add(10, 20));
	System.out.println(f.sub(10, 5));
		
	System.out.println(f.mul(10, 5));
System.out.println(f.div(10, 2));
System.out.println(f.mod(10, 3));
}
}
