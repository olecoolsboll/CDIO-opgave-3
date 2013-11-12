package Spil;

import java.util.Random;

public class Dice {
	Random r;
	int value;

	public Dice() {
		r = new Random();
	}

	// "kaster" terningen ved at gemme en tilf�ldig v�rdi mellem 1 og 6 i value
	public void roll() {
		value = r.nextInt(6) + 1;
	}

	// returnerer terningens v�rdi
	public int getValue() {
		return value;
	}
}
