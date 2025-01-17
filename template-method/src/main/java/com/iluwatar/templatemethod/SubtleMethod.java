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
package com.iluwatar.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * SubtleMethod implementation of {@link StealingMethod}.
 *
 */
public class SubtleMethod extends StealingMethod{

  private static final Logger LOGGER = LoggerFactory.getLogger(SubtleMethod.class);

  @Override
  public void steal() {
    super.steal();
  }

  @Override
  String pickTarget() {
    return this.chooseTarget();
  }

  String chooseTarget() {
    return "shop keeper";
  }

  void confuseTarget(String target) {
    LOGGER.info("Approach the {} with tears running and hug him!", target);
  }

  @Override
  void stealTheItem(String target) {
    this.stealIt(target);
  }

  void stealIt(String target) {
    LOGGER.info("While in close contact grab the {}'s wallet.", target);
  }
}
