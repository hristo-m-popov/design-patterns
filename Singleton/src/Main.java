public class Main {

	public static void main(String[] args) {
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();

		c1.increment();
		c2.increment();
		c2.increment();
		c1.increment();

		
		System.out.println(c1.getValue());
		System.out.println(c2.getValue());
		c2.ShowName();
	}
}