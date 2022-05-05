package treefunctions;

public class Functions {

    public Functions() {
        
    }
    
    public void preorder(BinaryTree<String> tree) {
        
        if(tree.getContent() != null) {
            System.out.println(tree.getContent());       
        }
        
        if(tree.getLeftTree() != null) {
            preorder(tree.getLeftTree());
        }
        
        if(tree.getRightTree() != null) {
            preorder(tree.getRightTree());
        }
    }
    
    public void postorder(BinaryTree<String> tree) {
        
        if(tree.getLeftTree() != null) {
            postorder(tree.getLeftTree());
        }
        
        if(tree.getRightTree() != null) {
            postorder(tree.getRightTree());
        }
        
        if(tree.getContent() != null) {
            System.out.println(tree.getContent());       
        }

    }
    
    public void inorder(BinaryTree<String> tree) {
        
        if(tree.getLeftTree() != null) {
            inorder(tree.getLeftTree());
        }
        
        if(tree.getContent() != null) {
            System.out.println(tree.getContent());       
        }
        
        if(tree.getRightTree() != null) {
            inorder(tree.getRightTree());
        }

    }
    
    public int counter;
    
    
    public void knoten(BinaryTree<String> tree) {
        
        if(tree.getContent() != null) {
            counter++;
            //System.out.println(counter);
        }
        
        if(tree.getLeftTree() != null) {
            knoten(tree.getLeftTree());
        }
        
        if(tree.getRightTree() != null) {
            knoten(tree.getRightTree());
        }
        
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public int getCounter() {
        return counter;
    }
    
    
    
}
