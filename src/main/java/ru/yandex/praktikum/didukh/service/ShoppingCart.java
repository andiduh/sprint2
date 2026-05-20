package ru.yandex.praktikum.didukh.service;

import ru.yandex.praktikum.didukh.model.Food;

public class  ShoppingCart {
    private Food[] shoppingCart;

    public ShoppingCart(Food[] shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public double getTotalSumWithoutDiscount() {
        double totalSumWithoutDiscount = 0;
        for (Food food : shoppingCart) {
            totalSumWithoutDiscount += food.getAmount() * food.getPrice();
        }
        return totalSumWithoutDiscount;
    }

    public double gettotalSumWithDiscount() {
        double totalSumWithDiscount = 0;
        for (Food food : shoppingCart) {
            totalSumWithDiscount += food.getAmount() * food.getPrice() * (1 - food.getDiscount() / 100);
        }
        return totalSumWithDiscount;
    }

    public double getTotalSumWithoutDiscountVegetarian() {
        double totalSumWithoutDiscountVegetarian = 0;
        for (Food food : shoppingCart) {
            if (food.IsVegetarian()) {
                totalSumWithoutDiscountVegetarian += food.getAmount() * food.getPrice();
            }
        }
        return totalSumWithoutDiscountVegetarian;
    }
}
