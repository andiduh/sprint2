package service;
import model.Food;

public class ShoppingCart {
    public Food[] shoppingCart;
    public double total; // Общая сумма товаров без скидки
    public double totalWithDiscount; // Общая сумма товаров со скидкой
    public double totalVegetarian; // Сумма всех вегетарианских продуктов без скидки

    public ShoppingCart(Food[] shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public double total() {
        for(int i = 0; i < shoppingCart.length; i++) {
            total = total + shoppingCart[i].getAmount() * shoppingCart[i].getPrice();
        }
        return total;
    }

    public double totalWithDiscount() {
        for(int i = 0; i < shoppingCart.length; i++) {
            totalWithDiscount = totalWithDiscount + shoppingCart[i].getAmount()*shoppingCart[i].getPrice() * (1 - shoppingCart[i].getDiscount() / 100);
        }
        return totalWithDiscount;
    }

    public double totalVegetarian() {
        for(int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i].getIsVegetarian()) {
                totalVegetarian = totalVegetarian + shoppingCart[i].getAmount() * shoppingCart[i].getPrice();
            }
        }
        return totalVegetarian;
    }

}
