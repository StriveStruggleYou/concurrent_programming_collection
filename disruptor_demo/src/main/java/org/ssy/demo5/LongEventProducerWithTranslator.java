package org.ssy.demo5;


import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.EventTranslatorOneArg;
import java.nio.ByteBuffer;

/**
 * Created by manager on 2018/6/16.
 * 3.0 版本使用转换器进行生产数据
 *
 */




public class LongEventProducerWithTranslator {

  private final RingBuffer<LongEvent> ringBuffer;

  public LongEventProducerWithTranslator(RingBuffer<LongEvent> ringBuffer) {
    this.ringBuffer = ringBuffer;
  }

  private static final EventTranslatorOneArg<LongEvent, ByteBuffer> TRANSLATOR =
      new EventTranslatorOneArg<LongEvent, ByteBuffer>() {
        public void translateTo(LongEvent event, long sequence, ByteBuffer bb) {
          event.set(bb.getLong(0));
        }
      };

  public void onData(ByteBuffer bb) {
    ringBuffer.publishEvent(TRANSLATOR, bb);
  }
}
