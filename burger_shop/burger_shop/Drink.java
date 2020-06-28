package burger_shop;


public class Drink {
    private String drink;
    public static final Drink COKE = new Drink("Coke");
    public static final Drink DIETCOKE = new Drink("Diet Coke");
    public static final Drink SPRITE = new Drink("Sprite");
    public static final Drink DRPEPPER = new Drink("Dr. Pepper");
    public static final Drink FANTA = new Drink("Fanta");

    public Drink(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }

    public static Drink getCOKE() {
        return COKE;
    }

    public static Drink getDIETCOKE() {
        return DIETCOKE;
    }

    public static Drink getSPRITE() {
        return SPRITE;
    }

    public static Drink getDRPEPPER() {
        return DRPEPPER;
    }

    public static Drink getFANTA() {
        return FANTA;
    }

    @Override
    public String toString() {
        return String.format(drink);
    }


}
