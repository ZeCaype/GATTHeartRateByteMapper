package com.levio.cil.accuchek.dtos;

public class ThreeZonesHeartRateLimitsDto {

  private int lightModerateLimit;
  private int moderateHardLimit;

  public ThreeZonesHeartRateLimitsDto() {

  }

  public int getLightModerateLimit() {
    return lightModerateLimit;
  }

  public void setLightModerateLimit(int lightModerateLimit) {
    this.lightModerateLimit = lightModerateLimit;
  }

  public int getModerateHardLimit() {
    return moderateHardLimit;
  }

  public void setModerateHardLimit(int moderateHardLimit) {
    this.moderateHardLimit = moderateHardLimit;
  }

}
