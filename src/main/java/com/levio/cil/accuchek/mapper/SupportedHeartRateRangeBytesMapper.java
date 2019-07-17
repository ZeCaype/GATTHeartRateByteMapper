package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.SupportedHeartRateRangeDto;

@Component
public class SupportedHeartRateRangeBytesMapper {

  public SupportedHeartRateRangeBytesMapper() {

  }

  public SupportedHeartRateRangeDto mapArrayOfBytesToReadableData(int[] dataDto) {

    SupportedHeartRateRangeDto heartRateRange = new SupportedHeartRateRangeDto();

    setMinimumRate(dataDto, heartRateRange);
    setMaximumRate(dataDto, heartRateRange);
    setMinimumIncrement(dataDto, heartRateRange);

    return heartRateRange;
  }

  private void setMinimumRate(int[] dataDto, SupportedHeartRateRangeDto heartRateRange) {
    String raw8Bits = intToBinaryString(dataDto, 0);
    int minRate = binaryStringToInt(raw8Bits);
    heartRateRange.setMinimumHeartRate(minRate);
  }

  private void setMaximumRate(int[] dataDto, SupportedHeartRateRangeDto heartRateRange) {
    String raw8Bits;
    raw8Bits = intToBinaryString(dataDto, 1);
    int maxRate = binaryStringToInt(raw8Bits);
    heartRateRange.setMaximumHeartRate(maxRate);
  }

  private void setMinimumIncrement(int[] dataDto, SupportedHeartRateRangeDto heartRateRange) {
    String raw8Bits;
    raw8Bits = intToBinaryString(dataDto, 2);
    int minIncrement = binaryStringToInt(raw8Bits);
    heartRateRange.setMinimumIncrement(minIncrement);
  }
}
