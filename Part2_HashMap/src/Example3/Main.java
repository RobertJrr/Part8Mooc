package Example3;

import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);

        //adding ten million books to the list
        int i = 1;

        while(i < 1000000){
            books.add(new Book("", 1, ""));
            i++;
        }
        long start = System.nanoTime();

        System.out.println(get(books,"Sense and Sensibility"));
        System.out.println();

        System.out.println(get(books, "Persuasion"));
        long end = System.nanoTime();

        double durationInMilliseconds = 1.0 * (end - start) / 1000000;

        System.out.println("The book search took " + durationInMilliseconds + " milliseconds");

        //==================================================================================================
        //Now use hashmap instead
        HashMap<String,Book> directory = new HashMap<>();

        //adding ten million books to the list
        long j = 1;
        while(j < 10000000){
            directory.put("Koolain",new Book("",1,""));
            j++;
        }

        long newStart = System.nanoTime();
        System.out.println(directory.get("Sense and Sensibility"));

        System.out.println();

        System.out.println(directory.get("Persuasion"));
        long newEnd = System.nanoTime();
        double newDuration = (double)(newEnd - newStart) / 1000000;

        System.out.println("The book search took " + newDuration + " milliseconds"); //approx. 0.06 ms

    }

    //returns book found by given name if one exists
    public static Book get(ArrayList<Book> books, String name){
        for(Book book : books){
            if(book.getName().equalsIgnoreCase(name)){
                return book;
            }
        }
        return null;
    }
}
