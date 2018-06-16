package org.ssy.demo6;

/**
 * Created by manager on 2018/6/16.
 */

import com.lmax.disruptor.EventFactory;

public final class ValueEvent {

  private int value;

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public final static EventFactory<ValueEvent> EVENT_FACTORY = () -> new ValueEvent();

  @Override
  public String toString() {
    return "ValueEvent{" +
        "value=" + value +
        '}';
  }
}