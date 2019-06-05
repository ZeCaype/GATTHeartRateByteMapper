package com.levio.cil.accuchek.dtos;

public class SupportedHeartRateRangeDto {

  private int minimumHeartRate;
  private int maximumHeartRate;
  private int minimumIncrement;

  public SupportedHeartRateRangeDto() {

  }

  public int getMinimumHeartRate() {
    return minimumHeartRate;
  }

  public void setMinimumHeartRate(int minimumHeartRate) {
    this.minimumHeartRate = minimumHeartRate;
  }

  public int getMaximumHeartRate() {
    return maximumHeartRate;
  }

  public void setMaximumHeartRate(int maximumHeartRate) {
    this.maximumHeartRate = maximumHeartRate;
  }

  public int getMinimumIncrement() {
    return minimumIncrement;
  }

  public void setMinimumIncrement(int minimumIncrement) {
    this.minimumIncrement = minimumIncrement;
  }

}
