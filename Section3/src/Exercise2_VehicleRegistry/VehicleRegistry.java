package Exercise2_VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

class VehicleRegistry {
    HashMap<LicensePlate, String> owners;

    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate lp, String owner){
        //if hashmap does not have key lp already, assign owner(key) to that lp
        if(!(owners.containsKey(lp))){
            owners.put(lp,owner);
            return true;
        }
        //otherwise return false
        return false;
    }

    public String getOwner(LicensePlate licensePlate){
        //return owner of licensePlate, otherwise return N/A
        return owners.getOrDefault(licensePlate,"N/A");
    }

    public boolean remove(LicensePlate licensePlate){
        if(owners.containsKey(licensePlate)){
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        System.out.println(owners.keySet());

    }

    public void printOwners(){
        ArrayList<String> carOwners = new ArrayList<>();
        ///get values(String type owner) and
        for(String owner : owners.values()){
            //if list of carOwners does not contain owner, add to list and print out owner
            if(!(carOwners.contains(owner))){
                carOwners.add(owner);
                System.out.print(owner + ", ");
            }
        }
    }
}
