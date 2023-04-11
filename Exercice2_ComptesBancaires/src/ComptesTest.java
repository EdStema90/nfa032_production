import java.util.Scanner;

public class ComptesTest {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
    //    Comptes cMaxime = new Comptes("Maxime", 0);
    //    Comptes cArnaud = new Comptes("Arnaud", 0);
    //    cMaxime.deposer(500);
    //    cArnaud.deposer(1000);
    //    cArnaud.retirer(10);
    //    cMaxime.deposerVers(75, cArnaud);
    //    cMaxime.afficher();
    //    cArnaud.afficher();

        Comptes [] cTab = new Comptes[10];
        String accountNumber=null;
        for (int i =0; i<=cTab.length-1; i++) {
            if (i == 0) {
                accountNumber = "001";
            } else if (i > 0 && i < 10) {
                accountNumber = "00" + i;
            } else if (i > 9 && i < 100) {
                accountNumber = "0" + i;
            }
        }
        String accountName = "c"+ accountNumber;
        for (int i=0;i<=cTab.length-1; i++) {
            System.out.println("Quel est le nom du titulaire de ce compte?:");
            String holderName = sca.next();
            System.out.println("Quel est son solde de départ?");
            int initialBalance = sca.nextInt();
            cTab[i] = new Comptes(accountNumber, holderName, initialBalance);
        }

        for (int i=0; i<=cTab.length-1; i++){
            cTab[i].deposer(200+ 100*i);
        }

        for ( int i=0; i<=cTab.length-1; i++ ){
            System.out.println();
        }

        sca.close();
    }
}
