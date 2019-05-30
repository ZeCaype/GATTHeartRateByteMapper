package com.levio.cil.accuchek.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.levio.cil.accuchek.dtos.AerobicHeartRateLowerLimitDto;
import com.levio.cil.accuchek.dtos.AerobicHeartRateUpperLimitDto;
import com.levio.cil.accuchek.dtos.AnaerobicHeartRateLowerLimitDto;
import com.levio.cil.accuchek.dtos.AnaerobicHeartRateUpperLimitDto;
import com.levio.cil.accuchek.dtos.HeartRateMeasurementDto;
import com.levio.cil.accuchek.mapper.AerobicHeartRateLowerLimitBytesMapper;
import com.levio.cil.accuchek.mapper.AerobicHeartRateUpperLimitBytesMapper;
import com.levio.cil.accuchek.mapper.AnaerobicHeartRateLowerLimitBytesMapper;
import com.levio.cil.accuchek.mapper.AnaerobicHeartRateUpperLimitBytesMapper;
import com.levio.cil.accuchek.mapper.HeartRateMeasurementBytesMapper;

@RestController
@RequestMapping(value = "/hrm")
public class HeartRateMetricsController {

  private HeartRateMeasurementBytesMapper heartRateMeasurementMapper;
  private AerobicHeartRateLowerLimitBytesMapper aerobicHeartRateLowerLimitBytesMapper;
  private AerobicHeartRateUpperLimitBytesMapper aerobicHeartRateUpperLimitBytesMapper;
  private AnaerobicHeartRateLowerLimitBytesMapper anaerobicHeartRateLowerLimitBytesMapper;
  private AnaerobicHeartRateUpperLimitBytesMapper anaerobicHeartRateUpperLimitBytesMapper;

  @Autowired
  public HeartRateMetricsController(
      HeartRateMeasurementBytesMapper heartRateMeasurementBytesMapper,
      AerobicHeartRateLowerLimitBytesMapper aerobicHeartRateLowerLimitBytesMapper,
      AerobicHeartRateUpperLimitBytesMapper aerobicHeartRateUpperLimitBytesMapper,
      AnaerobicHeartRateLowerLimitBytesMapper anaerobicHeartRateLowerLimitBytesMapper,
      AnaerobicHeartRateUpperLimitBytesMapper anaerobicHeartRateUpperLimitBytesMapper) {
    
    this.heartRateMeasurementMapper = heartRateMeasurementBytesMapper;
    this.aerobicHeartRateLowerLimitBytesMapper = aerobicHeartRateLowerLimitBytesMapper;
    this.aerobicHeartRateUpperLimitBytesMapper = aerobicHeartRateUpperLimitBytesMapper;
    this.anaerobicHeartRateLowerLimitBytesMapper = anaerobicHeartRateLowerLimitBytesMapper;
    this.anaerobicHeartRateUpperLimitBytesMapper = anaerobicHeartRateUpperLimitBytesMapper;
  }

  @PostMapping (value = "/heartRate")
  public HeartRateMeasurementDto mapHeartRateMeasurement(@RequestBody int[] dataDto) {
    return heartRateMeasurementMapper.mapHeartRateMeasurementBytesToReadableData(dataDto);
  }
  
  @PostMapping (value = "/aerobicLower")
  public AerobicHeartRateLowerLimitDto mapHeartAerobicLowerLimit(@RequestBody int[] dataDto) {
    return aerobicHeartRateLowerLimitBytesMapper.mapAerobicLowerLimitBytesToReadableData(dataDto);
  }
  
  @PostMapping (value = "/aerobicUpper")
  public AerobicHeartRateUpperLimitDto mapHeartAerobicUpperLimit(@RequestBody int[] dataDto) {
    return aerobicHeartRateUpperLimitBytesMapper.mapAerobicUpperLimitBytesToReadableData(dataDto);
  }
  
  @PostMapping (value = "/anaerobicLower")
  public AnaerobicHeartRateLowerLimitDto mapHeartAnaerobicLowerLimit(@RequestBody int[] dataDto) {
    return anaerobicHeartRateLowerLimitBytesMapper.mapAnaerobicLowerLimitBytesToReadableData(dataDto);
  }
  
  @PostMapping (value = "/anaerobicUpper")
  public AnaerobicHeartRateUpperLimitDto mapHeartAnaerobicUpperLimit(@RequestBody int[] dataDto) {
    return anaerobicHeartRateUpperLimitBytesMapper.mapAnaerobicUpperLimitBytesToReadableData(dataDto);
  }

}
