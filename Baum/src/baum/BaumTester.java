package baum;

public class BaumTester {

    public static void main(String[] args) {
        
        BinaryTree<Integer> neun = new BinaryTree(9);
        BinaryTree<Integer> fuenf = new BinaryTree(5);
        BinaryTree<Integer> vier = new BinaryTree(4, fuenf, neun);
        BinaryTree<Integer> eins = new BinaryTree(1);
        BinaryTree<Integer> zwei = new BinaryTree(2);
        BinaryTree<Integer> acht = new BinaryTree(8, eins, zwei);
        
        // Ebene 0
        BinaryTree<Integer> sieben = new BinaryTree(7, vier, acht);
        
        Baum functions = new Baum();
        System.out.println(functions.summe(sieben));
        
        functions.toList(sieben);
        
        functions.printList(functions.getList());
        
        
        
        
        
    }
    
}
