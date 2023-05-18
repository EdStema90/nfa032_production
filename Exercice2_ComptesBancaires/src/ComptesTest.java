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

        for (int i=0;i<=cTab.length-1; i++) {
            System.out.println("Quel est le nom du titulaire de ce compte?:");
            String holderName = sca.next();
            String accountNumber= accountNumSetter(i);
            cTab[i] = new Comptes( holderName, accountNumber);
        }

        for (int i=0; i<=cTab.length-1; i++){
            cTab[i].deposer(200+ 100*i);
        }

        for ( int i=0; i<=cTab.length-1; i++ ){
            System.out.println();
        }
        sca.close();
    }
    public String accountNumSetter ( int tabIndex){
        String accountNumber=  null;

        if (tabIndex == 0) {
            accountNumber = "001";
        } else if (tabIndex > 0 && tabIndex < 10) {
            accountNumber = "00" + tabIndex;
        } else if (tabIndex > 9 && tabIndex < 100) {
            accountNumber = "0" + tabIndex;
        }
        return accountNumber;
    }
}
