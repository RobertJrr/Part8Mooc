package Exercise2_Abbreviations;
import java.util.HashMap;

//class to manage common abbreviations

class Abbreviations {

    private HashMap<String,String> abbreviationsAndExplanations;

    public Abbreviations(){
        this.abbreviationsAndExplanations =  new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        //call method to cleane up the strings a bit
        abbreviation = cleanUp(abbreviation);
        explanation = cleanUp(explanation);

        //if already in hashmap, do not add it. Otherwise add it
        if(hasAbbreviation(abbreviation)){
            System.out.println("Abbreviation already added!");
        }else{
            abbreviationsAndExplanations.put(abbreviation,explanation);
            System.out.println("Abbreviation added!");
        }
    }

    //returns if abbreviation is already added
    public boolean hasAbbreviation(String key){
        return this.abbreviationsAndExplanations.containsKey(key);
    }

    public String getExplanationFor(String abbreviation){
        //if abbreviation exists, get its explanation correlating to it.
        //otherwise return null
        if(hasAbbreviation(abbreviation)){
            return this.abbreviationsAndExplanations.get(abbreviation);
        } else {
            return "Explanation not found";
        }
    }


    public static String cleanUp(String word){
        if(word == null){
            word = "";
        }
        word = word.toLowerCase();
        return word.trim();
    }
}
