
package com.iluwatar.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  implementiere einen klassenbasierten Adapter für ein {@link FishingBoat}
 */
public class RealBattleFishingBoat extends FishingBoat implements BattleShip {

  private static final Logger LOGGER = LoggerFactory.getLogger(RealBattleFishingBoat.class);

  @Override
  public void fire() {
    LOGGER.info("fire!");
  }

  @Override
  public void move() {
    this.sail();
  }
}
