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
import com.levio.cil.accuchek.dtos.FatBurnHeartRateLowerLimitDto;
import com.levio.cil.accuchek.dtos.FatBurnHeartRateUpperLimitDto;
import com.levio.cil.accuchek.dtos.FiveZonesHeartRateLimitsDto;
import com.levio.cil.accuchek.dtos.HeartRateControlPointDto;
import com.levio.cil.accuchek.dtos.HeartRateMaxDto;
import com.levio.cil.accuchek.dtos.HeartRateMeasurementDto;
import com.levio.cil.accuchek.dtos.MaximumRecommendedHeartRate;
import com.levio.cil.accuchek.dtos.RestingHeartRateDto;
import com.levio.cil.accuchek.mapper.AerobicHeartRateLowerLimitBytesMapper;
import com.levio.cil.accuchek.mapper.AerobicHeartRateUpperLimitBytesMapper;
import com.levio.cil.accuchek.mapper.AnaerobicHeartRateLowerLimitBytesMapper;
import com.levio.cil.accuchek.mapper.AnaerobicHeartRateUpperLimitBytesMapper;
import com.levio.cil.accuchek.mapper.FatBurnHeartRateLowerLimitBytesMapper;
import com.levio.cil.accuchek.mapper.FatBurnHeartRateUpperLimitBytesMapper;
import com.levio.cil.accuchek.mapper.FiveZonesHeartRateLimitsMapper;
import com.levio.cil.accuchek.mapper.HeartRateControlPointMapper;
import com.levio.cil.accuchek.mapper.HeartRateMaxBytesMapper;
import com.levio.cil.accuchek.mapper.HeartRateMeasurementBytesMapper;
import com.levio.cil.accuchek.mapper.MaximumRecommendedHeartRateBytesMapper;
import com.levio.cil.accuchek.mapper.RestingHeartRateBytesMapper;

@RestController
@RequestMapping(value = "/hrm")
public class HeartRateMetricsController {

  private HeartRateMeasurementBytesMapper heartRateMeasurementMapper;
  private AerobicHeartRateLowerLimitBytesMapper aerobicHeartRateLowerLimitBytesMapper;
  private AerobicHeartRateUpperLimitBytesMapper aerobicHeartRateUpperLimitBytesMapper;
  private AnaerobicHeartRateLowerLimitBytesMapper anaerobicHeartRateLowerLimitBytesMapper;
  private AnaerobicHeartRateUpperLimitBytesMapper anaerobicHeartRateUpperLimitBytesMapper;
  private FatBurnHeartRateLowerLimitBytesMapper fatBurnHeartRateLowerLimitBytesMapper;
  private FatBurnHeartRateUpperLimitBytesMapper fatBurnHeartRateUpperLimitBytesMapper;
  private FiveZonesHeartRateLimitsMapper fiveZonesHeartRateLimitsMapper;
  private HeartRateControlPointMapper heartRateControlPointMapper;
  private HeartRateMaxBytesMapper heartRateMaxBytesMapper;
  private MaximumRecommendedHeartRateBytesMapper maximumRecommendedHeartRateBytesMapper;
  private RestingHeartRateBytesMapper restingHeartRateBytesMapper;

