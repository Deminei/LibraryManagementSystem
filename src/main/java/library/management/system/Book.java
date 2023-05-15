package library.management.system;

class Book extends LibraryItem {
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return getItemType()+" Title: " + getTitle() + ", Author: " + getAuthor() + ", Year published: " + getReleaseYear() + ", ISBN: " + getISBN();
    }

}
