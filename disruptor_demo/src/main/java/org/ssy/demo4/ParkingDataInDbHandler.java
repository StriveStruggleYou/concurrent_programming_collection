package org.ssy.demo4;

/**
 * Created by manager on 2018/6/15.
 */

import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WorkHandler;

/**
 * @author mawming
 * @version 1.0
 * @create date:2016-9-12.
 */
public class ParkingDataInDbHandler implements EventHandler<InParkingDataEvent>,WorkHandler<InParkingDataEvent> {

  @Override
  public void onEvent(InParkingDataEvent event) throws Exception {
    long threadId = Thread.currentThread().getId();
    String carLicense = event.getCarLicense();
    System.out.println(String.format("Thread Id %s save %s into db ....",threadId,carLicense));
  }

  @Override
  public void onEvent(InParkingDataEvent event, long sequence, boolean endOfBatch) throws Exception {
    // TODO Auto-generated method stub
    this.onEvent(event);
  }

}

