package calculator;

public class Calculator {
    
    public Calculator() {
        
    }
    
    public int faculty(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        int result = n * faculty(n - 1);
        return result;
    }
    
}
