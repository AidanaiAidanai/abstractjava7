package com.task;

public class Horse extends Animal{
    private String color;
    public Horse(String nickName, int age, int weight, String gender, String color) {
        super(nickName, age, weight, gender);
        this.color = color;
    }
}
