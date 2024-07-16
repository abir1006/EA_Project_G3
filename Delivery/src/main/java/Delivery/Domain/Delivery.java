package Delivery.Domain;

public class Delivery {
    private String deliveryNumber;
    private String address;
    private String deliveryDate;
    private String deliveryTime;

    public Delivery(String deliveryNumber, String address, String deliveryDate, String deliveryTime) {
        this.deliveryNumber = deliveryNumber;
        this.address = address;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }
}
