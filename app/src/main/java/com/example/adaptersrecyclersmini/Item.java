package com.example.adaptersrecyclersmini;

public class Item
{
    //Attribute variables for each member in contacts
    String name;
    String email;

    //The integer is a number generated by Android from
    // getResources().getIdentifier(picture,"drawable", getPackageName())
    //The result is the equilvalent of R.drawable.<imageName> where image is found
    // in the drawable directory
    int image;

    //Custom constructor
    public Item(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

    //Default constructor
    public Item() {
    }

    //Getters and Seters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}