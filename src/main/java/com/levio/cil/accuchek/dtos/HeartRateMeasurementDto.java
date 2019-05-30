package com.levio.cil.accuchek.dtos;

public class HeartRateMeasurementDto {

  private HeartRateMeasurementFlagsDto flags;
  private int heartRateMeasurementValue;
  private int energyExpended;

  public HeartRateMeasurementDto() {

  }

  public HeartRateMeasurementFlagsDto getFlags() {
    return flags;
  }

  public void setFlags(HeartRateMeasurementFlagsDto flags) {
    this.flags = flags;
  }

  public int getHeartRateMeasurementValue() {
    return heartRateMeasurementValue;
  }

  public void setHeartRateMeasurementValue(int heartRateMeasurementValue) {
    this.heartRateMeasurementValue = heartRateMeasurementValue;
  }

  public int getEnergyExpended() {
    return energyExpended;
  }

  public void setEnergyExpended(int energyExpended) {
    this.energyExpended = energyExpended;
  }

}
