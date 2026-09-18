

public class Main {

    public static void main(String[] args) {

        Library library = new Library("Min bogsamling");

        Book book1 = new Book("Fahrenheit 451", "Ray Bradbury", 1953);
        Book book2 = new Book("The Hunger Games", "Suzanne Collins", 2008);
        Book book3 = new Book("Dune", "Frank Herbert", 1965);

//        library.printInfo();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


//        library.printBooks();
//        System.out.println();
//        System.out.println("Antal bøger: " + library.getNumberOfBooks());
//        library.findBookByTitle("dune");


//        book1.isClassic(2026);
        book1.markAsRead();
//        book1.printInfo();
//        System.out.println();
//
//        book2.isClassic(2026);
//        book2.printInfo();
//        System.out.println();
//
//        book3.isClassic(2026);
//        book3.printInfo();
//        System.out.println();


        library.Menu();


//        library.printUnreadBooks();

    }


}
