package triplea;

public class TripleA {
    
    public TripleA() {
        
    }
    
    public boolean testWord(String word) {
        int state = 0;
        for(int i=0; i<word.length(); i++) {
            switch(word.charAt(i)) {
                case 'a':
                case 'A':
                    switch(state) {
                        case 0:
                            state=1;
                            break;
                        case 1:
                            state=2;
                            break;
                        case 2:
                            state=3;
                            break;
                        case 3:
                            return false;
                    }
            }
        }
        if(state < 3) {
            return false;
        }
        return true;
    }
}