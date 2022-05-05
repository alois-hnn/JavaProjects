package simpsonstammbaum;

public class SimpsonStammbaumTester {

    public static void main(String[] args) {
        
       /*BinaryTree<Simpson> Lisa = new BinaryTree(new Simpson("Lisa", "Simpson", 'w'));
       BinaryTree<Simpson> Homer = new BinaryTree(new Simpson("Homer", "Simpson", 'm'));
       BinaryTree<Simpson> Marge = new BinaryTree(new Simpson("Marge", "Simpson", 'w'));
       BinaryTree<Simpson> Abe = new BinaryTree(new Simpson("Abe", "Simpson", 'w'));
       BinaryTree<Simpson> Mona = new BinaryTree(new Simpson("Mona", "Simpson", 'w'));
       BinaryTree<Simpson> Clancy = new BinaryTree(new Simpson("Clancy", "Bouvier", 'm'));
       BinaryTree<Simpson> Jacqueline = new BinaryTree(new Simpson("Jacqueline", "Bouvier", 'w'));
       
       Mona.setLeftTree(Homer);
       Abe.setLeftTree(Homer);
       Clancy.setLeftTree(Marge);
       Jacqueline.setLeftTree(Marge);
       Lisa.setLeftTree(Marge);
       Lisa.setRightTree(Homer);*/
       
       BinaryTree<Simpson> Orville = new BinaryTree(new Simpson("Orville", "Simpson", 'm'));
       BinaryTree<Simpson> Yuma = new BinaryTree(new Simpson("Yuma", "Simpson", 'w'));
       
       BinaryTree<Simpson> Abe = new BinaryTree(new Simpson("Abe", "Simpson", 'm'), Orville, Yuma);
       BinaryTree<Simpson> Mona = new BinaryTree(new Simpson("Mona", "Simpson", 'w'));
       BinaryTree<Simpson> Clancy = new BinaryTree(new Simpson("Clancy", "Bouvier", 'm'));
       BinaryTree<Simpson> Jacqueline = new BinaryTree(new Simpson("Jacqueline", "Bouvier", 'w'));
       BinaryTree<Simpson> Homer = new BinaryTree(new Simpson("Homer", "Simpson", 'm'), Mona, Abe);
       BinaryTree<Simpson> Marge = new BinaryTree(new Simpson("Marge", "Simpson", 'w'), Clancy, Jacqueline);
       BinaryTree<Simpson> Lisa = new BinaryTree(new Simpson("Lisa", "Simpson", 'w'), Marge, Homer);
       
       
    }
    
}
