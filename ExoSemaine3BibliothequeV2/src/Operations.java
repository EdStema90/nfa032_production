public class Operations {
    public static void main(String[] args) {
        Bibliotheque eschauBibliotheque= new Bibliotheque ();
        eschauBibliotheque.bookRecorder("La ballade de l'impossible","Murakami Haruki", "10 18");
        eschauBibliotheque.bookRecorder("Le tour du Monde en 80 jours", "Jules Verne", "Babel");
        eschauBibliotheque.employerBookRecorder();

        eschauBibliotheque.bibliothequedisplayer();
    }
}
