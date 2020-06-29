package burger_shop;


public class Meat {
    private String meat;
    public static final Meat BEEF = new Meat("Beef");
    public static final Meat STEAK = new Meat("Steak");
    public static final Meat CHICKEN = new Meat("Chicken");
    public static final Meat FISH = new Meat("Fish");


    public Meat(String meat) {
        this.meat = meat;
    }

    public String getMeat() {
        return meat;
    }

    public static Meat getBEEF() {
        return BEEF;
    }

    public static Meat getSTEAK() {
        return STEAK;
    }

    public static Meat getCHICKEN() {
        return CHICKEN;
    }

    public static Meat getFISH() {
        return FISH;
    }

    @Override
    public String toString() {
        return String.format(meat);
    }



}