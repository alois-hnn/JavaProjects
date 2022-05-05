package scannerandparser;

public class Parser {

    public Parser() {
        
    }
    
    public boolean run(String word) {
        
        if(word.charAt(0) != 'a') {
            return false;
        }
        return true;
        
    }
    
}
