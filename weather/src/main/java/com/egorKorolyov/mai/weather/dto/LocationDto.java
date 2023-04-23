package com.egorKorolyov.mai.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocationDto implements Serializable {

    /**
     *         "name": "Moscow",
     *         "region": "Moscow City",
     *         "country": "Russia",
     *         "lat": 55.75,
     *         "lon": 37.62,
     *         "tz_id": "Europe/Moscow",
     *         "localtime_epoch": 1677258322,
     *         "localtime": "2023-02-24 20:05"
     */

    String name;

    String region;

    String country;

    Double lat;

    Double lon;

    String tz_id;

    Long localtime_epoch;

    String localtime;
//    LocalDateTime localtime;

}
