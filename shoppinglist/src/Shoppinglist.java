public class Shoppinglist {

    private List<Item> shoppinglist  = new List<Item>();

    public Shoppinglist() {
        
    }

    public void insertItem(Item insertItem) {
        shoppinglist.append(insertItem);
    }

    public void printList() {
        shoppinglist.toFirst();
        while(shoppinglist.hasAccess()) {
            System.out.println(shoppinglist.getContent().getName() + " - " + shoppinglist.getContent().getAmount());
            shoppinglist.next();
        }
    }


    public void deleteItem(Item item) {
        shoppinglist.toFirst();

        while(shoppinglist.getContent() != item && shoppinglist.hasAccess() != false) {
            shoppinglist.next();
        }

        if(shoppinglist.getContent() == item) {
            shoppinglist.remove();
            System.out.println("Item was deleted!");
        } else {
           System.out.println("Item not found! An error occured...");
        }
    }

    public void organizeByAmount() {
        
    }
}
