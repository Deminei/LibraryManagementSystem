package library.management.system;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

   public void addItem(T item) {
    items.add(item);
   }

    public void removeItem(T item) {
        items.remove(item);
    }


    public void displayItems() {
        for (T item : items) {
            String itemDetails = item.getItemDetails();
            System.out.println(itemDetails);
        }
    }

}
