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
public class AstroDto implements Serializable {

    private String sunrise;

    private String sunset;

    private String moonrise;

    private String moonset;

    private String moon_phase;

    private String moon_illumination;

    private Integer is_moon_up;

    private Integer is_sun_up;

}
