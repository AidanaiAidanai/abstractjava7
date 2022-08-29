package com.task;

public class TaskMain {
    public static void main(String[] args) {
        Cow cow1 = new Cow("Chomok",12,459,"cow");
        Cow cow2 = new Cow("Curly",45,23459,"bull");
        Cow cow3 = new Cow("black cow",2,45945,"bull");
        Cow cow4 = new Cow("smaile",7,459,"cow");
        Cow cow5 = new Cow("smoke",9,1459,"bull");
        Cow cow6 = new Cow("small",5,59,"cow");
        Cow[]cows1 = {cow1,cow2,cow3,cow4,cow5};
        Cow[]cows2 = {cow6};

        Sheep sheep1 = new Sheep("tarmal",15,3456,"sheep");
        Sheep sheep2 = new Sheep("lamb",2,56,"sheep");
        Sheep sheep3 = new Sheep("koi",1,6,"sheep");
        Sheep sheep4 = new Sheep("big",6,156,"sheep");
        Sheep[]sheeps1 = {sheep1,sheep2,sheep3};
        Sheep[]sheeps2 = {sheep4};

        Horse horse1 = new Horse("at",23,34567,"horse","black");
        Horse horse2 = new Horse("julku",2,567,"horse","red");
        Horse horse3 = new Horse("at",6,8567,"horse","green");
        Horse[]horses1 = {horse1,horse2};
        Horse[]horses2 = {horse3};

        Farm farm1 = new Farm("leilek",cows1,horses1,sheeps1,"Omurbek");
        Farm farm2 = new Farm("Batken",cows2,horses2,sheeps2,"Ermek");





    }
}
