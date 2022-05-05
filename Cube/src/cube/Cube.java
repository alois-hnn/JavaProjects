package cube;
import java.util.concurrent.ThreadLocalRandom;

public class Cube {
    
    private int sides;
    
    public Cube(int sides) {
        this.sides = sides;
    }
    
    public int rollTheDice() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, sides + 1);
        return randomNum;
    }

    public int getSides() {
        return sides;
    }
    
}
