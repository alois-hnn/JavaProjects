public class LED {

    private boolean on;
    private int id;

    public LED(int id) {
        this.id = id;
    }

    public void turnON() {
        on = true;
    }

    public void turnOFF() {
        on = false;
    }

    public boolean isON() {
        return on;
    }

    public int getID() {
        return id;
    }
    
}
