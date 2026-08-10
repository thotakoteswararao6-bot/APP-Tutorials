package tutorial_2;

class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("----- Book Details -----");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}
public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 599.0;
        b.displayDetails();
    }
}