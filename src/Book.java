public class Book {
    private String title;
    private Author author;
    private int publisherYear;

    public Book(String title, int publisherYear, Author author) {
        this.title = title;
        this.publisherYear = publisherYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }
}

