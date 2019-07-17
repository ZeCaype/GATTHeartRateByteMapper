package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.TwoZonesHeartRateLimitDto;

@Component
public class TwoZonesHeartRateLimitsBytesMapper {
  
  public TwoZonesHeartRateLimitsBytesMapper() {
    
  }
  
  public TwoZonesHeartRateLimitDto mapArrayOfBytesToReadableData(int[] dataDto) {
    TwoZonesHeartRateLimitDto heartRate = new TwoZonesHeartRateLimitDto();
    String raw8Bits = intToBinaryString(dataDto, 0);
    int fatBurnFitnessLimitValue = binaryStringToInt(raw8Bits);
    heartRate.setFatBurnFitnessLimit(fatBurnFitnessLimitValue);
    
    return heartRate;
  }
}
