package service;
import model.Food;

public class ShoppingCart {
    private Food[] shoppingCart;

    public ShoppingCart(Food[] shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public double total() {
        double total = 0; // Общая сумма товаров без скидки
        for(int i = 0; i < shoppingCart.length; i++) {
            total = total + shoppingCart[i].getAmount() * shoppingCart[i].getPrice();
        }
        return total;
    }

    public double totalWithDiscount() {
        double totalWithDiscount = 0; // Общая сумма товаров со скидкой
        for(int i = 0; i < shoppingCart.length; i++) {
            totalWithDiscount = totalWithDiscount + shoppingCart[i].getAmount()*shoppingCart[i].getPrice() * (1 - shoppingCart[i].getDiscount() / 100);
        }
        return totalWithDiscount;
    }

    public double totalVegetarian() {
        double totalVegetarian = 0; // Сумма всех вегетарианских продуктов без скидки
        for(int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i].getIsVegetarian()) {
                totalVegetarian = totalVegetarian + shoppingCart[i].getAmount() * shoppingCart[i].getPrice();
            }
        }
        return totalVegetarian;
    }

}
