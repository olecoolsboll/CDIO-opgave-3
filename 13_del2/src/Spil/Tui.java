package Spil;

import boundaryToMatador.GUI;

public class Tui {

	public void velkommen() {
		System.out.println("Velkommen til Terningspil");
		System.out.println("");
	}
	
	public void spiller1(){
		System.out.print("Spiller 1 skriv dit navn: ");
	}
	
	public void spiller2(){
		System.out.print("Spiller 2 skriv dit navn: ");
	}
	
	public void turn1(String playerName) {
		System.out.println(playerName + "'s tur.");
	}
	
	public void turn2(String playerName) {
		System.out.println(playerName + "'s tur.");
	}
	
	public void kast(){
		System.out.println("Indtast \"k\" for kast");
	}
	
	public void sum(){
		System.out.println("Terningerne viser samlet:\t " + Dicecup.getSum);
	}
	
	public void points1(String winName, String loseName){
		System.out.println(winName + " har vundet!\n" + loseName + " har tabt!");
		System.out.println("");
		System.out.println("Tryk på Ok for at afslutte spillet");
	}
	
	public void points2(String winName, String loseName){
		System.out.println(winName + " har vundet!\n" + loseName + " har tabt!");
		System.out.println("");
		System.out.println("Tryk på Ok for at afslutte spillet");
	}
	
	public void points3(String winName, String loseName){
		System.out.println(winName + " har vundet!\n" + loseName + " har tabt!");
		System.out.println();
		System.out.println("Tryk på Ok for at afslutte spillet");
	}
	
	public void points4(String winName, String loseName){
		System.out.println(winName + " har vundet!\n" + loseName + " har tabt!");
		System.out.println();
		System.out.println("Tryk på Ok for at afslutte spillet");
	}
	
	public void besked1(String winName, String loseName){
		GUI.showMessage(winName + " har vundet!\n" + loseName + " har tabt!");
	}
	
	public void besked2(String winName, String loseName){
		GUI.showMessage(winName + " har vundet!\n" + loseName + " har tabt!");
	}
	
	public void besked3(String winName, String loseName){
		GUI.showMessage(winName + " har vundet!\n" + loseName + " har tabt!");
	}
	
	public void besked4(String winName, String loseName){
		GUI.showMessage(winName + " har vundet!\n" + loseName + " har tabt!");
	}
	
	public void ekstratur(){
		System.out.println("Terningerne viser tilsammen 10. Ekstra tur!");
	}
	
	public void slut(){
		System.out.println("");
		System.out.println("Spillet er slut! Slutresultat:");
	}
	
	public void Felter(){
		String Tower = "Du finder en prinsesse der er låst inde i et tårn, du befrier hende og sælger hende for 250 poin, +250 pointt";
		String Crater = "Du falder ned i et krater, og betaler 200 point for at få hjælp, -200 point";
		String Palace_Gates ="Du betaler 100 point i indgang til Palacet, -100 point";
		String Cold_Dessert = "Du får koldbrand i foden, og betaler en fyr 20 point for at save den af, -20 point";
		String Walled_City = "En fyr udfordrer dig til at klarte over muren, du vinder 180 point, +180 point";
		String Monastery = "Du begår indbrud i et forladt kloster, du finder intet, 0 point";
		String Black_Cave = "Du betaler 70 point for et glas med ildfluer, -70 point";
		String Huts_In_The_Mountain = "Du betaler 60 point for en overnatning og en tvivlsom prostitueret, -60 point";
		String The_Wearwall = "Du kaster 80 point mod en mur for at smadre den, du får en ekstra tur, -80 point";
		String The_Pit = "Du hjælper en person op af et hul, personene slog dig omkuld og stjæler 90 point, -90 point";
		String Goldmine = "Du hyrer en masse mennesker til at grave efter guld for dig, +650 point";
		String [] Felter = new String[] { Tower , Crater , Palace_Gates, Cold_Dessert , Walled_City , Monastery , Black_Cave , Huts_In_The_Mountain , The_Wearwall , The_Pit, Goldmine};
		System.out.println(Felter[Dicecup.getSum - 2]);
	}
	
}

