package Exercise4_PrintAnotherhashmap;

import java.util.HashMap;
import java.util.Map;

class Program {
    public static void main(String[] args) {
        HashMap<String,Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        printValuesIfNameContains(hashmap,"prejud");

    }

    public static void printValuesIfNameContains(HashMap<String,Book> hashmap,String text){
        text = text.toLowerCase();
        text = text.trim();
        //assigning values from hashmap which are of Book type to book in each loop
        for(Book book : hashmap.values()){
            //if book title contains text passed, print book
            if(book.getName().contains(text)){
                System.out.println(book);
            }
        }
    }

    public static void printValues(HashMap<String,Book> hashmap){
        for(Book book : hashmap.values()){
            System.out.println(book);
        }
    }






    //print values in given hashmap keys that contain given string
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        text = text.toLowerCase();
        //loop through hashMap keySet
        System.out.print("Values: ");
        for(String key : hashmap.keySet()){
            //if a key contains any portion of text passed in parameter,
            //use the key to get value and print it
            if(key.toLowerCase().contains(text)){
                System.out.print(hashmap.get(key) + " ");
            }
        }

        //Another way
        System.out.print("\nOther way: ");
        for(Map.Entry<String,String> e : hashmap.entrySet()){
            if(e.getKey().toLowerCase().contains(text)){
                System.out.print(e.getValue() + " ");
            }
        }
    }

    //prints keys in hashmap given as a parameter
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){

        //convert search text to lowercase
        text = text.toLowerCase();

        //loop through keyset to find key that contains text
        for(String key : hashmap.keySet()){
            if(key.toLowerCase().contains(text)){ //convert each key to lowercase
                System.out.println(key);
            }
        }
    }

    //prints all keys
    public static void printKeys(HashMap<String,String> hashmap){
        System.out.print("Keys: ");
        //one way
        for(String key : hashmap.keySet()){
            System.out.print(key + " ");
        }
        //Another way
        System.out.print("\nSimilar way: ");
        //entry set returns a set view of the hash map
        for(Map.Entry<String,String> e : hashmap.entrySet()){
            System.out.print(e.getKey() + " ");
        }
    }
}
