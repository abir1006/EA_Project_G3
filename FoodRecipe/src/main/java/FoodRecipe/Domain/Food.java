package FoodRecipe.Domain;

public class Food {
    private String foodName;
    private String foodDescription;
    private String foodPrice;
    private String foodIngredients;

    public Food(String foodName, String foodDescription, String foodPrice, String foodIngredients) {
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodIngredients = foodIngredients;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }
}
