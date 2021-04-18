package com.example.egypttourism;

public class Lists {

    private int Image1;
    private String Name1;
    private String Address1;

    private int Image2;
    private String Name2;
    private String Address2;

    public Lists(int Image1, String Name1, String Address1, int Image2, String Name2, String Address2) {
        this.Image1 = Image1;
        this.Name1 = Name1;
        this.Address1 = Address1;
        this.Image2 = Image2;
        this.Name2 = Name2;
        this.Address2 = Address2;
    }

    public int getImage1() {
        return Image1;
    }

    public void setRowImage1(int rowImage1) {
        this.Image1 = rowImage1;
    }

    public String getName1() {
        return Name1;
    }

    public void setRestaurantName1(String restaurantName1) {
        this.Name1 = restaurantName1;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setRestaurantAddress1(String restaurantAddress1) {
        this.Address1 = restaurantAddress1;
    }

    public int getImage2() {
        return Image2;
    }

    public void setRowImage2(int rowImage2) {
        this.Image2 = rowImage2;
    }

    public String getName2() {
        return Name2;
    }

    public void setRestaurantName2(String restaurantName2) {
        this.Name2 = restaurantName2;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setRestaurantAddress2(String restaurantAddress2) {
        this.Address2 = restaurantAddress2;
    }
}
