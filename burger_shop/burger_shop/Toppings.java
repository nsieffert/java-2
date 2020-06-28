package burger_shop;

public class Toppings {
    private String topping;
    private double price;
    private boolean isHealthy;
    public static final Toppings TOMATOES = new Toppings("tomatoes", .50, true);
    public static final Toppings PICKLES = new Toppings("pickles", .50, true);
    public static final Toppings ONIONS = new Toppings("onions", .50, true);
    public static final Toppings LETTUCE = new Toppings("lettuce", .50, true);
    public static final Toppings JALAPENOS = new Toppings("jalapenos", .50, true);
    public static final Toppings SPINACH = new Toppings("spinach", .50, true);
    public static final Toppings BACON = new Toppings("bacon", .50, false);
    public static final Toppings CHEESE = new Toppings("cheese", .50, false);
    public static final Toppings MAYO = new Toppings("mayo", .50, false);
    public static final Toppings KETCHUP = new Toppings("ketchup", .50, false);
    public static final Toppings MUSTARD = new Toppings("mustard", .50, true);

    public Toppings(String topping, double price, boolean isHealthy) {
        this.topping = topping;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public String getTopping() {
        return topping;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public static Toppings getTOMATOES() {
        return TOMATOES;
    }

    public static Toppings getPICKLES() {
        return PICKLES;
    }

    public static Toppings getONIONS() {
        return ONIONS;
    }

    public static Toppings getLETTUCE() {
        return LETTUCE;
    }

    public static Toppings getJALAPENOS() {
        return JALAPENOS;
    }

    public static Toppings getSPINACH() {
        return SPINACH;
    }

    public static Toppings getBACON() {
        return BACON;
    }

    public static Toppings getCHEESE() {
        return CHEESE;
    }

    public static Toppings getMAYO() {
        return MAYO;
    }

    public static Toppings getKETCHUP() {
        return KETCHUP;
    }

    public static Toppings getMUSTARD() {
        return MUSTARD;
    }

    @Override
    public String toString() {
        return String.format(topping);
    }
}
