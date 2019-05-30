package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.AnaerobicHeartRateLowerLimitDto;

@Component
public class AnaerobicHeartRateLowerLimitBytesMapper {

  public AnaerobicHeartRateLowerLimitBytesMapper() {

  }

  public AnaerobicHeartRateLowerLimitDto mapAnaerobicLowerLimitBytesToReadableData(int[] dataDto) {

    AnaerobicHeartRateLowerLimitDto anaerobicLower = new AnaerobicHeartRateLowerLimitDto();

    String raw8Bits = intToBinaryString(dataDto, 0);
    int lowerLimitValue = binaryStringToInt(raw8Bits);
    anaerobicLower.setAnaerobicHeartRateLowerLimit(lowerLimitValue);

    return anaerobicLower;
  }

}
