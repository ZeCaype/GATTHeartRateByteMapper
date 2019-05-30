package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.AerobicHeartRateUpperLimitDto;

@Component
public class AerobicHeartRateUpperLimitBytesMapper {

  public AerobicHeartRateUpperLimitBytesMapper() {

  }

  public AerobicHeartRateUpperLimitDto mapAerobicUpperLimitBytesToReadableData(int[] dataDto) {

    AerobicHeartRateUpperLimitDto aerobicUpper = new AerobicHeartRateUpperLimitDto();

    String raw8Bits = intToBinaryString(dataDto, 0);
    int upperLimitValue = binaryStringToInt(raw8Bits);
    aerobicUpper.setAerobicHeartRateUpperLimit(upperLimitValue);

    return aerobicUpper;
  }

}
