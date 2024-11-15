package work1;

public class Work1 {

    public static void main(String[] args) {
    	
        // Définition des variables
        double prixIphone = 285000; 
        double taxe = 0.15; 
        double montantParJour = 2500; 

        // Calcul du montant total à économiser (incluant la taxe)
        double montantTotal = prixIphone + (prixIphone * taxe);

        // Calcul du nombre de jours nécessaires pour économiser
        int nombreDeJours = (int) Math.ceil(montantTotal / montantParJour);

        // Affichage du résultat
        System.out.println("Le nombre de jours nécessaires pour économiser " +
                montantTotal + " Gourdes est : " + nombreDeJours + " jours.");
    }
}