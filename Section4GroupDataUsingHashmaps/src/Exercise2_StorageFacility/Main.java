package Exercise2_StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");


        //removing item in unit again
        facility.remove("f156","rollerblades");
        System.out.println(facility.getStorageInfo("f156"));

        //removing again, after removing this item, unit is empty and is removed from map
        //based on our remove method we defined
        facility.remove("f156","rollerblades");
        //printing out the storage units
        System.out.println(facility.storageUnits());





//        System.out.println(facility.getStorageInfo("a14"));
//        System.out.println(facility.getStorageInfo("f156"));
//        //nothing prints besides [].
//        // no mapping for this key thus no value (arraylist)
//        System.out.println(facility.getStorageInfo("f435"));


    }
}

class StorageFacility{
    //declaring data fields

    //HashMap which takes Strings as Key with ArrayList as value for each key
    private HashMap<String,ArrayList<String>> storageUnits;

    public StorageFacility(){
        this.storageUnits = new HashMap<>();

    }

    //add method to add unit and item to corresponding unit
    public void add(String unit, String item){
        //if unit key not found, add the key along with list value of String type
        this.storageUnits.putIfAbsent(unit,new ArrayList<String>());
        this.storageUnits.get(unit).add(item);
    }

    //method to return list that contains all items in the storage unit
    //indiciated by the paramter
    public ArrayList<String> getStorageInfo(String unit){

        ArrayList<String> listOfItemsInUnit = this.storageUnits.get(unit);
        if(listOfItemsInUnit == null || listOfItemsInUnit.isEmpty()){
            return new ArrayList<String>();
        }
        return listOfItemsInUnit;
    }

    //remove given item from given storage unit
    //only removes one item
    public void remove(String unit, String item){
        //removes only first occurence of String item in list
        this.storageUnits.get(unit).remove(item);

        //if empty after removing last unit, remove the key(unit)
        if(storageUnits.get(unit).isEmpty()){
            storageUnits.remove(unit);
        }
    }


    //returns name of the storage units as a list
    public ArrayList<String> storageUnits(){
        //return new arraylist initialized with the keySet
        return new ArrayList<>(this.storageUnits.keySet());
    }
}