package org.ssy.demo6;

/**
 * Created by manager on 2018/6/16.
 */
import com.lmax.disruptor.RingBuffer;

/**
 * Producer that produces event for ring buffer.
 */
public interface EventProducer {
  /**
   * Start the producer that would start producing the values.
   * @param ringBuffer
   * @param count
   */
  public void startProducing(final RingBuffer<ValueEvent> ringBuffer, final int count);
}
