package com.ugur.daily.energy.requirement.DailyEnergyRequirement;

public class Human {
    int age;
    int height;
    double weight;
    String gender;

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
