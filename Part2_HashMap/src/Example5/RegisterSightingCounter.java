package Example5;

import java.util.HashMap;

public class RegisterSightingCounter {
    private HashMap<String,Integer> allSightings;

    public RegisterSightingCounter(){
        this.allSightings = new HashMap<>();
    }

    public void addSighting(String sighted){

        //searches for key (first parameter) if not found, returns 0 (second parameter)
        //if found, returns value of that key (Integer)
        int timesSighted = this.allSightings.getOrDefault(sighted,0);
        //increment timesSighted by one
        timesSighted++;
        //add Key sighting(String) and Value timesSighted (Integer)
        this.allSightings.put(sighted,timesSighted);
    }

    //return number of times sighted
    public int timesSighted(String sighted){
        //searches for key passed to it as parameter and if not found
        //returns the value of the second parameter passed to it
        return this.allSightings.getOrDefault(sighted,0);
    }
}
