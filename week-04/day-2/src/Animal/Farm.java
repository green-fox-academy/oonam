package Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	List<Animal> animals;
	int freePlaces;

	public Farm() {
		animals = new ArrayList();
		freePlaces = 1;
	}

	public void breed() {
		if (freePlaces >= 0) {
			Animal animal = new Animal();
			animals.add(animal);
		}
	}

}
