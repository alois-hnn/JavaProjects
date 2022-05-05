package cube;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    
    private Cube cube = new Cube(6);
    
    
    public Game() {
        
    }
    
    public int addX(int x) {
        int random = cube.rollTheDice();
        // System.out.println(random);
        if(x>1) {
            return random + addX(x-1);
        } else {
            return random;
        } 
    }
    
    public int findMax(int x) {
        int random = cube.rollTheDice();
        System.out.println(random);

        if(x>1) {
            int nextMax = findMax(x-1);
            if(random <= nextMax) {
                return nextMax;
            } else {
                return random;
            }
        }
        
        return random;
    }
    
    public Cube getCube() {
        return cube;
    }
    
}