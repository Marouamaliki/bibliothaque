package bibliotheque;

import java.util.ArrayList;

import java.util.List;

public class Bibliotheque extends Livre {
	
	protected String titre;
	
	protected String auteur;
	
	protected int annee_publication;
	
	private static List<Livre> livre;
	
	public Bibliotheque(String titre, String auteur,int annee_publication) {
		
		super(titre,auteur,annee_publication);
		
	     this.livre = new ArrayList<>();
	}
	public void AjouterLivre(String titre, String auteur,int annee_publication) {
		
		Livre livre_ajouter= new Livre(titre,auteur,annee_publication);
		
		livre.add(livre_ajouter);
	}
	
	
	public static void AfficherLivres() {
		
		System.out.print("les livres de la bibliothèque sont:"+livre);
		
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bibliotheque biblio1= new Bibliotheque("les midérables","victor hugo",1862);
		
		biblio1.AjouterLivre("la boite à merveilles", "ahmed sefriou",1954 );
		
		Bibliotheque.AfficherLivres();
	}

}
