package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.FatBurnHeartRateLowerLimitDto;

@Component
public class FatBurnHeartRateLowerLimitBytesMapper {

  public FatBurnHeartRateLowerLimitBytesMapper() {

  }

  public FatBurnHeartRateLowerLimitDto mapFatBurnLowerLimitBytesToReadableData(int[] dataDto) {

    FatBurnHeartRateLowerLimitDto fatBurnLower = new FatBurnHeartRateLowerLimitDto();

    String raw8Bits = intToBinaryString(dataDto, 0);
    int lowerLimitValue = binaryStringToInt(raw8Bits);
    fatBurnLower.setFatBurnHeartRateLowerLimit(lowerLimitValue);

    return fatBurnLower;
  }

}
