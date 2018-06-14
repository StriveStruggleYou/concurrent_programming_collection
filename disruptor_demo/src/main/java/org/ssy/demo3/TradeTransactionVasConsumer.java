package org.ssy.demo3;

import com.lmax.disruptor.EventHandler;
import org.ssy.demo1.TradeTransaction;

/**
 * Created by manager on 2018/6/14.
 */
public class TradeTransactionVasConsumer implements EventHandler<TradeTransaction> {

  @Override
  public void onEvent(TradeTransaction event, long sequence,
      boolean endOfBatch) throws Exception {
    //do something....
  }

}
