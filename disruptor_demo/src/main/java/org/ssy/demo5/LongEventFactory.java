package org.ssy.demo5;

import com.lmax.disruptor.EventFactory;

/**
 * Created by manager on 2018/6/16.
 * 定义一个事件工厂，创建事件
 *
 */
public class LongEventFactory implements EventFactory<LongEvent> {

  public LongEvent newInstance() {
    return new LongEvent();
  }
}
