package service;
import model.Food;

public class ShoppingCart {
    private Food[] cart;

    public ShoppingCart(Food[] cart) {  // консруктор с одним параметром, массивом элементов Food
        this.cart = cart;
    }

    // получить общую сумму товаров в корзине без скидки,
    public double totalSum() {
        double total = 0.0;
        for (Food item : cart) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }
        /*for (int i = 0; i < cart.length; i++) {
            total += (cart[i].getAmount() * cart[i].getPrice());
        }
         */

    // получить общую сумму товаров в корзине со скидкой
    public double totalSumDiscount() {
        double total = 0.0;
        for (Food item : cart) {
            total += (item.getAmount() * item.priceDiscount());
        }
        return total;
    }

    // получить общую сумму всех вегетарианских продуктов в корзине без скидки.

    public double totalSumVegatarian() {
        double total = 0.0;
        for (Food item : cart) {
            if (item.isVegetarian()) {
                total += (item.getAmount() * item.getPrice());
            }
        }
        return total;
    }

}
