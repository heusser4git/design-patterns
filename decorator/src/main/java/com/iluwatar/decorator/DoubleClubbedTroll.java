package com.iluwatar.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoubleClubbedTroll extends TrollDecorator {
    private static final Logger LOGGER = LoggerFactory.getLogger(DoubleClubbedTroll.class);

    public DoubleClubbedTroll(Troll decorated) {
        super(decorated);
    }

    @Override
    public void attack() {
        super.attack();
        super.attack();
        LOGGER.info("The troll swings twice at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + 20;
    }
}
