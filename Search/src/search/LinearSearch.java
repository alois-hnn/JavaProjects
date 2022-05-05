package search;

public class LinearSearch {
    
    private List<Integer> list = new List<Integer>();
    
    public LinearSearch() {
        
    }
    
    public void fillList() {
        for(int i=0; i<10; i++) {
            list.append(i);
        }
    }
    
    public boolean searchIter(int x) {
        list.toFirst();
        while(list.hasAccess()) {
            if(list.getContent() == x) {
                return true;
            }
            list.next();
        }
        return false;
    }
    
}
