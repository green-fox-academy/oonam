package Pirates;

public class Pirate {
	int rumRounds;

	public int drinkSomeRum(int rumRounds){
		this.rumRounds = rumRounds + 1;
		return rumRounds;
	}

	public void howsItGoingMate(int rumRounds) {
		if (rumRounds < 5) {
			System.out.println("Pour me anudder!");
		} else {
			System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
		}
	}


}
