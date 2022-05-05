package scannerandparser;

public class Scanner {

    public Scanner() {
        
    }
    
    public boolean run(String word) {
        
        String characters = "abcde";
        if(word.length() > 0) {
            for(int i=0; i<word.length(); i++) {
                if(characters.indexOf(word.charAt(i)) == -1) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
        
        
    }
    
}
