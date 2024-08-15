package Exercise1_DictionaryTranslation;

import java.util.HashMap;
import java.util.ArrayList;

//to store many translations in different languages for one word
//contains methods to add and remove
class DictionaryOfManyTranslations {

   private HashMap<String,ArrayList<String>> translations;

   public DictionaryOfManyTranslations(){
       this.translations = new HashMap<>();
   }

   //add translation for and preserves old translations
    public void add(String word, String translation){
       //if empty add list to correlating word (Key)
       this.translations.putIfAbsent(word, new ArrayList<>());
       //then retrieve list and add translation(values) for that particular word (key)
        this.translations.get(word).add(translation);
    }

    //returns list translations(in different langauges) for the word
    public ArrayList<String> translate(String word){
       //if no values for translated word, return null
        if(!(this.translations.containsKey(word))){
            return new ArrayList<String>();
        }
       return this.translations.get(word);
    }

    //to remove word and all translations of word
    public void remove(String word){
       this.translations.remove(word);

    }



}
