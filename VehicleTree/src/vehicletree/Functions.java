package vehicletree;

public class Functions {
    
    List<Vehicle> list = new List<Vehicle>();
    
    public void preorder(BinaryTree<Vehicle> tree) {
        
        if(tree.getContent() != null) {
            list.append(tree.getContent());
        }
        
        if(tree.getLeftTree() != null) {
            preorder(tree.getLeftTree());
            
        }
        
        if(tree.getRightTree() != null) {
            preorder(tree.getRightTree());
        }
    }
    
    public int average(BinaryTree<Vehicle> tree) {
        preorder(tree);
        list.toFirst();
        int vehicleCounter = 0;
        int totalPrice = 0;
        while(list.hasAccess()) {
            totalPrice = totalPrice + list.getContent().getPreis();
            vehicleCounter++;
            list.next();
        }
        int average = totalPrice / vehicleCounter;
        return average;
    }
    
}
