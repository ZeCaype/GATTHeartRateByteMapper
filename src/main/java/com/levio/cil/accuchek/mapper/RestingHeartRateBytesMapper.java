package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.RestingHeartRateDto;

@Component
public class RestingHeartRateBytesMapper {

  public RestingHeartRateBytesMapper() {

  }

  public RestingHeartRateDto mapRestingHeartRateBytesToReadableData(int[] dataDto) {

    RestingHeartRateDto heartRate = new RestingHeartRateDto();

    String raw8Bits = intToBinaryString(dataDto, 0);
    int heartRateValue = binaryStringToInt(raw8Bits);
    heartRate.setRestingHeartRate(heartRateValue);

    return heartRate;
  }

}
