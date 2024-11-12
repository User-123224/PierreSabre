package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int qteArgent) {
		super(nom, "thé", qteArgent);
	}

	public int seFaireExtorquer() {
		int argentVole = qteArgent;
		qteArgent = 0;
		System.out.println("(" + nom + ") - " + "J'ai tout perdu ! Le monde est trop injuste...");
		return argentVole;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println("(" + nom + ") - " + argent + " sous ! Je te remercie généreux donateur !");
	}
}
