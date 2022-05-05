package triplea;

import java.util.Scanner;

public class TripleATester {

    public static void main(String[] args) {
        
        TripleA test = new TripleA();
        Scanner input = new Scanner(System.in);
         
        while(true) {
            System.out.print("Input word: ");
            String word = input.nextLine();
        
        
            System.out.println(test.testWord(word));
        }
        
        
    }
    
}
