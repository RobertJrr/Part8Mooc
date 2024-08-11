package Exercise1_SameDate;


class Main {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1,2,2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5,2,2012)));
        System.out.println(d.equals(new SimpleDate(1,2,2000)));

        int hs = d.hashCode();
        int hs1 = new SimpleDate(5,2,2012).hashCode();
        int hs2 = new SimpleDate(1,2,2000).hashCode();

        System.out.println("HashCode: " + hs + " HashCode: " + new SimpleDate(1,2,2000).hashCode());
        System.out.println("HashCode: " + hs1 + " HashCode: " + new SimpleDate(5,2,2012).hashCode());
        System.out.println("HashCode: " + hs2 + " HashCode: " + new SimpleDate(1,2,2000).hashCode());


    }
}
