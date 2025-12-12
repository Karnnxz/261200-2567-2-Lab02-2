public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(double discountPercent) {
        if (discountPercent <= 0 || discountPercent >= 100) {
            System.out.println("Error, Please try again eiei");
        }
        else {
            double discountPrice = price * (discountPercent / 100.0);
            double newPrice = price - discountPrice;

            price = newPrice;

            System.out.println("Discount: " + discountPercent + "%");
            System.out.println("New price: " + price);
        }
    }
}