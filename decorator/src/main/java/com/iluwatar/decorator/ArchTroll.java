package com.iluwatar.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchTroll extends TrollDecorator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArchTroll.class);

    public ArchTroll(Troll decorated) {
        super(decorated);
    }

    @Override
    public void attack() {
        super.attack();
        this.shootArcher();
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + 10;
    }

    private void shootArcher() {
        LOGGER.info("ArchTroll shoots with the Archer!!!! ;-)");
    }
}
