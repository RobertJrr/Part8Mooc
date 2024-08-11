package Example1;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Book bookObject = new Book("Book Object",2000,"...");
        Book anotherObj = bookObject; //both reference same book

        if(bookObject.equals(anotherObj)){
            System.out.println("Books are the same"); //this prints
        }else{
            System.out.println("Books are not the same.");
        }
        // we now create an object with the same content that's nonetheless its own object
        anotherObj = new Book("Book Object", 2000, "..."); //references different book object in memory

        if (bookObject.equals(anotherObj)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books aren't the same"); //not the same even tho has same content
        }

        System.out.println("Using arrayList");
        ArrayList<Book> books = new ArrayList<>();
        Book aBook = new Book("Book Object",2000,"...");
        books.add(aBook);

        if(books.contains(aBook)){
            System.out.println("Book was found");
        }

        aBook = new Book("Book Object",2000,"...");
        //prints out if we dont add our own implementation of equals method to Book class
        if(!books.contains(aBook)){
            System.out.println("Book Object was not found");
        }


    }
}
