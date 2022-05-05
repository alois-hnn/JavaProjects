package mergesort;

public class MergesortTester {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Mergesort sort = new Mergesort();
        
        for(int i=0; i<10; i++) {
            int rndm = 0 + (int)(Math.random() * 35);
            arr[i] = rndm;
        }
        
        sort.printArr(arr);
        
        sort.sort(arr);
        
        sort.printArr(arr);
        
    }
    
}
