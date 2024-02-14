public class Pistolet {
    // Attributs :
    private int nombreBallesChargeur;
    private int capaciteChargeur = 6;
    private int nombreBallesReserve;
    private boolean estSilencieux;

    public Pistolet(int nombreBallesChargeur, int capaciteChargeur, int nombreBallesReserve, boolean estSilencieux) {

        if (capaciteChargeur > 0) {
            this.capaciteChargeur = capaciteChargeur;
        }

        if (nombreBallesChargeur >= 0) {
            if (nombreBallesChargeur <= this.capaciteChargeur) {
                this.nombreBallesChargeur = nombreBallesChargeur;
            } else {
                this.nombreBallesChargeur = this.capaciteChargeur;
            }
        }
        if (nombreBallesReserve > 0) {
            this.nombreBallesReserve = nombreBallesReserve;
        }
        this.estSilencieux = estSilencieux;
    }

    public void tirer() {
        // - Le nombre de balles diminue de 1
        //- Ça affiche "BOOM!" sur la console si le pistolet fait du bruit,
        // "(piou)" sinon
        //- Si on n'a plus de balles dans la charge actuelle, ça affiche
        // "*tkt*" à la place

        if (nombreBallesChargeur > 0) {
            nombreBallesChargeur--;
            if (estSilencieux) {
                System.out.println("(piou)");
            } else {
                System.out.println("BOOM!");
            }
        } else {
            System.out.println("*tkt*");
        }
    }

    public void recharger() {
        //Quand on recharge :
        //- Ça affiche "*clic*" autant de fois qu'on a de balles à ajouter pour
        // atteindre la capacité maximale
        //- On recharge du nombre maximal possible : on ne peut pas recharger
        // plus de balles que ce qui reste dans la réserve de balles

        while (nombreBallesChargeur < capaciteChargeur && nombreBallesReserve > 0) {
            nombreBallesChargeur++;
            nombreBallesReserve--;
            System.out.print("*clic*");
        }
        System.out.println();
    }


    public boolean estDecharge() {
        return nombreBallesChargeur == 0;
    }
}
