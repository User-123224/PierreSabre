package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		System.out.println(prof);

		prof.parler(prof.direBonjour());
		prof.parler(prof.acheter("une boisson", 12));
		prof.parler(prof.boire());
		prof.parler(prof.acheter("un jeu", 2));
		prof.parler(prof.acheter("un kimono", 50));
		
		Commercant marco = new Commercant("Marco", 20);
		System.out.println(marco);
	}
}
