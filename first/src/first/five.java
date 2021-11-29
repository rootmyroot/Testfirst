package first;

public class five {
	int i = 10;

public int inc() {//increment method
	return i++;
}
public int dec() {//decrement method
	return i--;
	
}
public static void main(String [] args) {
	five f = new five();
	System.out.println(f.i);
	f.inc();
	System.out.println(f.i);
	f.dec();
	System.out.println(f.i);
	
	
	
}
}