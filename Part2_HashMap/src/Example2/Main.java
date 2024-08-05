package Example2;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        //create a hashmap that uses books name as a key value
        //and book we have just created as the value
        HashMap<String,Book> directory = new HashMap<>();
        Book senseAndSensibility = new Book("Sense and Sensibility",1811,"...");
        Book prideAndPrejudice = new Book("Pride and Prejudice",1813,"...");

        //string as key and book as value
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(),prideAndPrejudice);

        //books can be retrieved from directory by book Name
        Book book = directory.get("Persuasiion");
        System.out.println(book); //prints null
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book); //prints String of book


        //some example to print year 1811
        //gets book object value  based on key, then we call getPublished to return year published
        System.out.println(directory.get("Sense and Sensibility").getPublished());



    }
}
