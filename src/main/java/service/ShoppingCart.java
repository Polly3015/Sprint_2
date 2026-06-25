package service;
import model.Food;

public class ShoppingCart {
    public Food[] cart;

    public ShoppingCart(Food[] cart) {  // консруктор с одним параметром, массивом элементов Food
        this.cart = cart;
    }

    // получить общую сумму товаров в корзине без скидки,
    public double totalSum() {
        double total = 0.0;
        for (int i = 0; i < cart.length; i++) {
            total = total + (cart[i].getAmount() * cart[i].getPrice());
        }
        return total;
    }

    // получить общую сумму товаров в корзине со скидкой
    public double totalSumDiscount() {
        double total = 0.0;
        for (int i = 0; i < cart.length; i++) {
            total = total + (cart[i].getAmount() * cart[i].priceDiscount());
        }
        return total;
    }

    // получить общую сумму всех вегетарианских продуктов в корзине без скидки.

    public double totalSumVegatarian() {
        double total = 0.0;
        for (int i = 0; i < cart.length; i++) {
            if (cart[i].isVegetarian() == true) {
                total = total + (cart[i].getAmount() * cart[i].getPrice());
            }
        }
        return total;
    }

}
