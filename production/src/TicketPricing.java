import java.util.Scanner;

public class TicketPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String departureStation,arrivalStation;
        String [][] vierzonOrléan = {{"Vierzon","Salbris"},{"Salbris","Nouans"},{"Nouans","Lamotte-Beuvron"},{"Lamotte-Beuvron","La Ferté Saint-Aubin"},{"La Ferté Saint-Aubin","Orléans"}};
        System.out.println("Quelle est votre gare de départ:");
        departureStation= sc.next();
        System.out.println("Quelle est votre gare d'arrivée:");
        arrivalStation = sc.next();
        System.out.println(stationIndex(vierzonOrléan,arrivalStation, 1));
        tabPrinter(vierzonOrléan,1);

        System.out.println(departureStation);
        System.out.println(arrivalStation);
    }

    public static int stationIndex (String[][] railNetwork, String cityName, int columnIndex ){
        int stationIndex=0;
        for(int i =0; i<=railNetwork[i].length-1; i++){
            if(railNetwork[i][columnIndex]== cityName){
                stationIndex=i;
            }
        }
        return stationIndex;
    }

    public static void tabPrinter (String[][] stationTab, int columnIndex){
        for (int j=0; j<= stationTab.length-1; j++){
            System.out.println(stationTab[j][columnIndex]);
        }
    }
}
