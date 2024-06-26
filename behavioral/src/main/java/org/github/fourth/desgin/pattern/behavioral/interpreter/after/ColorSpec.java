package org.github.fourth.desgin.pattern.behavioral.interpreter.after;


import org.github.fourth.desgin.pattern.behavioral.interpreter.basic.Color;
import org.github.fourth.desgin.pattern.behavioral.interpreter.basic.Product;

public class ColorSpec extends Spec {
    private Color colorOfProductToFind;

    public ColorSpec(Color colorOfProductToFind) {
        this.colorOfProductToFind = colorOfProductToFind;
    }

    public Color getColorOfProductToFind() {
        return colorOfProductToFind;
    }

    public boolean isSatisfiedBy(Product product) {
        return product.getColor().equals(getColorOfProductToFind());
    }
}
