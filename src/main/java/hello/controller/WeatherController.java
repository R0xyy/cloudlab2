package hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import hello.value.weather.OpenWeather;
import hello.value.weather.WeatherResponse;

@RestController
public class WeatherController {
	
	private static final Logger log = LoggerFactory.getLogger(WeatherController.class);
	
//	@GetMapping("/weather")
//	OpenWeather getWeather() {
//		RestTemplate restTemplate = new RestTemplate();
//		return restTemplate.getForObject(
//				"http://api.openweathermap.org/data/2.5/weather?q=Manila,ph&appId=2d31f3144df8d99dcf8b6f53fe73db58"
//					, OpenWeather.class);
//		
//	}
	
//	@GetMapping("/weather")
//	OpenWeather getWeather() {
//		RestTemplate restTemplate = new RestTemplate();
//
//		String city = "Manila";
//		String country = "ph";
//		final String appId = "2d31f3144df8d99dcf8b6f53fe73db58";
//		
//		String url = "https://api.openweathermap.org/data/2.5/weather?q="+city+","+country+"&appId="+appId;
//		log.debug("Fetch url: "+ url);
//		return restTemplate.getForObject(url, OpenWeather.class);
//		
//	}
//	
//	@GetMapping("/weather")
//	OpenWeather getWeather(@RequestParam("city") String city) {
//		RestTemplate restTemplate = new RestTemplate();
//	
//		final String appId = "2d31f3144df8d99dcf8b6f53fe73db58";
//		
//		String url = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appId="+appId;
//		log.debug("Fetch url: "+ url);
//		return restTemplate.getForObject(url,OpenWeather.class);
//		
//	}
//	
//	@GetMapping("/weather")
//	WeatherResponse getWeather(@RequestParam("city1") String city1, @RequestParam("city2") String city2) {
//		RestTemplate restTemplate = new RestTemplate();
//		
//		final String appId = "2d31f3144df8d99dcf8b6f53fe73db58";
//		
//		String url1 = "https://api.openweathermap.org/data/2.5/weather?q="+city1+"&appId="+appId;
//		String url2 = "https://api.openweathermap.org/data/2.5/weather?q="+city2+"&appId="+appId;
//		
//		log.debug("Fetch url1: "+ url1);
//		log.debug("Fetch url2: "+ url2);
//		
//		OpenWeather weather1 = restTemplate.getForObject(url1, OpenWeather.class);
//		OpenWeather weather2 = restTemplate.getForObject(url2, OpenWeather.class);
//
//		WeatherResponse response = new WeatherResponse();
//		response.setFirstCity(weather1.getName());
//		response.setSecondCity(weather2.getName());
//		response.setFirstTemp(weather1.getMain().getTemp()-273.15);
//		response.setSecondTemp(weather2.getMain().getTemp()-273.15);
//		return response;
//		
//	}

}
