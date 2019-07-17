package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.HeartRateMaxDto;

@Component
public class HeartRateMaxBytesMapper {

  public HeartRateMaxBytesMapper() {
    
  }
  
  public HeartRateMaxDto mapArrayOfBytesToReadableObject(int[] dataDto) {
    HeartRateMaxDto heartRate = new HeartRateMaxDto();
    String raw8Bits = intToBinaryString(dataDto, 0);
    int heartRateMaxValue = binaryStringToInt(raw8Bits);
    heartRate.setHeartRateMax(heartRateMaxValue);
    
    return heartRate;
  }
}
