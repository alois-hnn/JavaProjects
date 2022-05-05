package kellerautomat;

public class KellerAutomat {
    
    
    
    public KellerAutomat() {
        
    }
    
    public boolean abc(String word) {
        
        Stack<Character> stack = new Stack<Character>();
        int state = 0;
        
        for(int i=0; i < word.length(); i++) {
            switch(state) {
                case 0:
                    if(word.charAt(i) == 'a') {
                        stack.push('a');
                    } else if(word.charAt(i) == 'b') {
                        state = 1;
                    } else {
                        return false;
                    }
                case 1:
                    if(word.charAt(i) == 'c') {
                        if(stack.isEmpty() == false) {
                            stack.pop();
                        } else {
                            return false;
                        } 
                    }
                    break;
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public boolean ab(String word) { // ???
        
        Stack<Character> stack = new Stack<Character>();
        int state = 0;
        
        for(int i=0; i < word.length(); i++) {
            switch(state) {
                case 0:
                    if(word.charAt(i) == 'a') {
                        stack.push('a');
                    } else if(word.charAt(i) == 'b') {
                        state = 1;
                    }
                case 1:
                    if(word.charAt(i) == 'b') {
                        if(stack.isEmpty() == false) {
                            stack.pop();
                        } else {
                            return false;
                        } 
                    }
                    break;
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
    
}
