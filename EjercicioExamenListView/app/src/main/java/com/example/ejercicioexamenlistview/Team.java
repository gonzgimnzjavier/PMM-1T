package com.example.ejercicioexamenlistview;

public class Team {
    private String name;
    private String city;
    private String country;
    private String yearOfFoundation;
    private int imageResourceId;

    public Team(String name, String city, String country, String yearOfFoundation, int imageResourceId) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getYearOfFoundation() {
        return yearOfFoundation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
