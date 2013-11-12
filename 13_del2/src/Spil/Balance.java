package Spil;

public class Balance {
	private int points;
	
	public Balance() {
		points = 1000;
	}

	// tilføjer point til spilleren
	public void addPoints(int amount)

	{
		points += amount;
	}

	// returnerer hvor mange point spilleren har
	public int getPoints() {
		return points;
	}
}
