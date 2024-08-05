package Exercise2_Abbreviations;

class Main {
    public static void main(String[] args) {
        Abbreviations abbreviationObj = new Abbreviations();

        abbreviationObj.addAbbreviation("e.g.", "for example");
        abbreviationObj.addAbbreviation("etc.", "and so on");
        abbreviationObj.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. etc. i.e. chicken";
        for(String piece : text.split(" ")){
                piece = abbreviationObj.getExplanationFor(piece);
                System.out.println(piece);
        }
    }
}
