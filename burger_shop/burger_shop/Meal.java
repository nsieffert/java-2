package burger_shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Meal {
    private HealthBurger healthBurger;
    private DeluxeBurger deluxeBurger;
    private BasicBurger basicBurger;
    private double price;
    private List<Meal> meals = new ArrayList<>();

    public Meal(BasicBurger basicBurger, double price) {this.basicBurger = basicBurger;}
    public Meal(HealthBurger healthBurger, double price) {
        this.healthBurger = healthBurger;
    }
    public Meal(DeluxeBurger deluxeBurger, double price) {
        this.deluxeBurger = deluxeBurger;
    }
    public double getPrice() {
        return price;
    }
    public HealthBurger getHealthBurger() {return healthBurger;}
    public DeluxeBurger getDeluxeBurger() {return deluxeBurger;}
    public BasicBurger getBasicBurger() {return basicBurger;}

//    public boolean checkMeal(Burger burger) {
//        Meal meal = new Meal(BasicBurger basicBurger, 4.99, HealthBurger healthBurger, 6.99, DeluxeBurger deluxeBurger, 8.99);
//        int foundMeal = Collections.binarySearch(meals, meal, null);
//        if(foundMeal >=0) {
//            return meals.get(foundMeal).checkMeal(burger);
//        } else{
//            System.out.println("You have already selected this burger.");
//            return false;
//        }
//    }
}