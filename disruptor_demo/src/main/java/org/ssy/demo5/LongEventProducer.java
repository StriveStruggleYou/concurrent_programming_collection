package org.ssy.demo5;

import com.lmax.disruptor.RingBuffer;
import java.nio.ByteBuffer;

/**
 * Created by manager on 2018/6/16.
 * 事件的生产者
 */
public class LongEventProducer {

  private final RingBuffer<LongEvent> ringBuffer;

  public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
    this.ringBuffer = ringBuffer;
  }

  public void onData(ByteBuffer bb) {


    System.out.println("ringBuffer:" + ringBuffer.getMinimumGatingSequence() + "position:"+ringBuffer.remainingCapacity());

    long startTime = System.currentTimeMillis();
    long sequence = ringBuffer.next();

    long getSequence = System.currentTimeMillis();
    System.out.println("getSequence:" + (getSequence - startTime) + "ms");

    // Grab the next sequence
    try {
      LongEvent event = ringBuffer.get(sequence); // Get the entry in the Disruptor

      long getEvent = System.currentTimeMillis();
      System.out.println("getEvent:" + (getEvent - getSequence) + "ms");
      // for the sequence
      event.set(bb.getLong(0));  // Fill with data
    } finally {
      ringBuffer.publish(sequence);

      System.out.println("LongEventProducer:" + (System.currentTimeMillis() - getSequence) + "ms");

    }
  }
}
