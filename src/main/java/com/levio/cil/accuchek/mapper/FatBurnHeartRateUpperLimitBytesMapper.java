package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.FatBurnHeartRateUpperLimitDto;

@Component
public class FatBurnHeartRateUpperLimitBytesMapper {

  public FatBurnHeartRateUpperLimitBytesMapper() {

  }

  public FatBurnHeartRateUpperLimitDto mapFatBurnUpperLimitBytesToReadableData(int[] dataDto) {

    FatBurnHeartRateUpperLimitDto fatBurnUpper = new FatBurnHeartRateUpperLimitDto();

    String raw8Bits = intToBinaryString(dataDto, 0);
    int UpperLimitValue = binaryStringToInt(raw8Bits);
    fatBurnUpper.setFatBurnHeartRateUpperLimit(UpperLimitValue);

    return fatBurnUpper;
  }

}