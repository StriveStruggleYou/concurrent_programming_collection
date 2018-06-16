package org.ssy.demo6;

/**
 * Created by manager on 2018/6/16.
 */

import static org.junit.Assert.assertEquals;

import com.lmax.disruptor.EventHandler;

public class SingleEventConsumer implements EventConsumer {

  private int expectedValue = -1;

  @Override
  @SuppressWarnings("unchecked")
  public EventHandler<ValueEvent>[] getEventHandler() {
    final EventHandler<ValueEvent> eventHandler = (event, sequence, endOfBatch) -> assertExpectedValue(event.getValue());
    return new EventHandler[] { eventHandler };
  }

  private void assertExpectedValue(final int id) {
    assertEquals(++expectedValue, id);
  }
}
