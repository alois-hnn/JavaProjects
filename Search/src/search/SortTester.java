package search;

public class SortTester {

    public static void main(String[] args) {
        
        
        /*
        LinearSearch list = new LinearSearch();
        list.fillList();
        System.out.println(list.search(11));
        */
        
        BinarySearch array = new BinarySearch();
        array.fillArray();
        System.out.println(array.find(1));
        
        
    }
    
}
