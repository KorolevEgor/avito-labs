package com.egorKorolyov.mai.weather.config;

import com.egorKorolyov.mai.weather.client.WeatherApiClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(clients = {
        WeatherApiClient.class
})
public class AppConfiguration {
}
