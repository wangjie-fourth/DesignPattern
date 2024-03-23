package org.github.fourth.desgin.pattern.behavioral.strategy.before;

public interface PaymentManager {
    double calculate(double rawPrice, String userType);
}
