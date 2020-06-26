package burger_shop;

public class Order {
    private Burger BasicBurger;
    private double basicBurgerPrice = 3.99;
    private Burger HealthBurger;
    private double healthBurgerPrice = 5.99;
    private Burger DeluxeBurger;
    private double DeluxeBurgerPrice = 7.99;
    private String orderToppings1Name;
    private double orderToppings1Price;
    private String orderToppings2Name;
    private double orderToppings2Price;
    private String orderToppings3Name;
    private double orderToppings3Price;
    private String orderToppings4Name;
    private double orderToppings4Price;
    private Meal meal;
    private Drinks drinkType;
    private Side sidesType;

//    public Order(Bread breadType, Meat meatType, Burger basicBurger, Burger healthBurger, Burger deluxeBurger) {
//        this.meatType = meatType;
//        this.breadType = breadType;
//        BasicBurger = basicBurger;
//        HealthBurger = healthBurger;
//        DeluxeBurger = deluxeBurger;
//
//    }


    public Order(Burger basicBurger, Drinks drinkType, Side sidesType) {
        BasicBurger = basicBurger;
        this.drinkType = drinkType;
        this.sidesType = sidesType;
    }

    public Drinks getDrinkType(String name) {
        return drinkType;
    }

    public Side getSidesType(String name) {
        return sidesType;
    }

    public String addBurger(String burgerName) {
        if (BasicBurger != null) {
            System.out.println("Customer has selected the Basic Burger at a cost of " + this.basicBurgerPrice);
        } else if (HealthBurger != null) {
            System.out.println("Customer has selected the Health Burger at a cost of " + this.healthBurgerPrice);
        } else if (DeluxeBurger != null) {
            System.out.println("Customer has selected the Deluxe Burger at a cost of " + this.DeluxeBurgerPrice);
        }
        return burgerName;
    }
    public void addOrderToppings1(String name, double price){
        this.orderToppings1Name = name;
        this.orderToppings1Price = price;
    }

    public void addOrderToppings2(String name, double price){
        this.orderToppings2Name = name;
        this.orderToppings2Price = price;
    }

    public void addOrderToppings3(String name, double price){
        this.orderToppings3Name = name;
        this.orderToppings3Price = price;
    }

    public void addOrderToppings4(String name, double price){
        this.orderToppings4Name = name;
        this.orderToppings4Price = price;}

    public String addDrinks(String drinkType) {
        System.out.println("Customer added " + drinkType + " for no extra charge. Thank you!");
        return drinkType;
    }

    public String addSides(String sidesType) {
        System.out.println("Customer added " + sidesType + " for no extra charge. Thank you!");
        return sidesType;
    }

    public double itemizeBasicBurgerOrder() {
        double totalBasicBurgerPrice = 0;
        System.out.println("Customer has selected the " + addBurger("basic Burger") + " for " + this.basicBurgerPrice);
        if(this.orderToppings1Name != null) {
            System.out.println("Customer added " + this.orderToppings1Name + " for an extra " + this.orderToppings1Price);
        }
        if(this.orderToppings2Name != null) {
            System.out.println("Customer added " + this.orderToppings2Name + " for an extra " + this.orderToppings2Price);
        }
        if(this.orderToppings3Name != null) {
            System.out.println("Customer added " + this.orderToppings3Name + " for an extra " + this.orderToppings3Price);
        }
        if(this.orderToppings4Name != null) {
            System.out.println("Customer added " + this.orderToppings4Name + " for an extra " + this.orderToppings4Price);
        }
        if(drinkType != null) {
            System.out.println("Customer added " + drinkType + " at no extra charge");
        }
        if(sidesType != null) {
            System.out.println("Customer added " + sidesType + " at no extra charge");
        }
        totalBasicBurgerPrice = this.basicBurgerPrice + this.orderToppings1Price + this.orderToppings2Price + this.orderToppings3Price +
                this.orderToppings4Price;

        System.out.println("Your total is " + totalBasicBurgerPrice);
        return totalBasicBurgerPrice;
    }

    public double itemizeHealthBurgerOrder() {
        double totalHealthBurgerPrice = 0;
        System.out.println("Customer selected the " + addBurger("Healthy Burger") + " for a cost of " + this.healthBurgerPrice);
        if(this.orderToppings1Name != null) {
            System.out.println("Customer added " + this.orderToppings1Name + " for an extra " + this.orderToppings1Price);
        }
        if(this.orderToppings2Name != null) {
            System.out.println("Customer added " + this.orderToppings2Name + " for an extra " + this.orderToppings2Price);
        }
        if(this.orderToppings3Name != null) {
            System.out.println("Customer added " + this.orderToppings3Name + " for an extra " + this.orderToppings3Price);
        }
        if(this.orderToppings4Name != null) {
            System.out.println("Customer added " + this.orderToppings4Name + " for an extra " + this.orderToppings4Price);
        }
        if(drinkType != null) {
            System.out.println("Customer added " + drinkType + " at no extra charge");
        }
        if(sidesType != null) {
            System.out.println("Customer added " + sidesType + " at no extra charge");
        }
        totalHealthBurgerPrice = this.healthBurgerPrice + this.orderToppings1Price + this.orderToppings2Price + this.orderToppings3Price +
                this.orderToppings4Price;

        System.out.println("Your total is " + totalHealthBurgerPrice);
        return totalHealthBurgerPrice;
    }

    public double itemizeDeluxeOrder() {
        double totalDeluxePrice = 0;
        System.out.println("Customer selected the " + addBurger("Deluxe Burger") + " for a cost of " + this.DeluxeBurgerPrice);
        if(this.orderToppings1Name != null) {
            System.out.println("Customer added " + this.orderToppings1Name + " for an extra " + this.orderToppings1Price);
        }
        if(this.orderToppings2Name != null) {
            System.out.println("Customer added " + this.orderToppings2Name + " for an extra " + this.orderToppings2Price);
        }
        if(this.orderToppings3Name != null) {
            System.out.println("Customer added " + this.orderToppings3Name + " for an extra " + this.orderToppings3Price);
        }
        if(this.orderToppings4Name != null) {
            System.out.println("Customer added " + this.orderToppings4Name + " for an extra " + this.orderToppings4Price);
        }
        if(drinkType != null) {
            System.out.println("Customer added " + drinkType + " at no extra charge");
        }
        if(sidesType != null) {
            System.out.println("Customer added " + sidesType + " at no extra charge");
        }
        totalDeluxePrice = this.DeluxeBurgerPrice + this.orderToppings1Price + this.orderToppings2Price + this.orderToppings3Price +
                this.orderToppings4Price;

        System.out.println("Your total is " + totalDeluxePrice);
        return totalDeluxePrice;
    }
}
