package org.github.fourth.desgin.pattern.creational.builder.before;

public class NutritionFacts {
    private int servingSize;
    private int serving;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public NutritionFacts(int servingSize, int serving, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.serving = serving;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public NutritionFacts(int fat, int sodium) {
        this.fat = fat;
        this.sodium = sodium;
    }

    public NutritionFacts(int servingSize, int serving, int calories) {
        this.servingSize = servingSize;
        this.serving = serving;
        this.calories = calories;
    }
}
