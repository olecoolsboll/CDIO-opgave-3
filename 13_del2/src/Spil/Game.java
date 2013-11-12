package Spil;

import java.awt.Color;
import java.util.Scanner;
import boundaryToMatador.GUI;

public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player p1, p2; // de to spillere
		int turn = 0; // holder styr på hvis tur det er
		Dicecup dc = new Dicecup();
		Tui tekst = new Tui();
		String command;
		Balance b1 = new Balance();
		Balance b2 = new Balance();
		

		int[] arr = new int[] { 250, -200, -100, -20, 180, 0, -70, -60, -80, -90, 650 };

		// velkommens tekst
		tekst.velkommen();
		tekst.spiller1();
		p1 = new Player(scan.next(), Color.PINK); // opretter en ny spiller med det indtastede navn og farve 1
		tekst.spiller2();
		p2 = new Player(scan.next(), Color.YELLOW); // opretter endnu en ny spiller med det indtastede navn og farve 2

		GUI.create("fields5.txt");
		GUI.addPlayer(p1.getName(), 0, p1.getColor()); // tilføjer spiller 1 til pladen
		GUI.addPlayer(p2.getName(), 0, p2.getColor()); // tilføjer spiller 2 til pladen
		GUI.setCar(1, p1.getName()); // sætter spiller 1 position til 1
		GUI.setCar(1, p2.getName()); // og spiller 2 til 1

		GUI.setBalance(p1.getName(), b1.getPoints());
		GUI.setBalance(p2.getName(), b2.getPoints());

		boolean gameRunning = true;

		while (gameRunning) {

			boolean ekstratur = true;

			while (ekstratur) {
				System.out.println();

				// Printer hvis tur det er.
				if (turn == 0)
					tekst.turn1(p1.getName());
				else if (turn == 1)
					tekst.turn2(p2.getName());

				command = "";

				// Bruger indtaster "k" for kaste terningen
				while (!command.equals("k")) {
					tekst.kast();
					command = scan.next();
				}

				dc.shake();

				// Printer terningerne i konsollen
				tekst.sum();

				System.out.println();

				// Tilføj point til den der kastede terninger
				if (turn == 0) {
					b1.addPoints(arr[Dicecup.getSum - 2]);
					p1.setPosition(Dicecup.getSum);
					tekst.Felter();
				} else {
					b2.addPoints(arr[Dicecup.getSum - 2]);
					p2.setPosition(Dicecup.getSum);
					tekst.Felter();
				}

				// Opdater point på spillepladen
				GUI.setBalance(p1.getName(), b1.getPoints());
				GUI.setBalance(p2.getName(), b2.getPoints());

				// Hvis en af spillerne har vundet eller tabt, stop spillet og print besked
				if (b1.getPoints() >= 3000) {
					tekst.points1(p1.getName(), p2.getName());
					GUI.setCar(12, p1.getName());
					tekst.besked1(p1.getName(), p2.getName());
					gameRunning = false;
				} else if (b2.getPoints() >= 3000) {
					tekst.points2(p2.getName(), p1.getName());
					GUI.setCar(12, p2.getName());
					tekst.besked2(p2.getName(), p1.getName());
					gameRunning = false;
				} else if (b1.getPoints() <= 0) {
					tekst.points3(p2.getName(), p1.getName());
					GUI.setCar(1, p1.getName());
					tekst.besked3(p2.getName(), p1.getName());
					gameRunning = false;
				} else if (b2.getPoints() <= 0) {
					tekst.points4(p1.getName(), p2.getName());
					GUI.setCar(1, p2.getName());
					tekst.besked4(p1.getName(), p2.getName());
					gameRunning = false;
				}

				// Opdater spillerne position på spillepladen
				if (turn == 0) {
					GUI.removeAllCars(p1.getName());
					GUI.setCar(p1.getPosition(), p1.getName());
				} else if (turn == 1) {
					GUI.removeAllCars(p2.getName());
					GUI.setCar(p2.getPosition(), p2.getName());
				}

				if (Dicecup.getSum != 10)
					ekstratur = false;
				else
					tekst.ekstratur();
			}
			

			// Skift spilleren tur
			if (turn == 0) {
				turn = 1;
			} else if (turn == 1) {
				turn = 0;
			}
		}

		// Print slutresultatet i konsollen
		tekst.slut();

		scan.close();
		System.exit(0);
	}

}
