package Exercise1_NickNames;

import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        HashMap<String,String> nicknames = new HashMap<>();

        nicknames.put("Matthew","Matt");
        nicknames.put("michael","mix");
        nicknames.put("arthur","artie");

        //use keySet() to get keys and values() to get values
        //printing values
        for(String value : nicknames.values()){
            System.out.println(value);
        }


    }
}
