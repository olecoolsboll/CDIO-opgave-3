package Spil;

import boundaryToMatador.GUI;

public class Dicecup {

	static Dice d1 = new Dice(); // de 2 terninger
	static Dice d2 = new Dice();
	static int getSum;

	public void shake() {
		d1.roll();
		d2.roll();
		getSum = d1.getValue() + d2.getValue();

		System.out.println("F�rste terning viser:\t" + d1.getValue());
		System.out.println("Anden terning viser:\t" + d2.getValue());

		// viser terningerne p� spillepladen
		GUI.setDice(d1.getValue(), d2.getValue());
	}

	// returnerer terningens v�rdi
	public int getSum() {

		return getSum;

	}
}
