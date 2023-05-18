import java.util.ArrayList;
import java.util.Scanner;

public class Bibliotheque {
    ArrayList<Book> bibliothequeX;

    public Bibliotheque( ) {
        this.bibliothequeX = new ArrayList<Book>();
    }

    public void bookRecorder(String bookTitle, String autorName, String editorName){
        bibliothequeX.add(new Book(bookTitle,autorName,editorName));
    }

    public void bibliothequedisplayer(){
        for (int i =0;i<= (bibliothequeX.size()-1); i++){
            System.out.println(bibliothequeX.get(i).titleAutorEditorviewer());
        }
    }
    public void employerBookRecorder(){
        System.out.println("Enter autor's name:");
        String bookTitle= inputGetter();
        System.out.println("Enter book's title:");
        String autorName= inputGetter();
        System.out.println("Enter editor's name:");
        String editorName= inputGetter();
        bibliothequeX.add(new Book(bookTitle,autorName,editorName));
    }
    String inputGetter(){
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        return userInput;

    }

}
