package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.FiveZonesHeartRateLimitsDto;

@Component
public class FiveZonesHeartRateLimitsMapper {

  public FiveZonesHeartRateLimitsMapper() {

  }

  public FiveZonesHeartRateLimitsDto mapFiveZonesHeartRateLimitsBytesToReadableData(int[] dataDto) {

    FiveZonesHeartRateLimitsDto mappedZones = new FiveZonesHeartRateLimitsDto();

    mappedZones.setVeryLightLimit(binaryStringToInt(intToBinaryString(dataDto, 0)));
    mappedZones.setLightLimit(binaryStringToInt(intToBinaryString(dataDto, 1)));
    mappedZones.setModerateLimit(binaryStringToInt(intToBinaryString(dataDto, 2)));
    mappedZones.setHardLimit(binaryStringToInt(intToBinaryString(dataDto, 3)));

    return mappedZones;
  }

}
