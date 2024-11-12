package personnages;

public class Commercant extends Humain{
		
	public Commercant(String nom, int qteArgent) {
		super(nom, "thé", qteArgent);
	}
	
	
	private int seFaireExtorque() {
		int argentVole = qteArgent;
		qteArgent = 0;
		System.out.println("J'ai tout perdu ! Le monde est trop injuste...");
		return argentVole;
	}
	
	private void recevoir(int argent) {
		qteArgent = qteArgent + 100;
		System.out.println(argent + "sous ! Je te remercie généreux donateur !");
	}
}
