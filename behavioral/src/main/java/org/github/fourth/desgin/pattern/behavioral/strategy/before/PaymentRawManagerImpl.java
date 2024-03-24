package org.github.fourth.desgin.pattern.behavioral.strategy.before;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings("UUF_UNUSED_FIELD")
public class PaymentRawManagerImpl implements PaymentManager {
    private String userType;
    @Override
    public double calculate(double rawPrice, String userType) {
        if (UserType.GOLD.name().equals(userType)) {
            return rawPrice * 0.8;
        } else if (UserType.SILVER.name().equals(userType)) {
            return rawPrice * 0.9;
        } else {
            return rawPrice;
        }
    }
}
