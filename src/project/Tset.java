package project;
import java.lang.*;
import java.util.*;

public class Tset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Dooner le nombre des etudiants : ");
		int nbE =sc.nextInt();
		Etudiant Tetud[]=new Etudiant[nbE];
        for(int i=0;i<nbE;i++){
			System.out.println("*********************************************");
			System.out.println("*              "+(i+1)+" Etudiant                   *");
			System.out.println("*********************************************");
		 System.out.print("Nom :");
		 String nomE=sc.next();
		 System.out.print("Prenom:");
		 String PrenE=sc.next();
		 System.out.print("Identif:");
		 Long  id=sc.nextLong();
		 Etudiant et=new Etudiant(nomE,PrenE,id);
		 Tetud[i]=et;
		 System.out.print("Dooner le nombre des Matieres : ");
		 int nbM =sc.nextInt();
		   //et.creatTabMatr(nbM);
   	       for(int j=0 ; j<nbM ; j++){
		  System.out.println("*********************************************");
		   System.out.print("Nom du "+(j+1)+" Matiere:");
		   String nomM=sc.next();
		   System.out.print("coef:");
		   float cf=sc.nextFloat();
		   System.out.print("DS:");
		   float ds=sc.nextFloat();
		   System.out.print("Examen:");
		   float Ex=sc.nextFloat();
		   System.out.print("Nom de l'enseignant:");
		   String nomEn=sc.next();
		   System.out.print("identifiant de l'enseignant:");
		   Long  idEns=sc.nextLong();
		   Enseignant ens=new Enseignant(nomEn,idEns);
		   Matiere mat=new Matiere(nomM,cf,ds,Ex,ens);
		   et.affecteMat(mat);
		 }

	   }

	   System.out.println("*********************************************");
	   System.out.println("*                Resulta                    *");
	   System.out.println("*********************************************");
             
	    
	  
	// // 	System.out.println("l' etudiant "+Tetud[0].getNom()+" "+Tetud[0].getPrenom()+" a les resultas suivant" );
	// // 		System.out.println("Matiere : "+Tetud[0].tabMat[0].getNom()+"\t   Moyenne :"+Tetud[0].tabMat[0].moyenMat());
	// // 		System.out.println("Matiere : "+Tetud[0].tabMat[1].getNom()+"\t   Moyenne :"+Tetud[0].tabMat[1].moyenMat());
		
	// //     System.out.println("Moyenne General :" + Tetud[0].MoyGen());
	// //    // System.out.print("\n");

	// // 	System.out.println("l' etudiant "+Tetud[1].getNom()+" "+Tetud[1].getPrenom()+" a les resultas suivant" );
	// // 	System.out.println("Matiere : "+Tetud[1].tabMat[0].getNom()+"\t   Moyenne :"+Tetud[1].tabMat[0].moyenMat());
	// // 		System.out.println("Matiere : "+Tetud[1].tabMat[1].getNom()+"\t   Moyenne :"+Tetud[1].tabMat[1].moyenMat());
	// //   System.out.println("Moyenne General :" + Tetud[1].MoyGen());
   
	
	// 	// for(int i=0;i<Tetud[1].tabMat.length;i++){
	// 	// 	System.out.println("Matiere : "+Tetud[1].tabMat[i].getNom()+"\t   Moyenne :"+Tetud[1].tabMat[i].moyenMat());
	// 	// }
		

	//      System.out.println("moyen general : "+Tetud[0].MoyGen());
	
	    
	   for(int h=0 ;h<nbE;h++){
		   System.out.println("l' etudiant "+Tetud[h].getNom()+" "+Tetud[h].getPrenom()+" a les resultas suivant" );
		   for(int i=0;i<30;i++){
			   System.out.println("Matiere : "+Tetud[h].tabMat[i].getNom()+"\t   Moyenne :"+Tetud[h].tabMat[i].moyenMat());
		   }
		  // System.out.println("Moyenne General :" + Tetud[h].MoyGen());
		  // System.out.print("\n");

	     }


	     
		 

	   
		
	
		

	
		





		
		
		
		
		
		
		
		
			
			
		
		
		

	}

}
