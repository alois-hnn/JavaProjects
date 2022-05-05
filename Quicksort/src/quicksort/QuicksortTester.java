package quicksort;

public class QuicksortTester {
    
    public static void main(String[] args) {
        
        List<Integer> random = new List<Integer>();
        Quicksort sort = new Quicksort();
        
        for(int i=0; i<10; i++) {
            int rndm = 0 + (int)(Math.random() * 35);
            random.append(rndm);
        }
        
        sort.printList(random);
        
        sort.sort(random);
        
        sort.printList(random);
        
        
    }
    
}
