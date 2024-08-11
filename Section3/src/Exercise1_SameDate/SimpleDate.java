package Exercise1_SameDate;

class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj){
        //if obj null return false
        if(obj == null){
            return false;
        }

        //if not instance of SimpleDate returnfalse
        if(!(obj instanceof SimpleDate)){
            return false;
        }

        SimpleDate s = (SimpleDate) obj;

        return this.day == s.day && this.month == s.month
                && this.year == s.year;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + year;
        result = 31 * result + day;
        result = 31 * result + month;
        return result;
    }
}
//Equals is always called after the hashCode method in a java hashed collection
// while adding and removing elements. The reason being, if there is an element
// already at the specified bucket, then JVM checks whether it is the same element
// which it is trying to put. In case if the equals returns false then the element
// is added to the same bucket but at the end of list at the bucket. So now you just
// dont have a single element at the same bucket but a list of elements.