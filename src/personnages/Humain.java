package personnages;

public class Humain {
	protected String nom;
	protected String boisson;
	protected int qteArgent;

	public Humain(String nom, String boisson, int qteArgent) {
		this.nom = nom;
		this.boisson = boisson;
		this.qteArgent = qteArgent;
	}

	protected String getNom() {
		return nom;
	}

	private void setNom(String nom) {
		this.nom = nom;
	}

	protected int getQteArgent() {
		return qteArgent;
	}

	private void setQteArgent(int qteArgent) {
		this.qteArgent = qteArgent;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public String direBonjour() {
		return ("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}

	public String boire() {
		return ("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public String acheter(String bien, int prix) {
		if (prix < qteArgent) {
			perdreArgent(prix);
			return ("J'ai " + (qteArgent + prix) + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix
					+ " sous.");
		} else {
			return ("Je n'ai plus que " + qteArgent + " sous en poche. Je n'ai peut même pas m'offrir " + bien + " à "
					+ prix + " sous.");
		}
	}

	protected void gagnerArgent(int gain) {
		qteArgent = qteArgent + gain;
	}

	protected void perdreArgent(int perte) {
		qteArgent = qteArgent - perte;
	}

}
