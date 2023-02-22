public class book {
    private String bookName;
    private Double price;
    private String author;

    public book() {
    }

    public book(String bookName, Double price, String author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}