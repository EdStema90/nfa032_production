import java.util.Scanner;

public class Exo15_1 {
    static int[] tableau = {17,12,15,38,29,157,89,-22,0,5};
    static int division(int indice, int diviseur){
        return tableau[indice]/diviseur;
    }

    public static void main(String[] args) throws NullDivisor, OutOffTabIndex{

        Scanner sc = new Scanner (System.in);
        int x,y;
        do {
        System.out.println("Entrez l'indice de l'entier à diviser: ");
        x= sc.nextInt();

        // Je défini l'exception en cas de nombre tapé en dehors des limites d'indices du tableau.

            try {
                if (x < 0) {
                    throw new OutOffTabIndex();
                }
                if (x > tableau.length - 1) {
                    throw new OutOffTabIndex();
                }

            } catch (OutOffTabIndex ErrorMessage) {
                int tabTopBound = tableau.length - 1;
                System.out.println("le nombre que vous pouvez taper doit être situé entre " + 0 + " et " + tabTopBound + ".");
            }
        }while(x<0 ||x> tableau.length-1 );
        //boucle cherchant à renvoyer l'utilisateur vers une saisie tant qu'elle n'est pas définie.

        // Je déclare mon diviseur:
        System.out.println("Entrez le diviseur:");
        do {
        y = sc.nextInt();

            try {
                if (y == 0) {
                    throw new NullDivisor();
                }
            } catch (NullDivisor ErrorMessage) {
                System.out.println("Le diviseur ne peut être égale à 0.");
            }
        }while (y==0);
    // Questionnement: Je met ce do-while car je veux que le programme continue de demander à l'utilisateur d'entrer
        // le diviseur  à l'utilisateur tant qu'il n'a pas arrêté de lever l'exception.

    // Je finalise mon programme en faisant un affichage console du résultat de la division.
        System.out.println("Le résultat de la division est: " + division(x,y)+ ".");
    }
    static class NullDivisor extends ArithmeticException {}
    static class OutOffTabIndex extends ArrayIndexOutOfBoundsException{}

    // Questionnement: Pourquoi mes class d'exceptions exigent ici d'êtres misent en static alors que e n'est pas le même cas dans les exemples cités en cours?
}
