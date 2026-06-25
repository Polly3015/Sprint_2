package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    public String colour;

    public Apple (int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;  // т.к. модификатор protected

    }

    @Override
    public int getDiscount() {
        if (Colour.RED == colour) {
            return Discount.DISCOUNT_RED_APPLE;
        }
        return 0;
    }

    @Override
    public double priceDiscount() {
        int discount = getDiscount();
        return price * (100 - discount) / 100.0;
    }

}
