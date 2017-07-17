
public class Book {
    private String tittle;
    private String author;
    private int pages;
    private String publisher;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(String title, String author, int pages, String publisher){
        this.tittle = title;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;

    }
    public Book(){}

    public void bookInfo(){
        String info = getTittle()+", autorstwa: "+getAuthor()+", ma "+getPages()+" stron. Wydawca: "+getPublisher();
        System.out.println(info);
    }
}
