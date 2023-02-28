package com.egorKorolyov.mai.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ForecastDayDto implements Serializable {

    String date;

    Long date_epoch;

    DayDto day;

    AstroDto astro;

    List<HourDto> hour;

}
