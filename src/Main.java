void main() {
    Book book1 = new Book("Harry Potter", "J.K. Rowling", 350.00);

    book1.displayDetails();
    System.out.println();

    book1.applyDiscount(20.00);

    System.out.println();
    book1.displayDetails();
}