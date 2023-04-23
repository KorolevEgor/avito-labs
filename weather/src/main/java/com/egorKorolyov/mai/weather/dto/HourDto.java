package com.egorKorolyov.mai.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HourDto implements Serializable {

    private Long time_epoch;

    private String time;

    private Double temp_c;

    private Double temp_f;

    private Integer is_day;

    private ConditionDto condition;

    private Double wind_mph;

    private Double wind_kph;

    private Integer wind_degree;

    private String wind_dir;

    private Double pressure_mb;

    private Double pressure_in;

    private Double precip_mm;

    private Double precip_in;

    private Integer humidity;

    private Integer cloud;

    private Double feelslike_c;

    private Double feelslike_f;

    private Double windchill_c;

    private Double windchill_f;

    private Double heatindex_c;

    private Double heatindex_f;

    private Double dewpoint_c;

    private Double dewpoint_f;

    private Integer will_it_rain;

    private Integer chance_of_rain;

    private Integer will_it_snow;

    private Integer chance_of_snow;

    private Double vis_km;

    private Double vis_miles;

    private Double gust_mph;

    private Double gust_kph;

    private Double uv;

}
