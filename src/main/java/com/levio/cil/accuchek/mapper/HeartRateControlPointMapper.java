package com.levio.cil.accuchek.mapper;

import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.HeartRateControlPointDto;

@Component
public class HeartRateControlPointMapper {

  public HeartRateControlPointMapper() {

  }

  public HeartRateControlPointDto mapArrayOfBytesToReadableObject(int[] dataDto) {
    HeartRateControlPointDto heartRate = new HeartRateControlPointDto();

    if (dataDto[0] == 1) {
      heartRate.setResetEnergyExpended(true);
    } else {
      heartRate.setResetEnergyExpended(false);
    }

    return heartRate;
  }
}
