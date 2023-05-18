public class Compte {
    String numeroDeCompte;
    int solde;

    public void deposer(int montant){
        this.solde= this.solde + montant;
    }
    void retirer (int montant) {
        if (montant > solde) {
            System.out.println("Le solde de ce compte est insuffisant pour retirer cette somme.");
        } else if (montant <= solde) {
            this.solde = this.solde - montant;
        }
    }
    public void virerVers (int montant, Compte destination){
        this.retirer(montant);
        if (montant<= this.solde){
            destination.deposer(montant);
        }else{
            System.out.println("Cette opération est impossible, provision insuffisante.");
        }
    }
    void afficherSolde(){
        System.out.println("Votre solde est de " + this.solde + " euros.");
    }

    public Compte (String accountNumber, int sold){
        this.numeroDeCompte= accountNumber;
        this.solde= sold;
    }

}
