package Example1;

import java.util.HashMap;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
//        HashMap<String,String> phoneNumbers = new HashMap<>();
//        phoneNumbers.put("Pekka","040-12348765");
//
//        System.out.println("Pekkas Phone number: " + phoneNumbers.get("Pekka"));
//
//        phoneNumbers.put("Pekka","09-111333");
//
//        System.out.println("Pekka's Number " + phoneNumbers.get("Pekka"));

        //Linking list to individual keys to store multiple phone numbers
        HashMap<String,ArrayList<String>> phoneNumbers = new HashMap<>();

        //initially attach an empty list to the name Pekka
        phoneNumbers.put("Pekka", new ArrayList<>());

        //add a phone number to the list at Pekka
        //use key to return value which is a list then add String to list attachd to key
        phoneNumbers.get("Pekka").add("040-12348765");
        phoneNumbers.get("Pekka").add("09-111333");

        System.out.println("Pekka's Numbers: " + phoneNumbers.get("Pekka"));
    }
}

