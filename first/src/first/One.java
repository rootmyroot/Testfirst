package first;

public class One {
public static void main(String [] args) {
One o = new One();//object creation
int r = o.add(5,4);//call method
	System.out.println(r);
o.printName();
}
public int add(int a, int b) {//method signature
	return a+b;
}
public void printName() {
	System.out.println("Name "+ "Dev Choudhari");
}
}
