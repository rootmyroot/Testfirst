package first;

public class eighteen {
public static void main(String [] args) {
	int [] numbers = {1, 2, 3, 4, 5,};
	int addition = 0;
	for(int i = 0; i < numbers.length; i++) {
		addition = addition + numbers[i];
	}
	int avg = addition/numbers.length ;
	System.out.println("avg = "+ avg);
	System.out.println("sum = "+ addition);
}
}
