package personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, String boisson, int qteArgent) {
		super(nom, boisson, qteArgent);
		this.honneur = 1;
	}

	public void donner(Commercant beneficiaire) {
		System.out.println("(" + nom + ") - " + beneficiaire.getNom() + " prend ces " + qteArgent / 10 + " sous.");
		beneficiaire.recevoir(qteArgent / 10);
		qteArgent = qteArgent - qteArgent / 10;
	}
}
