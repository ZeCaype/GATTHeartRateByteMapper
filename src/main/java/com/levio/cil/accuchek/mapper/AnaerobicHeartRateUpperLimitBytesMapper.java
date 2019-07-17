package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.AnaerobicHeartRateUpperLimitDto;

@Component
public class AnaerobicHeartRateUpperLimitBytesMapper {

  public AnaerobicHeartRateUpperLimitBytesMapper() {

  }

  public AnaerobicHeartRateUpperLimitDto mapAnaerobicUpperLimitBytesToReadableData(int[] dataDto) {

    AnaerobicHeartRateUpperLimitDto anaerobicUpper = new AnaerobicHeartRateUpperLimitDto();

    String raw8Bits = intToBinaryString(dataDto, 0);
    int upperLimitValue = binaryStringToInt(raw8Bits);
    anaerobicUpper.setAnaerobicHeartRateUpperLimit(upperLimitValue);

    return anaerobicUpper;
  }

}
