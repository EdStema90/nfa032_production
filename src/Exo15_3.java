import java.io.IOException;
import java.util.Scanner;

public class Exo15_3 {
    public static void main(String[] args) {
        String [] menu1= {"1. Accueil","2. Forum","3. Aide et contact","4. Vive clash of clan"};
        String[] menu2 = {" la Pizza","les Pancakes"," du Couscous"};
        Menu Menu1 = new Menu(menu1);
        Menu Menu2 = new Menu(menu2);

        Menu2.questionAnswer();
        Menu Menu3 = new Menu (4);
        Menu3.questionAnswer();
        ///// Comment supprimer le paramètre selectedMenu, qui semble util pour la méthode appelée : menuviewer?
        ///// Cela éviterai d'avoir à renommer l'objet souhaité dans l'appel de la méthode d'instance.

    }
    public int choiceMaker(String[] optionTab){
        // Méthode permettant d'afficher le tableau d'options à choisir et de demander un choix à l'utilisateur.

        Scanner sc = new Scanner(System.in);
        stringTabViewer(optionTab);
        System.out.println("Veuillez entrer un nombre compris entre 1 et 4.");
        int enter = sc.nextInt()-1;
        saisirChoix(enter);
        sc.close();
        return enter;

    }

    public void stringTabViewer (String[] menuTab){
        for (int i=0; i<=menuTab.length-1; i++){
            System.out.println(menuTab[i]);
        }
    }
    public static void saisirChoix (int enter){
        int choice = enter;
        try {
            if (choice < 1) {
                throw new NotInBoundsLimit();
            }
        } catch (NotInBoundsLimit lessThan1) {
            System.out.println("Le nombre que vous avez saisi n'est pas compris entre 1 et 4.");
        }
        try {
            if (choice > 4) {
                throw new NotInBoundsLimit();
            }
        } catch (NotInBoundsLimit moreThan10) {
            System.out.println("Le nombre que vous avez saisi n'est pas compris entre 1 et 4;");
        }

        ///// Il reste à définir l'exception lorsqu'aucune entrée n'est faite.
        ///// Il reste à définir un comportement ramenant à la demande de saisie en cas d'exception levée.
        ///// Puis-je simplifier l'écriture des exceptions notInBoundsLimit en rattrapant 2 try avec un catch?
    }

}
class NotInBoundsLimit extends Exception {}
class MissingInput extends Exception {}



