package ru.yandex.praktikum.didukh.model;

import ru.yandex.praktikum.didukh.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, "red");
        Apple appleGreen = new Apple(8, 60, "green");

        Food[] food = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(food);

        double totalSumWithoutDiscount = shoppingCart.getTotalSumWithoutDiscount();
        double totalSumWithDiscount = shoppingCart.gettotalSumWithDiscount();
        double totalSumWithoutDiscountVegetarian = shoppingCart.getTotalSumWithoutDiscountVegetarian();

        System.out.println("Общая сумма товаров без скидки: " + totalSumWithoutDiscount);
        System.out.println("Общая сумма товаров со скидкой: " + totalSumWithDiscount);
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + totalSumWithoutDiscountVegetarian);
    }
}
