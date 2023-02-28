package com.egorKorolyov.mai.weather.controller;

import com.egorKorolyov.mai.weather.client.WeatherApiClient;
import com.egorKorolyov.mai.weather.dto.CurrentResponseDto;
import com.egorKorolyov.mai.weather.dto.ForecastResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/")
public class WeatherController {

    private final WeatherApiClient weatherApiClient;

    @Value("${app.weather-api.key}")
    private String apiKey;
    @Value("${app.weather-api.city-name}")
    private String cityName;
    @Value("${app.weather-api.forecast-days-count}")
    private Integer daysCount;

    @GetMapping(value = "/current", produces = MediaType.APPLICATION_JSON_VALUE)
    public CurrentResponseDto current() {
        try {
            return weatherApiClient.current(apiKey, cityName, "no");
        } catch (Exception e) {
            log.warn("При получении текущей погоды возникла исключительная ситуация");
            return null;
        }
    }

    @GetMapping(value = "/forecast", produces = MediaType.APPLICATION_JSON_VALUE)
    public ForecastResponseDto forecast() {
        try {
            return weatherApiClient.forecast(apiKey, cityName, daysCount, "no", "no");
        } catch (Exception e) {
            log.warn("При получении текущей погоды возникла исключительная ситуация");
            return null;
        }
    }

}
