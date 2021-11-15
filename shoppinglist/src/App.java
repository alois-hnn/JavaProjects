public class App {
    public static void main(String[] args) throws Exception {
        Shoppinglist electronics = new Shoppinglist();

        Item pc = new Item("pc", 1);
        Item battery = new Item("duracell", 2);
        Item cable = new Item("red cable", 5);

        electronics.insertItem(pc);
        electronics.insertItem(battery);
        electronics.insertItem(cable);

        electronics.printList();

        electronics.deleteItem(battery);

        electronics.printList();
    }
}
