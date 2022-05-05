package binarysearchtree;

public class BinarySearchTreeTester {

    public static void main(String[] args) {
        
        Benutzerverwaltung verwaltung = new Benutzerverwaltung();
        
        verwaltung.neuenNutzerAnlegen("Hans", "1234");
        verwaltung.neuenNutzerAnlegen("Furkan", "hallo");
        verwaltung.neuenNutzerAnlegen("Jann", "4323");
        verwaltung.neuenNutzerAnlegen("Alois", "passwort");
        verwaltung.neuenNutzerAnlegen("Hannah", "test");
        verwaltung.neuenNutzerAnlegen("Julian", "8888888");
        
        System.out.println(verwaltung.profilVorhanden("Jann"));
        verwaltung.nutzerLoeschen("Jann", "4323");
        
        System.out.println(verwaltung.profilVorhanden("Jann"));
        
    }
    
}
