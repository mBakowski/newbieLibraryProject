
public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        Book book = new Book();

        book = dataReader.createBook();
        dataReader.close();
        book.bookInfo();

    }
}
