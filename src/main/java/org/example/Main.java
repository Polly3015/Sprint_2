package org.example;

import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Заполняем массив
        Food[] cart = new Food[3];
        cart[0] = new Meat(5, 100);
        cart[1] = new Apple (10, 50, "red");
        cart[2] = new Apple (8, 60, "green");

// Передаем массив в конструктор корзины
        ShoppingCart shoppingCart = new ShoppingCart(cart);

// Считаем значения
        double totalSum = shoppingCart.totalSum();
        double totalSumDiscount = shoppingCart.totalSumDiscount();
        double totalSumVegatarian = shoppingCart.totalSumVegatarian();

        System.out.println("Общая сумма товаров без скидки: " + totalSum);
        System.out.println("Общая сумма товаров со скидкой: " + totalSumDiscount);
        System.out.println("Сумма всех вегеетарианских продуктов без скидки: " + totalSumVegatarian);


    }
}