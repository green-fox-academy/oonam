package Petrol_Station;

public class Station {
	int gasAmount;

	public Station() {
		gasAmount = 1000;
	}

	public void refill(Car car) {
		gasAmount -= car.capacity;
		car.gasAmount = car.capacity;
	}
}
