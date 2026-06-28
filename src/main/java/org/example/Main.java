package org.example;

import model.Apple;
import model.Meat;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

// Заполняем массив
        Food[] cart = new Food[3];
        cart[0] = new Meat(5, 100);
        cart[1] = new Apple (10, 50, Colour.RED);
        cart[2] = new Apple (8, 60, Colour.GREEN);

// Передаем массив в конструктор корзины
        ShoppingCart shoppingCart = new ShoppingCart(cart);

// Считаем значения
        double totalSum = shoppingCart.totalSum();
        double totalSumDiscount = shoppingCart.totalSumDiscount();
        double totalSumVegatarian = shoppingCart.totalSumVegatarian();

        System.out.printf("Общая сумма товаров без скидки: %.2f%n", totalSum);
        System.out.printf("Общая сумма товаров со скидкой: %.2f%n", totalSumDiscount);
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f%n", totalSumVegatarian);

    }
}