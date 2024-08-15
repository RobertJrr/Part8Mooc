package Exercise1_DictionaryTranslation;

class Main {
    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();

        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        //calls String ToString method to print out the translations in list
        System.out.println(dictionary.translate("lie"));
        System.out.println(dictionary.translate("bow"));
        //remove mapping of key, also removes values for the key
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}
