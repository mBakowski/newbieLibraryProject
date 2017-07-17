import java.util.Scanner;

public class DataReader {

    private Scanner scanner;

    public DataReader(){
        scanner = new Scanner(System.in);
    }

    public void close(){
        scanner.close();
    }
//metoda dodająca książkę
    public Book createBook(){
        System.out.println("Podaj nazwę ksiazki: ");
        String title = scanner.nextLine();
        System.out.println("Podaj autora ksiazki: ");
        String author = scanner.nextLine();
        System.out.println("Podaj ilosc stron ksiazki: ");
        int pages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj wydawce ksiazki: ");
        String publisher = scanner.nextLine();
        return new Book(title, author, pages, publisher);
    }

}


