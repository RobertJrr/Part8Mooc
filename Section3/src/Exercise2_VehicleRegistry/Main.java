package Exercise2_VehicleRegistry;
import java.util.ArrayList;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        LicensePlate l1 = new LicensePlate("CA","9X34HS7");
        LicensePlate l2 = new LicensePlate("CA","33JCS0C");
        LicensePlate l3 = new LicensePlate("AZ","23DFR09");
        LicensePlate l4 = new LicensePlate("AZ","23DFR09");

        VehicleRegistry registry = new VehicleRegistry();

        System.out.println(registry.add(l1,"Robert"));
        System.out.println(registry.add(l2,"Esme"));
        System.out.println(registry.add(l3,"Jojo"));

        registry.printLicensePlates();
        registry.printOwners();




    }
}
