package Example4;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);

        System.out.println(library.getBook("pride and prejudice"));
        System.out.println();

        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        System.out.println();

        System.out.println(library.getBook("SENSE"));
        //======================================================================================

        library.addBook(new Book("Wolverine: Marvel Comic #111",1,"Wolverine"));
        library.addBook(new Book("Hulk: Marvel Comic #121",1,"Hulk"));
        library.addBook(new Book("Iron man: Marvel Comic #131",1,"Iron Man"));
        library.addBook(new Book("Spiderman: Marvel Comic #141",1,"Spiderman"));
        library.addBook(new Book("Capt. A: Marvel Comic #151",1,"Capt. A"));

        //getting list of certain books with specific title part
        ArrayList<Book> marvelComics = library.getBooksByPart("marvel");
        printListOfBooks(marvelComics);
    }

    //print list of Books
    public static void printListOfBooks(ArrayList<Book> books){
        for(Book book : books){
            System.out.println(book);
        }
    }
}
