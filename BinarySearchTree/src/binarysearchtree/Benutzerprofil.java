package binarysearchtree;

public class Benutzerprofil implements ComparableContent<Benutzerprofil> {

    private String benutzername, pw;
    
    public Benutzerprofil(String benutzername, String pw) {
        this. benutzername = benutzername;
        this.pw = pw;
    }

    public String getBenutzername() {
        return benutzername;
    }
    
    public boolean isGreater(Benutzerprofil pProfil) {
        return this.getBenutzername().compareTo(pProfil.getBenutzername()) > 0;
    }
    
    public boolean isLess(Benutzerprofil pProfil) {
        return this.getBenutzername().compareTo(pProfil.getBenutzername()) < 0;
    }
    
    public boolean isEqual(Benutzerprofil pProfil) {
        return this.getBenutzername().compareTo(pProfil.getBenutzername()) == 0;
    }
    
}
