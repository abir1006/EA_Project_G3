package restaurant;

public class Restaurant {
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantContact;
    private String restaurantOwner;

    public Restaurant(String restaurantName, String restaurantAddress, String restaurantContact, String restaurantOwner) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantContact = restaurantContact;
        this.restaurantOwner = restaurantOwner;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public String getRestaurantContact() {
        return restaurantContact;
    }

    public String getRestaurantOwner() {
        return restaurantOwner;
    }
}
