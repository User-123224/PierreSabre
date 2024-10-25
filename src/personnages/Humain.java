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
	
	
	public void direBonjour() {
		System.out.println("Bonjour ! Je m'appelle " + nom + "et j'aime boire du " + boisson );
	}
	
	public void boire() {
		System.out.println("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		System.out.println("J'ai " + qteArgent + "sous en poche. Je vais pouvoir m'offrir " + bien + "à " + prix + "sous.");
	}
	
	private void gagnerArgent(int gain) {
		qteArgent = qteArgent + gain;
	}
	
	private void perdreArgent(int perte) {
		qteArgent = qteArgent - perte;
	}
	

}

