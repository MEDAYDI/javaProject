package project;

public class Enseignant {

	private String nom ;
	
	private long  idL ;
	
	
	public Enseignant(String nom, long idL) {
		super();
		this.nom = nom;
		
		this.idL = idL;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public long getIdL() {
		return idL;
	}
	public void setIdL(long idL) {
		this.idL = idL;
	}

}
