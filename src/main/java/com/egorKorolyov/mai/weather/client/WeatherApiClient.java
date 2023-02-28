package com.egorKorolyov.mai.weather.client;

import com.egorKorolyov.mai.weather.dto.CurrentResponseDto;
import com.egorKorolyov.mai.weather.dto.ForecastResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "weatherapi.com", url = "http://api.weatherapi.com/v1/")
public interface WeatherApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/current.json",
                    consumes = "application/json")
    CurrentResponseDto current(@RequestParam("key") String apiKey,
                               @RequestParam("q") String cityName,
                               @RequestParam(value = "aqi", defaultValue = "no") String getAirQualityData);

    @RequestMapping(method = RequestMethod.GET, value = "/forecast.json",
            consumes = "application/json")
    ForecastResponseDto forecast(@RequestParam("key") String apiKey,
                                     @RequestParam("q") String cityName,
                                     @RequestParam("days") Integer daysCount,
                                     @RequestParam(value = "aqi", defaultValue = "no") String getAirQualityData,
                                     @RequestParam(value = "alerts", defaultValue = "no") String getWeatherAlertData);

}
