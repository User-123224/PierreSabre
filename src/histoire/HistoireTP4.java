package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 100);
		System.out.println(prof);
		
		Commercant marco = new Commercant("Marco", 20);
		System.out.println(marco);
	}
}
