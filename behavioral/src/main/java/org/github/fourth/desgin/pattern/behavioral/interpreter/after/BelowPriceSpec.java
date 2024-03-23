package org.github.fourth.desgin.pattern.behavioral.interpreter.after;


import org.github.fourth.desgin.pattern.behavioral.interpreter.basic.Product;

public class BelowPriceSpec extends Spec{
    private float price;

    public BelowPriceSpec(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public boolean isSatisfiedBy(Product product) {
        return product.getPrice() < getPrice();
    }
}
