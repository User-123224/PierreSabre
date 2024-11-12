package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

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

		marco.parler(marco.direBonjour());
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.parler(marco.boire());

		Yakuza yaku_le_noir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		System.out.println(yaku_le_noir);

		yaku_le_noir.parler(yaku_le_noir.direBonjour());
		yaku_le_noir.extorquer(marco);

		Ronin roro = new Ronin("Roro", "shochu", 60);
		System.out.println(roro);

		roro.parler(roro.direBonjour());
		roro.donner(marco);
	}
}
