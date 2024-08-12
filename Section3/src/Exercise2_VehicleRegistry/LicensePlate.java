package Exercise2_VehicleRegistry;

class LicensePlate {
    private final String licenseNumber;
    private final String state;

    public LicensePlate(String state, String licenseNumber){
        this.licenseNumber = licenseNumber;
        this.state = state;
    }


    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(obj.getClass() != this.getClass()){
            return false;
        }

        LicensePlate temp = (LicensePlate) obj;

        return this.licenseNumber.equals(temp.licenseNumber) &&
                this.state.equals(temp.state);
    }

    @Override
    public int hashCode(){
        int result = 17;

        //if license plate not null, return hashcode othertwise return 0;
        result = result * 31 + (licenseNumber != null ?licenseNumber.hashCode(): 0);
        result = result * 31 + (state != null ? state.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return state + " " + licenseNumber;
    }
}
