import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        boolean addBook= true;
        ArrayList <Book> bibliotheque = new ArrayList();
        bibliotheque.add(new Book("Voyage au centre de la Terre","Jules Verne","Eyrolle"));
        bibliotheque.add(new Book("Voyage au centre de la Terre","Jules Verne","Eyrolle"));
        bibliotheque.add(new Book("Voyage au centre de la Terre","Jules Verne","Eyrolle"));


        ///// PROBLEME!!!: l'utilisation du scanner pour enregistrer successivement
        // plusieurs chaînes de caractères ne fonctionne
        ///// pas à la manière dont je l'ai utilisé, il ,ne fonctionne qu'une fois à la première saisie.
        ///// En utilisant sc.nextline, 2 saisies sur 3 sont possibles, mais la première occurence de sc... est omise.
        while (addBook==true){
            Scanner sc= new Scanner(System.in);
            System.out.println("Voulez-vous enregistrer un nouveau livre?");
            String answer= sc.next();
            answer= answer.toLowerCase(Locale.ROOT);
            if (answer.equals("yes")){
                System.out.println("Enter book's title:");
                String bookTitle= sc.next();
                System.out.println("Enter autor's name:");
                String autorName=sc.nextLine();
                System.out.println("Enter editor's name");
                String editorName=sc.nextLine();
                bibliotheque.add(new Book(bookTitle,autorName,editorName));
                sc.close();
            }
            if (answer.equals("no")){
                addBook=false;
                System.out.println("fin du programme.");
            }
        }
        for (int i=0; i<= (bibliotheque.size()-1); i++) {
            bibliotheque.get(i).titleAutorEditorviewer();
        }

    }

}
