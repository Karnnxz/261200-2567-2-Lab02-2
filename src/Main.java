void main() {
    Book book1 = new Book("Study Hall Of Justice", "Derek Fridolfs", 250.00);

    book1.displayDetails();
    System.out.println();

    book1.applyDiscount(25.00);

    System.out.println();
    book1.displayDetails();
}