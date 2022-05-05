package quicksort;

public class Quicksort {
    
    public Quicksort() {
        
    }
    
    public List sort(List<Integer> sort) {
        
        List<Integer> list = new List<Integer>();
        
        while(!sort.isEmpty()) {
            sort.toFirst();
            
            int cur = sort.getContent();
            
            sort.next();
            
            while(sort.hasAccess()) {
                if(sort.getContent() < cur) {
                    cur = sort.getContent();
                }
                
                sort.next();
            }
            
            sort.toFirst();
            while(sort.getContent() != cur) {
                sort.next();
            }
            sort.remove();
            list.append(cur);
        }
        sort.concat(list);
        return sort;
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
