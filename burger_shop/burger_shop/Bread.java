package burger_shop;

public class Bread {
    private String bread;
    public static final Bread WHITE = new Bread("White");
    public static final Bread WHEAT = new Bread("Wheat");
    public static final Bread RYE = new Bread("Rye");
    public static final Bread SESAME = new Bread("Sesame");


    public Bread(String bread) {
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }

    public static Bread getWHITE() {
        return WHITE;
    }

    public static Bread getWHEAT() {
        return WHEAT;
    }

    public static Bread getRYE() {
        return RYE;
    }

    public static Bread getSESAME() {
        return SESAME;
    }

    @Override
    public String toString() {
        return String.format(bread);
    }

    }


