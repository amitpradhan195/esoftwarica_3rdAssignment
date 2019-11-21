package com.example.esoftwarica.model;

public class modelStudent {

    private String name,address,gender;
    private int age;
    private int imageId;


    public modelStudent(String name, String address, String gender, int age,int imageId)
    {
        this.name = name;
        this.address= address;
        this.age= age;
        this.gender = gender;
        this.imageId= imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
