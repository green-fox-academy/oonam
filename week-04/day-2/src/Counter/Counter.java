package Counter;

public class Counter {
	int counter;
	int temp;

	public Counter() {
		counter = 0;
	}

	public Counter(int counter) {
		this.counter = counter;
		temp = counter;
	}

	public void add(int number) {
		counter += number;
	}

	public void add() {
		counter++;
	}

	public int get() {
		return counter;
	}

	public int reset() {
		return counter = temp;
	}
}
