package scannerandparser;

public class ScannerAndParser {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner();
        Parser parser = new Parser();
        
        String word = "bacde";
        // plus oder minus und abcde
        
        System.out.println(scanner.run(word));
        System.out.println(parser.run(word));
        
    }
    
}