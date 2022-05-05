package treefunctions;

public class TreeFunctionsTester {

    public static void main(String[] args) {
        Functions functions = new Functions();
        
        BinaryTree<String> A = new BinaryTree("A");
        BinaryTree<String> C = new BinaryTree("C");
        BinaryTree<String> B = new BinaryTree("B", A, C);
        BinaryTree<String> E = new BinaryTree("E");
        BinaryTree<String> D = new BinaryTree("D", B, E);
        
        System.out.println("------ Pre-Order ------");
        functions.preorder(D);
        
        System.out.println("------ Post-Order ------");
        functions.postorder(D);
        
        System.out.println("------ In-Order ------");
        functions.inorder(D);
        
        functions.knoten(D);
        System.out.println(functions.getCounter());
        functions.setCounter(0);
        
        
    }
    
}
