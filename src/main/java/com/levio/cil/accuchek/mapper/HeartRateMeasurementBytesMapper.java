package com.levio.cil.accuchek.mapper;

import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryCharToBoolean;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.binaryStringToInt;
import static com.levio.cil.accuchek.rest.utils.ByteUtils.intToBinaryString;
import org.springframework.stereotype.Component;
import com.levio.cil.accuchek.dtos.HeartRateMeasurementDto;
import com.levio.cil.accuchek.dtos.HeartRateMeasurementFlagsDto;

@Component
public class HeartRateMeasurementBytesMapper {

  public HeartRateMeasurementBytesMapper() {

  }

  public HeartRateMeasurementDto mapHeartRateMeasurementBytesToReadableData(int[] dataDto) {
    HeartRateMeasurementDto hrm = new HeartRateMeasurementDto();

    HeartRateMeasurementFlagsDto flags = new HeartRateMeasurementFlagsDto();
    setFlagsFromRawData(dataDto, flags);

    hrm.setFlags(flags);
    return hrm;
  }

  private void setFlagsFromRawData(int[] dataDto, HeartRateMeasurementFlagsDto flags) {
    String rawFlagsBits = intToBinaryString(dataDto, 0);
    rawFlagsBits = new StringBuilder(rawFlagsBits).reverse().toString();
    int bitCount = 0;
    String sensorContactStatusBits = "";

    for (char bit : rawFlagsBits.toCharArray()) {
      switch (bitCount) {
        case 0:
          flags.setHeartRateValueFormat16Bits(binaryCharToBoolean(bit));
          break;
        case 1:
          sensorContactStatusBits += bit;
          break;
        case 2:
          sensorContactStatusBits += bit;
          setSensorStatusBitsFromTwoBits(flags, sensorContactStatusBits);
          break;
        case 3:
          flags.setEnergyExpendedStatusPresent(binaryCharToBoolean(bit));
          break;
        case 4:
          flags.setRRIntervalValuePresent(binaryCharToBoolean(bit));
          break;
        default:
          break;
      }
      bitCount++;
    }
  }

  private void setSensorStatusBitsFromTwoBits(HeartRateMeasurementFlagsDto flags,
      String sensorContactStatusBits) {
    switch (binaryStringToInt(sensorContactStatusBits)) {
      case 0:
        flags.setSensorContactStatusBit(
            "Sensor Contact feature is not supported in the current connection");
        break;
      case 1:
        flags.setSensorContactStatusBit(
            "Sensor Contact feature is not supported in the current connection");
        break;
      case 2:
        flags.setSensorContactStatusBit(
            "Sensor Contact feature is supported, but contact is not detected");
        break;
      case 3:
        flags.setSensorContactStatusBit(
            "Sensor Contact feature is supported and contact is detected");
        break;
    }
  }

}
