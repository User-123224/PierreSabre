package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int qteArgent, String clan) {
		super(nom, boisson, qteArgent);
		this.clan = clan;
		this.reputation = 0;
	}

	public void extorquer(Commercant victime) {
		System.out.println("(" + nom + ") - " + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		int argent_vole = victime.qteArgent;
		System.out.println("(" + nom + ") - " + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");

		victime.seFaireExtorquer();
		System.out.println("(" + nom + ") - " + "J'ai piqué les " + argent_vole + " sous de " + victime
				+ ", ce qui me fait " + (qteArgent + argent_vole) + " sous dans ma poche. Hi ! Hi !");
	}

}