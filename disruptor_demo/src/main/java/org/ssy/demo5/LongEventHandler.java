package org.ssy.demo5;

import com.lmax.disruptor.EventHandler;

/**
 * Created by manager on 2018/6/16.
 * 定义消费者处理逻辑
 */
public class LongEventHandler implements EventHandler<LongEvent> {

  public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
    System.out.println("Event: " + event.toString() + "sequence:" + sequence);
  }

}

