package Example5;

import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1,"Ole");
//        HashMap<int,String> map2 = new HashMap<>();  doesnt work

        int key = 2;
        HashMap<Integer,Integer> hashmap2 = new HashMap<>();
        hashmap2.put(key,10); //automatic conversion autoboxing
        int value = hashmap2.get(key); // 10
        System.out.println(value);

        RegisterSightingCounter lapd = new RegisterSightingCounter();

        lapd.addSighting("abc123");
        lapd.addSighting("abc123");
        lapd.addSighting("abc123");

        System.out.println(lapd.timesSighted("abc123"));
        System.out.println(lapd.timesSighted("133")); //returns 0 since no value found for key 133


    }
}
