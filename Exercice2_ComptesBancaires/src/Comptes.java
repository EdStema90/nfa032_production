public class Comptes{
     private String accountNumber;
     private String titulaire;
     private int solde =0;


    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Comptes(String accountNumber, String titulaire, int montant) {
    this.solde = montant;
    this.titulaire= titulaire;
    }


    void deposer(int montant){
        solde=  solde + montant;
        System.out.println( this.titulaire +", votre compte a été crédité de "+ montant+ " euros.");
    }
    void retirer (int montant){
        solde=  solde - montant;
        System.out.println( this.titulaire +", votre compte a été débité de "+ montant+ " euros.");
    }
    void deposerVers (int montant, Comptes destination){
        this.retirer(montant);
        destination.deposer(montant);
    }
    void afficher(){
        System.out.println( "Compte numéro: " + accountNumber+ ". Titulaire: " + this.titulaire +". Solde: " + solde +"euros");
    }
    void a
}
