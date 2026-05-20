package ru.yandex.praktikum.didukh.model;

import static ru.yandex.praktikum.didukh.model.constants.Colour.RED;
import static ru.yandex.praktikum.didukh.model.constants.Discount.DISCOUNT_RED_APPLE;
import static ru.yandex.praktikum.didukh.model.constants.Discount.NOT_DISCOUNT;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (getColour().equals(RED)) {
            return DISCOUNT_RED_APPLE;
        } else {
            return NOT_DISCOUNT;
        }
    }
}
