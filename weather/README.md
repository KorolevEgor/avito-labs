## Домашняя работа по курсу "Архитектура информационных систем"
### Сервис погоды

Получение текущей погоды: GET http://localhost:8090/v1/current
Получение прогноза: GET http://localhost:8090/v1/forecast

Был использован внешний сервис по прогнозированию погоды: [https://www.weatherapi.com/](https://www.weatherapi.com/)

Переменные окружения:
- WEATHER_API_KEY - апи-ключ для сервиса погоды
- WEATHER_API_CITY_NAME - название города для получения погоды
- WEATHER_API_FORECAST_DAYS_COUNT - количество дней прогноза
