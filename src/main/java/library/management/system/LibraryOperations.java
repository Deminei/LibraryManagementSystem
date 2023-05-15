package library.management.system;

public interface LibraryOperations<T extends LibraryItem> {

    void addItem(T item);
    void removeItem(T item);
    void displayItems();

}
