package Example1;

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

//        HashMap<String,String> postalCodes = new HashMap<>();

        //search for cities based on postal code
        //key and value
//        postalCodes.put("90745","Carson");
//        postalCodes.put("90744","Wilmas");
//        postalCodes.put("90501","Torrance");
//        postalCodes.put("33720", "Tampere");
//        postalCodes.put("33014", "Tampere");
//        System.out.println(postalCodes.get("90745"));
//
//        HashMap<String,String> numbers = new HashMap<>();
//        numbers.put("One","Uno");
//        numbers.put("Two","Dos");
//
//        String translation = numbers.get("One");
//        System.out.println(translation);
//
//        System.out.println(numbers.get("Two"));
//        System.out.println(numbers.get("Three"));
//        System.out.println(numbers.get("Uno"));

        /*HashMap keys correspond to a Single value at most*/
        HashMap<String,String> numbers = new HashMap<>();
        numbers.put("Uno","One"); //old value for key "Uno" vanishes because of later key
        numbers.put("Dos","Zwei");
        numbers.put("Uno","Ein");
        String translation = numbers.get("Uno");
        System.out.println(translation);
        System.out.println(numbers.get("Dos"));
        System.out.println(numbers.get("Tres"));
        System.out.println(numbers.get("Uno"));


    }
}
