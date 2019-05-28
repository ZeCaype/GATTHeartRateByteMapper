package com.levio.cil.accuchek.mapper;

import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.HeartRateMeasurementDto;

@Component
public class HeartRateMeasurementBytesMapper {

  public HeartRateMeasurementBytesMapper() {

  }

  public HeartRateMeasurementDto mapHeartRateMeasurementBytesToReadableData(int[] dataDto) {
    HeartRateMeasurementDto hrm = new HeartRateMeasurementDto();
    
    hrm.setId("test");

    return hrm;
  }

}
