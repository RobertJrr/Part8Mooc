package Example2;
//Approximate Comparison with HashMap
//The value associated with the key will be returned if, and only if,
// the exact same value is found in the list
// The default implementation creates a hashCode value based on the object's reference,
// which means that books having the same content that are nonetheless
// different objects get different results from the hashCode method
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        HashMap<Book,String> borrowers = new HashMap<>();

        Book bookObject = new Book("Book Object",2000,"...");
        //key bookObject and value is String name of borrower
        borrowers.put(bookObject,"Pekka");
        borrowers.put(new Book("Test Driven Development",1999,"..."),"Arto");
        //replaces the one above. New key replaces old key. duplicate keys not allowed
        borrowers.put(new Book("Test Driven Development",1999,"..."),"Charlie");

        System.out.println(borrowers.get(bookObject)); //Pekka
        System.out.println(borrowers.get(new Book("Book Object",2000,"...")));//Pekka
        System.out.println(borrowers.get(new Book("Test Driven Development",1999,"..."))); //Artu



        Book b = new Book("Test Driven Development",1999,"...");
        System.out.println(bookObject.hashCode()); //hashcode 751109158
        System.out.println((new Book("Test Driven Development",1999,"...")).hashCode());//hashcode -1245592260
        System.out.println(b.hashCode()); //hashcode -1245592260

//Putting an Entry into a HashMap:
//When you call the put(K key, V value) method, the HashMap uses the hashCode of the key to determine which bucket to place the entry in.
//Within that bucket, it uses the equals method to find the exact entry if there are multiple entries in the same bucket (due to hash collisions).
//If an entry with the same key (as determined by the equals method) already exists in the bucket, it updates the value. If not, it adds a new entry.
//Getting an Entry from a HashMap:
//When you call the get(Object key) method, HashMap first uses the hashCode of the key to locate the appropriate bucket.
//It then iterates through the entries in that bucket and uses the equals method to find the entry that matches the key.

    }
}
