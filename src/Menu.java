import java.util.Scanner;

public class Menu {
    ///// dans le constructeur Menu avec numberOfArray, les cases sont intitulées null..."
    private String [] menu;

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }

    public Menu( int numberOfArray) {
        this.menu = new String[numberOfArray];
        Scanner sc= new Scanner(System.in);
        for (int i =0; i<= this.menu.length-1; i++){
            System.out.println("entrez l'intitulé de la case " + (i+1) + ".");
            menu[i] = sc.next();

        }
        sc.close();
    }
    public Menu(String[] menu){
        this.menu = menu;
    }

    public void menuViewer (){
        for (int i=0; i<=this.menu.length-1; i++){
            System.out.println(this.menu[i]);
        }
    }

    public int questionAnswer (){
        // Comment supprimer le paramètre selectedMenu, qui semble util pour la méthode appelée : menuviewer?
        // Cela éviterai d'avoir à renommer l'objet souhaité dans l'appel de la méthode d'instance.
        Scanner sc= new Scanner(System.in);
        menuViewer();
        System.out.println("Veuillez entrer un nombre compris entre 1 et " + this.menu.length + ".");
        int entInput = sc.nextInt();
        saisirChoix(entInput);
        System.out.println("Vous avez choisi " + this.menu[entInput -1]);
        return entInput;
    }

    public void saisirChoix (int enter){
        int choice = enter;
        try {
            if (choice < 1) {
                throw new NotInBoundsLimit();
            }
        } catch (NotInBoundsLimit lessThan1) {
            System.out.println("Le nombre que vous avez saisi n'est pas compris entre 1 et " + this.menu.length + ".");
        }
        try {
            if (choice > this.menu.length) {
                throw new NotInBoundsLimit();
            }
        } catch (NotInBoundsLimit moreThan10) {
            System.out.println("Le nombre que vous avez saisi n'est pas compris entre 1 et " + this.menu.length + ".");
        }

        // Il reste à définir l'exception lorsqu'aucune entrée n'est faite.
        // Il reste à définir un comportement ramenant à la demande de saisie en cas d'exception levée.
    }
}
