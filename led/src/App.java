public class App {
    public static void main(String[] args) throws Exception {
        
        Control controler1 = new Control();
        Control controler2 = new Control();

        LED LED1 = new LED(1);
        LED LED2 = new LED(2);
        LED LED3 = new LED(3);
        LED LED4 = new LED(4);
        LED LED5 = new LED(5);

        controler1.insertLED(LED1);
        controler1.insertLED(LED2);
        controler1.insertLED(LED3);
        controler1.insertLED(LED4);
        controler1.insertLED(LED5);

        LED LED6 = new LED(6);
        LED LED7 = new LED(7);
        LED LED8 = new LED(8);
        LED LED9 = new LED(9);
        LED LED10 = new LED(10);

        controler2.insertLED(LED6);
        controler2.insertLED(LED7);
        controler2.insertLED(LED8);
        controler2.insertLED(LED9);
        controler2.insertLED(LED10);

        // System.out.println(controler1.getAmountLEDs());

        // controler1.printIsON();
        // controler1.turnEveryNthON(3);
        
        controler1.printIsON();
        controler1.attachChain(controler2.getChain());

        controler1.printIsON();

    }
}
