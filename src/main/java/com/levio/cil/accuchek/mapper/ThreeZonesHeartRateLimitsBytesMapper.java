package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.ThreeZonesHeartRateLimitsDto;

@Component
public class ThreeZonesHeartRateLimitsBytesMapper {

  public ThreeZonesHeartRateLimitsBytesMapper() {

  }

  public ThreeZonesHeartRateLimitsDto mapArrayOfBytesToReadableData(int[] dataDto) {
    ThreeZonesHeartRateLimitsDto limit = new ThreeZonesHeartRateLimitsDto();
    String raw8Bits;

    setLightModerateLimit(dataDto, limit);
    setModerateHardLimit(dataDto, limit);

    return limit;
  }

  private void setModerateHardLimit(int[] dataDto, ThreeZonesHeartRateLimitsDto limit) {
    String raw8Bits;
    raw8Bits = intToBinaryString(dataDto, 1);
    int moderateHard = binaryStringToInt(raw8Bits);
    limit.setModerateHardLimit(moderateHard);
  }

  private void setLightModerateLimit(int[] dataDto, ThreeZonesHeartRateLimitsDto limit) {
    String raw8Bits = intToBinaryString(dataDto, 0);
    int lightModerate = binaryStringToInt(raw8Bits);
    limit.setLightModerateLimit(lightModerate);
  }
}
