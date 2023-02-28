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
public class ConditionDto implements Serializable {

    /**
     * "text": "Light snow",
     * "icon": "//cdn.weatherapi.com/weather/64x64/night/326.png",
     * "code": 1213
     */

    String text;

    String icon;

    Integer code;

}
