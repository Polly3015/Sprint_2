package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    private String colour;

    public Apple (int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;  // т.к. модификатор protected

    }

    // переопределение скидки
    @Override
    public int getDiscount() {
        return (Colour.RED.equals(colour)) ? Discount.DISCOUNT_RED_APPLE : 0;
    }


    /*
    // для себя
        if (Colour.RED.equals(colour)) {
            return Discount.DISCOUNT_RED_APPLE;
        }
        return 0;
    }
     */
}
