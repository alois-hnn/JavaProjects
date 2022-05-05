package cursorandparser;

public class Parser {
    
    public Parser() {
        
    }
    
    public boolean integer(String word) {
        
        if((word.charAt(0) == '+' || word.charAt(0) == '-') && word.length() >= 2) {
            
            for(int i=1; i<word.length()-1; i++) {
                switch(word.charAt(i)) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                    default:
                        return false;
                }
            }
            
        } else {
            return false;
        }
        
        return true;
    }    
    
}
