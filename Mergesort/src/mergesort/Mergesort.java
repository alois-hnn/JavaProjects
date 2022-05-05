package mergesort;

public class Mergesort {
    
    public Mergesort() {
        
    }
    
    /*
    MergeSort(arr[], l,  r)
    If r > l
         1. Find the middle point to divide the array into two halves:  
                 middle m = l+ (r-l)/2
         2. Call mergeSort for first half:   
                 Call mergeSort(arr, l, m)
         3. Call mergeSort for second half:
                 Call mergeSort(arr, m+1, r)
         4. Merge the two halves sorted in step 2 and 3:
                 Call merge(arr, l, m, r)
    */
    
    public int[] sort(int[] arr) {
        
        int middle = Math.round(arr.length / 2);
        
        return arr;
    }
    
    public void printArr(int[] arr) {
        System.out.println("----- List -----");
        for(int i=1; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    } 
}
