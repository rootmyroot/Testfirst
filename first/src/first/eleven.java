package first;

public class eleven {
public static void main(String [] args) {
	int a = 10;
	int b = 12;
	int c = 13;
	if(a < b && b < c)
		System.out.println(a+" is smaller");
	else if(b < a && a < c)
		System.out.println(b+ "  is smaller" );
	else 
		System.out.println(c + " is smaller");
}
}
