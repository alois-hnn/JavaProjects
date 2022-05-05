package vehicletree;

public class VehicleTreeTester {

    public static void main(String[] args) {
        
        Functions functions = new Functions();
        
        BinaryTree<Vehicle> three = new BinaryTree(new Vehicle("DM HF 20", 2001, 2500));
        BinaryTree<Vehicle> four = new BinaryTree(new Vehicle("K FG 50", 2020, 15000));
        BinaryTree<Vehicle> two = new BinaryTree(new Vehicle("MG HG 2004", 2016, 5000), four, null);
        BinaryTree<Vehicle> one = new BinaryTree(new Vehicle("D H 20", 1990, 20000), two, three);
        
        System.out.println(functions.average(one));
    }
}
