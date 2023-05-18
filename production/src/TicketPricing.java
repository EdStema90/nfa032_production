import java.util.Locale;
import java.util.Scanner;

public class TicketPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String researchedStation;
        String [] vierzonOrléan = {"vierzon","salbris","nouans","lamotte-beuvron", "la ferté saint-aubin","orléans"};
        System.out.println("Quelle est votre gare de départ:");
        researchedStation= sc.next();
        researchedStation= researchedStation.toLowerCase(Locale.ROOT);
        System.out.println(stationIndex(vierzonOrléan, researchedStation));
        tabPrinter(vierzonOrléan);

    }

    public static int stationIndex (String[] railNetwork, String cityName ){
        int index=0;
        for (int i =0; i<=railNetwork.length-1; i++){
            if (cityName.equals(railNetwork[i])){
                index=i;
            }

        }
        return index;
    }

    public static void tabPrinter (String[] stationTab){
        for (int i=0; i<= stationTab.length-1; i++){
            System.out.println(stationTab[i]);
        }
    }
}
