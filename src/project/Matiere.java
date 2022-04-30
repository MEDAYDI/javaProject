package project;

public class Matiere {
	
	private String nom;
	private float ds;
	private float ex;
	private float coef;
	private Enseignant enseignant ;
	
	
	
	public Matiere(String nom,float coef ,float ds, float ex,Enseignant enseignant) {
		this.ds = ds;
		this.ex = ex;
		this.coef = coef;
		this.nom=nom;
		this.enseignant=enseignant;

	}
	
	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	
	
	public float getDs() {
		return ds;
	}


	public void setDs(float ds) {
		this.ds = ds;
	}


	public float getEx() {
		return ex;
	}


	public void setEx(float ex) {
		this.ex = ex;
	}


	public float getCoef() {
		return coef;
	}


	public void setCoef(float coef) {
		this.coef = coef;
	}


	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	 // calcul Moyen par Matiere 
	 public float  moyenMat(){
		return (ex*2+ds)/3;
	}


	

	

}
