package model;

import model.constants.Discount;

public abstract class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    // геттеры
    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    // использование метода из interface Discountable. Опредление наличия скидки. По умолчаниию 0.
    @Override
    public int getDiscount() {
        return 0;
    }

    // Применение скидки на товар
    public double priceDiscount() {
        int discount = getDiscount();
        return price * (100 - discount) / 100.0;
    }

}