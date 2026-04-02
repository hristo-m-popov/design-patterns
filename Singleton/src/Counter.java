public class Counter {
	private static Counter instance;
	private int value = 0;
	
	private Counter() {}
	
	public static Counter getInstance() {
		if(instance == null)
			instance = new Counter();
		return instance;
	}
	
	public void increment() {
		value++;
	}
	
	public int getValue() {
		return value;
	}
	
	public void ShowName() {
		System.out.println(instance.getValue());
	}
}