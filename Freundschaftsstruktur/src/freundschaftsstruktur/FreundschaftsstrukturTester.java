package freundschaftsstruktur;

public class FreundschaftsstrukturTester {

   public static void main(String[] args) {
       
       Freundschaftsstruktur friendship = new Freundschaftsstruktur();
       
       friendship.freundschaftsGraphErzeugen();
       friendship.printGraph();
       System.out.println(friendship.checkFriendship("dsfnsdn", "Jens"));
        
}
    
}