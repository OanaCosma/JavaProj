package company.lab6.AnimalRescue;

public class AnimalFood {
    private String foodName;
    private int foodPrice;
    private int foodQuantity;
    private int foodCart;

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getFoodName() {
        return foodName;
    }

    public void setFoodPrice(int foodPrice){
        this.foodPrice=foodPrice;
    }
    public int getFoodPrice(){
        return foodPrice;
    }

    public void setFoodQuantity(int foodQuantity){
        this.foodQuantity=foodQuantity;
    }
    public int getFoodQuantity(){
        return foodQuantity;
    }

    public void setFoodCart( int foodCart){
        this.foodCart=foodCart;
    }
    public int getFoodCart() {
        return foodCart;
    }


}