public class Etudiant {
    private String nom;
    private int numeroDA;

    private int moyenneGenerale;


    public Etudiant(String nom, int numeroDA) {
        this.nom = nom;
        this.numeroDA = numeroDA;
        moyenneGenerale = 0;
    }

    public void modifierMoyenne(int nouvelleMoyenne) {
        if (nouvelleMoyenne >= 0 && nouvelleMoyenne <= 100) {
            moyenneGenerale = nouvelleMoyenne;
        } else {
            System.out.println("La moyenne saisie pour " + nom + " est invalide!");
        }
    }

    public String getNom() {
        return nom;
    }

    public int getNumeroDA() {
        return numeroDA;
    }


}
