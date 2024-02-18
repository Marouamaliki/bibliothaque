package bibliotheque;

public  class Livre {
	protected String titre;
	protected String auteur;
	protected int annee_publication;
	
	
	public Livre(String titre, String auteur , int annee_publication) {
		this.titre=titre;
		this.auteur=auteur;
		this.annee_publication=annee_publication;
	}
	
	public void AfficherDetails() {
		System.out.print("le titre de livre est "+titre+" le nom d'auteur "+auteur+" l'année de publication est "+annee_publication);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
