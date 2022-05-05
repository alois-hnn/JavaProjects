package insertionsort;

public class InsertionSort {
    
    public InsertionSort()  {
    
    }
    
    public List<Integer> sort(List<Integer> list) {
        
        List<Integer> sorted = new List<Integer>();
        
        list.toFirst();
        
        while(list.hasAccess()) {
            
            int x = list.getContent();
            
            sorted.toFirst();
            
            while(sorted.hasAccess() && x>sorted.getContent()) {
                
                
                sorted.next();
            }
            
            if(sorted.hasAccess()) {
                sorted.insert(x);
            } else {
                sorted.append(x);
            }
            
            list.next();
        }
        
        return sorted;
    }
    
    public void printList(List<Integer> list) {
        System.out.println("----- List -----");
        list.toFirst();
        while(list.hasAccess()) {
            System.out.println(list.getContent());
            list.next();
        }
    }
    
}
