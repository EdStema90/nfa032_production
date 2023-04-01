import java.util.Scanner;

public class TicketPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String departureStation,arrivalStation;
        String [][] vierzonOrléan = {{"Vierzon","Salbris","Nouans","Lamotte-Beuvron","La Ferté Saint-Aubin"},{"Salbris","Nouans","Lamotte-Beuvron","La Ferté Saint-Aubin","Orléans"}};
        System.out.println("Quelle est votre gare de départ:");
        departureStation= sc.next();
        System.out.println("Quelle est votre gare d'arrivée:");
        arrivalStation = sc.next();

        System.out.println(departureStation);
        System.out.println(arrivalStation);
    }

    public static int stationIndex (String cityName, int columnIndex ){
        int stationIndex=0;

        return stationIndex;
    }

    public static void tabPrinter (String[][] stationTab){
    }
}
