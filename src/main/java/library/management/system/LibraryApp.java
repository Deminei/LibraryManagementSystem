package library.management.system;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> items = new LibraryManager<>();
        DVD dvd1 = new DVD("The boring movie",1995, "Nathan Speilberg", 230);
        DVD dvd2 = new DVD("Idiocracy",2007, "Mike Judge", 84);
        DVD dvd3 = new DVD("Zoolander",2001, "Ben Stiller", 89);
        items.addItem(dvd1);
        items.addItem(dvd2);
        items.displayItems();
        System.out.println();

        items.addItem(dvd3);
        items.displayItems();
        System.out.println();



        Book book1 = new Book("How To Raise Your IQ By Eating Gifted Children",2000,"Lewis B. Frumkes", "978-0595002368");
        Book book2 = new Book("Healing Through Humor",2003, "Charles Frances Hunter", "978-1591851967");
        Book book3 = new Book("You Can't Make This Stuff Up", 2018, "Mike The Cop", "978-1731411563");
        items.addItem(book1);
        items.displayItems();
        System.out.println();

        items.addItem(book2);
        items.addItem(book3);


        items.displayItems();
        System.out.println();

        items.removeItem(dvd1);
        items.removeItem(book2);

        items.displayItems();

    }
}
