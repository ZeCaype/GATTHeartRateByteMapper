package com.levio.cil.accuchek.dtos;

public class HeartRateMeasurementDto {

  private HeartRateMeasurementFlagsDto flags;
  private int heartRateMeasurementValue;
  private int energyExpended;
  private int rrInterval;

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

  public int getRrInterval() {
    return rrInterval;
  }

  public void setRrInterval(int rrInterval) {
    this.rrInterval = rrInterval;
  }

}
