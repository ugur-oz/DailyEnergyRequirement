package com.ugur.daily.energy.requirement.DailyEnergyRequirement;

public class Human {
    int age;
    int height;
    double weight;
    boolean male;

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", male=" + male +
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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
