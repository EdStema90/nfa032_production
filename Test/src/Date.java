public class Date {
    int annee;
    int mois;
    int jour;

    public void afficherAnnee(){
        System.out.println(this.jour+"/"+ mois +"/"+ annee);
    }
    public  Date(int jour, int mois, int annee ){
        this.jour = jour;
        this.mois= mois;
        this.annee = annee;
    }
    public boolean bissextile (int a){
        return((a%4==0)&&(a%100!=0)||(a%400== 0));
    }
}
