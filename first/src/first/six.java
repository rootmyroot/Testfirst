package first;

public class six {
	public void eql() {
		int i = 9;

	if(i == 9) {
		System.out.println("i has value nine");
	}
	else {
		System.out.println("i has other value");
	}
	}
	public void notEql() {
		int i = 9;
		if(i != 9) {
			System.out.println("i has value has other than nine");
		}
		else {
			System.out.println("i has nine value");
		}
	}
	public static void main(String [] args) {
	six s = new six();
	s.eql();
	s.notEql();
}
}
