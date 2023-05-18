public class Operations {
    public static void main(String[] args) {
        Compte c1 = new Compte ("001", 1000);
        Compte c2 = new Compte("002", 200);
        c1.afficherSolde();
        c2.afficherSolde();
        c2.retirer(300);
        c2.afficherSolde();
        c1.virerVers(300, c2);
        c2.afficherSolde();
        c1.afficherSolde();
        c1.virerVers(1000,c2);

    }
}
