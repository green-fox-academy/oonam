package Animal;

public class Animal {
	int hunger;
	int thirst;

	public Animal() {
		hunger = 50;
		thirst = 50;
	}

	public int eat() {
		hunger--;
	}

	public int drink() {
		thirst--;
	}

	public int play() {
		hunger++;
		thirst++;
	}
}
