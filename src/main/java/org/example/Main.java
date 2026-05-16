package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, "red");
        Apple appleGreen = new Apple(8, 60, "green");

        Food[] food = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(food);

        double total = shoppingCart.total();
        double totalWithDiscount = shoppingCart.totalWithDiscount();
        double totalVegetarian = shoppingCart.totalVegetarian();

        System.out.println("Общая сумма товаров без скидки: " + total);
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount);
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + totalVegetarian);
    }


}