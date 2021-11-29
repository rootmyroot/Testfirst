package first;

public class Three {
static int gint = 100;//static varible
int nm = 20;//instance variable
public void fun1() {
	int gint = 10;//localvarible
	System.out.println(gint);
	
}
public static void main(String [] args) {
	Three myt = new Three();
	System.out.println(gint);
	System.out.println(myt.nm);
	myt.fun1();
}
}
