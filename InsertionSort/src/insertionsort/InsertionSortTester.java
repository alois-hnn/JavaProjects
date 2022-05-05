package insertionsort;

import java.util.concurrent.ThreadLocalRandom;

public class InsertionSortTester {

    public static void main(String[] args) {
        
        List<Integer> list = new List<Integer>();
        
        InsertionSort insertionSort = new InsertionSort();
        
        int length = 10;
        int maxValue = 20;
        for(int i=0; i<length; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, maxValue + 1);
            list.append(random);
        }
        
        List<Integer> sorted = insertionSort.sort(list);
        
        insertionSort.printList(list);
        insertionSort.printList(sorted);
        
    }
    
}
