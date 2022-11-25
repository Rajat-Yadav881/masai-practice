public class Book extends Product{
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public Book(long productId, String name, String author) {
        super(productId, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
