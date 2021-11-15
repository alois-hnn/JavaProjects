public class Control {

    private int amountLEDs = 0;
    private List<LED> chain = new List<LED>();

    public Control() {

    }

    public void insertLED(LED led) {
        chain.append(led);
        amountLEDs++;
    }

    public void turnAllON() {   
        chain.toFirst();
        while(chain.hasAccess()) {
            chain.getContent().turnON();
            chain.next();
        }
    }

    public void printIsON() {
        chain.toFirst();
        while(chain.hasAccess()) {
            System.out.println("LED " + chain.getContent().getID() + " - " + chain.getContent().isON());
            chain.next();
        }
    }
        
    public void turnEverySecondON() {
        chain.toFirst();
        boolean before = false;
        while(chain.hasAccess()) {
            if(before == false) {
                if(chain.getContent().isON() == false) {
                    chain.getContent().turnON();
                }
            } else if(before == true) {
                if(chain.getContent().isON() == true) {
                    chain.getContent().turnOFF();
                }
            }
            
            before = chain.getContent().isON();
            chain.next();
        }
    }

    public void turnEveryNthON(int i) {
        i = i-1;
        chain.toFirst();
        int lastON = 0;
        while(chain.hasAccess()) {
            if(lastON == i) {
                if(chain.getContent().isON() == false) {
                    chain.getContent().turnON();   
                }
                lastON = 0;
            } else if(lastON < i) {
                if(chain.getContent().isON() == true) {
                    chain.getContent().turnOFF();
                }
                lastON++;
            }
            chain.next();
        }
    }

    public void attachChain(List<LED> attachedChain) {
        attachedChain.toFirst();
        while(attachedChain.hasAccess()) {
            chain.append(attachedChain.getContent());
            attachedChain.next();
        }
    }

    public int getAmountLEDs() {
        return amountLEDs;
    }

    public List<LED> getChain() {
        return chain;
    }
    
}