  @Autowired
  public HeartRateMetricsController(
      HeartRateMeasurementBytesMapper heartRateMeasurementBytesMapper,
      AerobicHeartRateLowerLimitBytesMapper aerobicHeartRateLowerLimitBytesMapper,
      AerobicHeartRateUpperLimitBytesMapper aerobicHeartRateUpperLimitBytesMapper,
      AnaerobicHeartRateLowerLimitBytesMapper anaerobicHeartRateLowerLimitBytesMapper,
      AnaerobicHeartRateUpperLimitBytesMapper anaerobicHeartRateUpperLimitBytesMapper,
      FatBurnHeartRateLowerLimitBytesMapper fatBurnHeartRateLowerLimitBytesMapper,
      FatBurnHeartRateUpperLimitBytesMapper fatBurnHeartRateUpperLimitBytesMapper,
      FiveZonesHeartRateLimitsMapper fiveZonesHeartRateLimitsMapper,
      HeartRateControlPointMapper heartRateControlPointMapper,
      HeartRateMaxBytesMapper heartRateMaxBytesMapper,
      MaximumRecommendedHeartRateBytesMapper maximumRecommendedHeartRateBytesMapper,
      RestingHeartRateBytesMapper restingHeartRateBytesMapper) {
    
    this.heartRateMeasurementMapper = heartRateMeasurementBytesMapper;
    this.aerobicHeartRateLowerLimitBytesMapper = aerobicHeartRateLowerLimitBytesMapper;
    this.aerobicHeartRateUpperLimitBytesMapper = aerobicHeartRateUpperLimitBytesMapper;
    this.anaerobicHeartRateLowerLimitBytesMapper = anaerobicHeartRateLowerLimitBytesMapper;
    this.anaerobicHeartRateUpperLimitBytesMapper = anaerobicHeartRateUpperLimitBytesMapper;
    this.fatBurnHeartRateLowerLimitBytesMapper = fatBurnHeartRateLowerLimitBytesMapper;
    this.fatBurnHeartRateUpperLimitBytesMapper = fatBurnHeartRateUpperLimitBytesMapper;
    this.fiveZonesHeartRateLimitsMapper = fiveZonesHeartRateLimitsMapper;
    this.heartRateControlPointMapper = heartRateControlPointMapper;
    this.heartRateMaxBytesMapper = heartRateMaxBytesMapper;
    this.maximumRecommendedHeartRateBytesMapper = maximumRecommendedHeartRateBytesMapper;
    this.restingHeartRateBytesMapper = restingHeartRateBytesMapper;
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
  
  @PostMapping (value = "/fatBurnLower")
  public FatBurnHeartRateLowerLimitDto mapHeartFatBurnLowerLimit(@RequestBody int[] dataDto) {
    return fatBurnHeartRateLowerLimitBytesMapper.mapFatBurnLowerLimitBytesToReadableData(dataDto);
  }
  
  @PostMapping (value = "/fatBurnUpper")
  public FatBurnHeartRateUpperLimitDto mapHeartFatBurnUpperLimit(@RequestBody int[] dataDto) {
    return fatBurnHeartRateUpperLimitBytesMapper.mapFatBurnUpperLimitBytesToReadableData(dataDto);
  }
  
  @PostMapping (value = "/fiveZones")
  public FiveZonesHeartRateLimitsDto mapFiveZonesHeartRateLimits(@RequestBody int[] dataDto) {
    return fiveZonesHeartRateLimitsMapper.mapFiveZonesHeartRateLimitsBytesToReadableData(dataDto);
  }
  
  @PostMapping (value = "/heartRateControlPoint")
  public HeartRateControlPointDto mapHeartRateControlPoint(@RequestBody int[] dataDto) {
    return heartRateControlPointMapper.mapArrayOfBytesToReadableObject(dataDto);
  }
  
  @PostMapping (value = "/heartRateMax")
  public HeartRateMaxDto mapHeartRateMax(@RequestBody int[] dataDto) {
    return heartRateMaxBytesMapper.mapArrayOfBytesToReadableObject(dataDto);
  }
  
  @PostMapping (value = "/maximumRecommendedHeartRate")
  public MaximumRecommendedHeartRate mapHeartRateMaxRecommended(@RequestBody int[] dataDto) {
    return maximumRecommendedHeartRateBytesMapper.mapArrayOfBytesToReadableObject(dataDto);
  }
  
  @PostMapping (value = "/restingHeartRate")
  public RestingHeartRateDto mapRestingHeartRate(@RequestBody int[] dataDto) {
    return restingHeartRateBytesMapper.mapRestingHeartRateBytesToReadableData(dataDto);
  }

}
