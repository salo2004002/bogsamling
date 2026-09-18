import java.util.ArrayList;
import java.util.Scanner;
public class Library {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private ArrayList<Book> books;


    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void printInfo() {
        System.out.println(name + ": ");


    }

    public void addBook(Book book) {
        books.add(book);

    }

    public void printBooks() {
        for (Book book : books) {
            book.printInfo();
            System.out.println("");
        }
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public Book findBookByTitle(String title) {

        Book found = null;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                found = book;
            }
        }

        if (found != null) {
            found.printInfo();
        } else {
            System.out.println("Bogen blev ikke fundet");
        }
        return found;
    }

    public void printUnreadBooks() {
        for (Book book : books) {
            if (book.isRead()) {
                System.out.println("");
            } else if (!book.isRead()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void Menu() {
        printInfo();

        System.out.println("1. Tilføj bog\n" +
                "2. Vis alle bøger\n" +
                "3. Find bog\n" +
                "4. Marker bog som læst\n" +
                "5. Vis ulæste bøger\n" +
                "6. Afslut");


        while (scanner.nextInt() != 6) {

            if (scanner.nextInt() == 1) {
                scanner.nextLine();

                System.out.println("Titel:");
                String title = scanner.nextLine();

                System.out.println("Forfatter:");
                String author = scanner.nextLine();

                System.out.println("Udgivelsesår:");
                int publicationYear = scanner.nextInt();

                Book book = new Book(title, author, publicationYear);

                addBook(book);

                System.out.println("Bogen er tilføjet!");


            } else if (scanner.nextInt() == 2) {
                printBooks();
            } else if (scanner.nextInt() == 3) {
                scanner.nextLine();
                System.out.println("Title of book?");
                String title = scanner.nextLine();
                findBookByTitle(title);
            } else if (scanner.nextInt() == 4) {

            } else if (scanner.nextInt() == 5) {
                printUnreadBooks();
        }

        }
        System.out.println("Programmet er afsluttet!!!");

    }
}