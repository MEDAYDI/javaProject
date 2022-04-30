package project;

public class Etudiant {
	private String nom ;
	private String prenom ;
	private long  idL ;
	private   Matiere matiere;
	//Matiere tabMat[];
   	// Matiere tabMat[]=new Matiere[20];
	   Matiere tabMat[];
	int i=0;


	
	public Etudiant() {}
	
	public Etudiant(String nom, String prenom, long idL ) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.idL = idL;
	}
  
    
	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public long getIdL() {
		return idL;
	}
	public void setIdL(long idL) {
		this.idL = idL;
	}

	 // method creation  tab matiere 
	public  void creatTabMatr(int x){
		 tabMat=new Matiere[x];
	}
     // method affecteMat
		public void affecteMat(Matiere mat) {
			tabMat[i]=mat;
			i++;
			
		}	

    // Method moyen General 
	  public float MoyGen( ){
		  float scof=0,s=0;
		  for (int j=0 ;j<20 ; j++){
			  scof+=tabMat[j].getCoef();
			  s+=tabMat[j].moyenMat()*tabMat[j].getCoef();
		  }
		return (s/scof);
	  }

  

}
