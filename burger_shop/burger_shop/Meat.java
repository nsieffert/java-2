package burger_shop;

public class Meat {
    private String meatType;

    public Meat(String meatType) {
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    @Override
    public String toString() {
        return String.format(meatType);
    }
}














//    public String getMeatType() {
//        if(meat != "beef") {
//            return "You must choose either beef, chicken, pork or fish.";}
//        else if(meat != "chicken") {
//            return "You must choose either beef, chicken, pork or fish."; }
//        else if(meat != "pork") {
//            return "You must choose either beef, chicken, pork or fish."; }
//        else if(meat != "fish") {
//            return "You must choose either beef, chicken, pork or fish."; }
//
//        else {
//            return meat;
//    }
//        }



