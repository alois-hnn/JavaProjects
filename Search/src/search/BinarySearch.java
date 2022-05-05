package search;

public class BinarySearch {

    private int[] array = new int[10];
    
    public BinarySearch() {
        
    }
    
    public void fillArray() {
        for(int i=0; i<10; i++) {
            array[i] = i;
        }
    }
    
    public boolean findIter(int x) {
        int left = 0;
        int right = array.length;
        int middle = Math.round(array.length / 2);
        while(middle != x && left < right) {
            if(array[middle] > x) {
                right = middle-1;
            } else if(array[middle] < x) {
                left = middle+1;
            } else {
                return true;
            }
            middle = Math.round(left+right / 2);
        }
        return false;
    }
    
    public boolean find(int x) {
        return findMain(x, 0, array.length-1);
    }
    
    public boolean findMain(int x, int left, int right) {
        int middle = Math.round(left+right / 2);
        
        if(left > right) {
            return false;
        }
        
        if(array[middle] > x) {
            return findMain(x, left, middle-1);
            
        } else if(array[middle] < x) {
            return findMain(x, middle+1, right);
        }
        
        return true;
        
    }
    
}
