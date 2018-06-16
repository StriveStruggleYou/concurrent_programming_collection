package org.ssy.demo5;

/**
 * Created by manager on 2018/6/16.
 *
 * firstly we will define the Event that will carry the data.
 * 首先定义一个事件以及承载的数据
 */
public class LongEvent {

  private long value;

  public void set(long value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "LongEvent{" +
        "value=" + value +
        '}';
  }
}
