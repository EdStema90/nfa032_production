public class Test {
    public static void main(String[] args) {
        int [] tab1 = {3,5,11,2,28};
        for (int i =0; i<=tab1.length-1; i++){
            for(int j=0;j<=tab1.length-1;j++){
                if (tab1[i]<tab1[j]){
                    int reserve = tab1[i];
                    tab1[i]=tab1[j];
                    tab1[j]=reserve;
                }
            }
        }
        System.out.print("tab1 ={");
        for(int i=0; i<=tab1.length-1; i++){
            System.out.print(tab1[i]+",");
        }
        System.out.print("}");
    }
}
