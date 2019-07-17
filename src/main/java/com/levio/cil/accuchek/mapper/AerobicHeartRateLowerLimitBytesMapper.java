package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.AerobicHeartRateLowerLimitDto;

@Component
public class AerobicHeartRateLowerLimitBytesMapper {

  public AerobicHeartRateLowerLimitBytesMapper() {

  }

  public AerobicHeartRateLowerLimitDto mapAerobicLowerLimitBytesToReadableData(int[] dataDto) {

    AerobicHeartRateLowerLimitDto aerobicLower = new AerobicHeartRateLowerLimitDto();

    String raw8Bits = intToBinaryString(dataDto, 0);
    int lowerLimitValue = binaryStringToInt(raw8Bits);
    aerobicLower.setAerobicHeartRateLowerLimit(lowerLimitValue);

    return aerobicLower;
  }

}
