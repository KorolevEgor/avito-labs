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
public class CurrentDto implements Serializable {

    /**
     *         "last_updated_epoch": 1677258000,
     *         "last_updated": "2023-02-24 20:00",
     *         "temp_c": -4.0,
     *         "temp_f": 24.8,
     *         "is_day": 0,
     *         "condition": {
     *             "text": "Light snow",
     *             "icon": "//cdn.weatherapi.com/weather/64x64/night/326.png",
     *             "code": 1213
     *         },
     *         "wind_mph": 9.4,
     *         "wind_kph": 15.1,
     *         "wind_degree": 200,
     *         "wind_dir": "SSW",
     *         "pressure_mb": 1001.0,
     *         "pressure_in": 29.56,
     *         "precip_mm": 0.5,
     *         "precip_in": 0.02,
     *         "humidity": 86,
     *         "cloud": 0,
     *         "feelslike_c": -9.1,
     *         "feelslike_f": 15.7,
     *         "vis_km": 2.6,
     *         "vis_miles": 1.0,
     *         "uv": 1.0,
     *         "gust_mph": 12.5,
     *         "gust_kph": 20.2
     */

    Long last_updated_epoch;

    String last_updated;
//    LocalDateTime last_updated;

    Double temp_c;

    Double temp_f;

    Integer is_day;

    ConditionDto condition;

    Double wind_mph;

    Double wind_kph;

    Integer wind_degree;

    String wind_dir;

    Double pressure_mb;

    Double pressure_in;

    Double precip_mm;

    Double precip_in;

    Integer humidity;

    Integer cloud;

    Double feelslike_c;

    Double feelslike_f;

    Double vis_km;

    Double vis_miles;

    Double uv;

    Double gust_mph;

    Double gust_kph;

}
