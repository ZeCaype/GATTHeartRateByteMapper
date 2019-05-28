package com.levio.cil.accuchek.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.levio.cil.accuchek.dtos.HeartRateMeasurementDto;
import com.levio.cil.accuchek.mapper.HeartRateMeasurementBytesMapper;

@RestController
@RequestMapping(value = "/hrm")
public class HeartRateMeasurementController {

  private HeartRateMeasurementBytesMapper mapper;

  @Autowired
  public HeartRateMeasurementController(
      HeartRateMeasurementBytesMapper heartRateMeasurementBytesMapper) {
    this.mapper = heartRateMeasurementBytesMapper;
  }

  @PostMapping
  public HeartRateMeasurementDto mapHeartRateMeasurement(@RequestBody int[] dataDto) {

    return mapper.mapHeartRateMeasurementBytesToReadableData(dataDto);
  }

}
