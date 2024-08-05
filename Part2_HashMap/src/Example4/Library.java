package Example4;

import java.util.HashMap;
import java.util.ArrayList;
/*Creating a Library class that encapsulates a hash map
* containing books. Can case-independent search for books */
class Library {
    private HashMap<String,Book> directory;

    public Library(){
        this.directory = new HashMap<>();
    }

    public void addBook(Book book){
        String name = sanitizedString(book.getName());
        //check for existence of the key, in this case key is modified name of book
        if(this.directory.containsKey(name)){
            System.out.println("Book already in library");
        } else {
            directory.put(name,book);
        }
    }

    public Book getBook(String bookTitle){
        bookTitle = sanitizedString(bookTitle);
        return this.directory.get(bookTitle);
    }

    public void removeBook(String bookTitle){
        bookTitle = sanitizedString(bookTitle);
        if(this.directory.containsKey(bookTitle)){
            this.directory.remove(bookTitle);
        } else{
            System.out.println("Book not found!");
        }
    }

    //implemented as a class method since doesnt handle object variables. lowercases string and trims
    public static String sanitizedString(String string){
        if(string == null){
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public ArrayList<Book> getBooksByPart(String titlePart){
        titlePart = sanitizedString(titlePart);
        ArrayList<Book> books = new ArrayList<>();

        //returns the KeySet of HashMap directory
        for(String bookTitle : this.directory.keySet()){
            if(!bookTitle.contains(titlePart)){
                continue;
            }

            //if key (which is a string type) contains
            // the given string, we retrieve the value related to it
            //and add it to the set of books to be returned(list of books we created in method)
            books.add(this.directory.get(bookTitle)); //returns a book object(value) based on bookTitle(key) and adds to books list
        }
        return books;
    }
}
