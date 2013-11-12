package Spil;


public class Test {

	public static void main(String[] args) {

Dice d1 = new Dice(); 
Dice d2 = new Dice();
int[] arr = new int[] { 250, -200, -100, -20, 180, 0, -70, -60, -80, -90, 650 };
boolean gameRunning = true;

	d1.roll();
	d2.roll();
	int sum = d1.getValue() + d2.getValue();
		Balance b1 = new Balance();
		
		System.out.println("Start score: 1000");
		b1.addPoints(arr[sum - 2]);
		System.out.println("Terning sum: " + sum + "	Point: " + arr[sum -2] + "	Samlet score: " + b1.getPoints());
		
		while (gameRunning) {
	 if (b1.getPoints() >= 3000){
		 System.out.println("Spillet er vundet");
		 gameRunning = false;
	 } else if (b1.getPoints() >= 0){
		d1.roll();
		d2.roll();
		int sum2 = d1.getValue() + d2.getValue();
		b1.addPoints(arr[sum2 - 2]);
		System.out.println("Terning sum: " + sum2 + "	Point: " + arr[sum2 -2] + "	Samlet score: " + b1.getPoints());
	} else if (b1.getPoints() < 0){
		System.out.println("Spillet er tabt");
		gameRunning = false;}
		}	
	}
}	



