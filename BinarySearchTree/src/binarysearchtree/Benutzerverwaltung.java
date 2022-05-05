package binarysearchtree;

public class Benutzerverwaltung {

    private BinarySearchTree<Benutzerprofil> tree = new BinarySearchTree<Benutzerprofil>();
    
    
    public Benutzerverwaltung() {
    }
    
    public void neuenNutzerAnlegen(String benutzername, String pw) {
        
        tree.insert(new Benutzerprofil(benutzername, pw));
        
    }
    
    public void nutzerLoeschen(String benutzername, String pw) {
        
        tree.remove(new Benutzerprofil(benutzername, pw));
        
    }
    
    public boolean profilVorhanden(String benutzername) {
        
        if(tree.search(new Benutzerprofil(benutzername, "")) == null) {
            return false;
        }
        
        return true;
        
    }
    
}
