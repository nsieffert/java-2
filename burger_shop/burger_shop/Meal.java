package burger_shop;

public class Meal {
    private double price = 10.99;
    private Burger basicBurger;
    private Side sideTypeName;
    private Drinks drinkTypeName;


    public Meal(Burger BasicBurger, Side sideTypeName, Drinks drinkTypeName) {
        this.price = 10.99;
        this.basicBurger = getBasicBurger();
        this.sideTypeName = sideTypeName;
        this.drinkTypeName = drinkTypeName;

    }

    @Override
    public String toString() {
        return String.format(String.valueOf(basicBurger));
    }

    public double getPrice() {
        return price;
    }

    public Side getSideTypeName() {
        return sideTypeName;
    }

    public Burger getBasicBurger() {
        return basicBurger;
    }

    public Drinks getDrinkTypeName() {
        return drinkTypeName;
    }

    public double itemizeBurgerMeal() {
        double mealTotalPrice = 0;
        System.out.println("Customer ordered the Meal with the " + new BasicBurger("Basic Burger", 2, null, null) +
                ": the price is " + this.price);
        if(this.sideTypeName != null) {
            System.out.println("Customer added " + this.sideTypeName);
        }
        if(this.drinkTypeName != null) {
            System.out.println("Customer added " + this.drinkTypeName);
        }
        mealTotalPrice = 10.99;
        System.out.println("Meal includes a side and a drink. Your total is " + mealTotalPrice);
        return mealTotalPrice;


    }







}

