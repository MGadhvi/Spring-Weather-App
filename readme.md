# Spring Weather App 🌦️

The **Spring Weather App** is a simple Java-based application built with the Spring Boot framework. It provides weather information for a given location by interacting with the [Open Weather API](https://openweathermap.org/api)

---

## Features

- 🌍 **Search by City or Coordinates**: Fetch current weather details by entering a city name or geographic coordinates.
- 🌡️ **Real-Time Data**: Fetches up-to-date weather conditions such as temperature, humidity, wind speed, and more.
- 📊 **Detailed Output**: Displays weather data in a user-friendly format.

---

## Prerequisites

Before you start, ensure you have the following installed:

- **Java 21** or higher
- **Maven** 3.6 or higher
- A weather API key (e.g., from [OpenWeatherMap](https://openweathermap.org/))

---

## Getting Started

1. **Clone the Repository**:
 ```bash
   git clone https://github.com/your-username/spring-weather-app.git
   cd spring-weather-app
```

2. **Configure API Key**:

- Open src/main/resources/application.properties.
- Add your weather API key:

```properties
spring.application.name=spring-weather-app
openweather.api.key=YOUR-API-KEY
openweather.api.url=https://api.openweathermap.org/data/2.5/weather
```

3. **Build and Run the Application**
```bash
mvn clean install
mvn spring-boot:run 
```

Once you have done this, navigate your browser to `http://localhost:8080/` to view the welcome page. From here you can enter a city and view its weather!
