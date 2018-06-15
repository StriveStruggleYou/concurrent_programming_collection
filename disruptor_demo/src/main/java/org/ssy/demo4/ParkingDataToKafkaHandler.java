package org.ssy.demo4;

import com.lmax.disruptor.EventHandler;

/**
 * Created by manager on 2018/6/15.
 */
public class ParkingDataToKafkaHandler implements EventHandler<InParkingDataEvent> {

  @Override
  public void onEvent(InParkingDataEvent event, long sequence,
      boolean endOfBatch) throws Exception {
    long threadId = Thread.currentThread().getId();
    String carLicense = event.getCarLicense();
    System.out.println(String.format("Thread Id %s send %s in plaza messsage to kafka...",threadId,carLicense));
  }
}