/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * The Decorator pattern is a more flexible alternative to subclassing. The Decorator class
 * implements the same interface as the target and uses aggregation to "decorate" calls to the
 * target. Using the Decorator pattern it is possible to change the behavior of the class during
 * runtime.
 * <p>
 * In this example we show how the simple {@link SimpleTroll} first attacks and then flees the battle.
 * Then we decorate the {@link SimpleTroll} with a {@link ClubbedTroll} and perform the attack again. You
 * can see how the behavior changes after the decoration.
 * 
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {

    // simple troll
    LOGGER.info("A simple looking troll approaches.");
    Troll troll = new SimpleTroll();
    troll.attack();
    troll.fleeBattle();
    LOGGER.info("Simple troll power {}.\n", troll.getAttackPower());

    // change the behavior of the simple troll by adding a decorator
    LOGGER.info("A troll with huge club surprises you.");
    Troll clubbed = new ClubbedTroll(troll);
    clubbed.attack();
    clubbed.fleeBattle();
    LOGGER.info("Clubbed troll power {}.\n", clubbed.getAttackPower());


    LOGGER.info("A troll with two huge clubs surprises you.");
    // 1.) instanziiere einen 'doubleClubbed' troll der 2 Keulen schwingt.
    Troll dct = new DoubleClubbedTroll(troll);
    dct.attack();
    dct.fleeBattle();
    LOGGER.info("DoubleClubbed troll power {}.\n", dct.getAttackPower());


    LOGGER.info("A troll with a huge club and an arch surprises you.");
    /*
       2.) @todo: instanziiere einen 'clubbedArcherTroll' der eine Keule schwingt und einen Bogen hat.
        Hinweis: Erstelle dazu einen neuen ConcreteDecorator 'ArchTroll'
     */
    Troll at = new ArchTroll(troll);
    at.attack();
    at.fleeBattle();
    LOGGER.info("ArchTroll power {}.\n", at.getAttackPower());


  }
}
