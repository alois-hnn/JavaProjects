package baum;

public class Baum {

    public Baum() {
        
    }
    
    public int summe(BinaryTree<Integer> tree) {
        
        if(tree.getContent() != null) {
            return tree.getContent() + summe(tree.getLeftTree()) + summe(tree.getRightTree());
        } else {
            return 0;
        }
        
    }
    
    public List<Integer> list = new List<>();
    
    public void toList(BinaryTree<Integer> tree) {
        
        if(tree.getContent() != null) {
            list.append(tree.getContent());
        }
        
        if(tree.getLeftTree() != null) {
            toList(tree.getLeftTree());
        }
        
        if(tree.getRightTree() != null) {
            toList(tree.getRightTree());
        }
        
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
    
    public void printList(List<Integer> list) {
        this.list.toFirst();
        while(list.hasAccess() == true) {
            System.out.println(list.getContent());
            list.next();
        }
    }
    
    
}
