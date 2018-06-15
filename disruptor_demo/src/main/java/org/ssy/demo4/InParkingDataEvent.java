package org.ssy.demo4;

/**
 * Created by manager on 2018/6/15.
 */
public class InParkingDataEvent {

  private String carLicense = "";

  public void setCarLicense(String carLicense) {
    this.carLicense = carLicense;
  }

  public String getCarLicense() {
    return carLicense;
  }
}