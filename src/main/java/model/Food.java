package model;

import model.constants.Colour;
import model.constants.Discount;

public abstract class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    protected String colour;

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

    // использование метода из interface Discountable. Опредление наличия скидки
    @Override
    public int getDiscount() {
        return (Colour.RED.equals(colour)) ? Discount.DISCOUNT_RED_APPLE : 0;
    }
        /*
        if (Colour.RED.equals(colour)) {
            return Discount.DISCOUNT_RED_APPLE;
        }
        return 0;
    }
     */

    // Применение скидки на товар
    public double priceDiscount() {
        int discount = getDiscount();
        return price * (100 - discount) / 100.0;
    }

}