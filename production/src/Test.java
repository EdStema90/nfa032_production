import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

    }
}
class planete {
    String name, matiere;
    int diametre;

    public planete(String name, String matiere, int diametre) {

        this.name = name;
        this.matiere = matiere;
        this.diametre = diametre;
    }

    public void planetCreation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le nom de cette planète.?");
        this.name = sc.next();
        System.out.println("Quel est la matière de cette planète.?");
        this.matiere = sc.next();
    }
}
