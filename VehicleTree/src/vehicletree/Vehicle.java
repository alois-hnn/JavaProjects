package vehicletree;

public class Vehicle {
    
    private String kennzeichen;
    private int baujahr;
    private int preis;

    public Vehicle(String kennzeichen, int baujahr, int preis) {
        this.kennzeichen = kennzeichen;
        this.baujahr = baujahr;
        this.preis = preis;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public int getPreis() {
        return preis;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }
    
    
    
}
