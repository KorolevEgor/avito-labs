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
public class DayDto implements Serializable {

    private Double maxtemp_c;

    private Double maxtemp_f;

    private Double mintemp_c;

    private Double mintemp_f;

    private Double avgtemp_c;

    private Double avgtemp_f;

    private Double maxwind_mph;

    private Double maxwind_kph;

    private Double totalprecip_mm;

    private Double totalprecip_in;

    private Double totalsnow_cm;

    private Double avgvis_km;

    private Double avgvis_miles;

    private Double avghumidity;

    private Integer daily_will_it_rain;

    private Integer daily_chance_of_rain;

    private Integer daily_will_it_snow;

    private Integer daily_chance_of_snow;

    private ConditionDto condition;

    private Double uv;

}
