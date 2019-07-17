package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.MaximumRecommendedHeartRate;

@Component
public class MaximumRecommendedHeartRateBytesMapper {

  public MaximumRecommendedHeartRateBytesMapper() {
    
  }
  
  public MaximumRecommendedHeartRate mapArrayOfBytesToReadableObject(int[] dataDto) {
    MaximumRecommendedHeartRate heartRate = new MaximumRecommendedHeartRate();
    String raw8Bits = intToBinaryString(dataDto, 0);
    int heartRateMaxValue = binaryStringToInt(raw8Bits);
    heartRate.setMaximumRecommendedHeartRate(heartRateMaxValue);
    
    return heartRate;
  }
}