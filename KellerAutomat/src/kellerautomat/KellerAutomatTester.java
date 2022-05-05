package kellerautomat;

public class KellerAutomatTester {

    public static void main(String[] args) {
        
        KellerAutomat automat = new KellerAutomat();
        
        System.out.println(automat.abc("aaaccc"));
        System.out.println(automat.abc("aabb"));
    }
    
}
