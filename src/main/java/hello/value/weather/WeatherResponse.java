package hello.value.weather;

public class WeatherResponse {
	
	String firstCity;
	String secondCity;
	double firstTemp;
	double secondTemp;
	
	public WeatherResponse(String firstCity, String secondCity, double firstTemp, double secondTemp) {
		super();
		this.firstCity = firstCity;
		this.secondCity = secondCity;
		this.firstTemp = firstTemp;
		this.secondTemp = secondTemp;
	}

	public WeatherResponse() {
		
	}

	public String getFirstCity() {
		return firstCity;
	}

	public void setFirstCity(String firstCity) {
		this.firstCity = firstCity;
	}

	public String getSecondCity() {
		return secondCity;
	}

	public void setSecondCity(String secondCity) {
		this.secondCity = secondCity;
	}

	public double getFirstTemp() {
		return firstTemp;
	}

	public void setFirstTemp(double firstTemp) {
		this.firstTemp = firstTemp;
	}

	public double getSecondTemp() {
		return secondTemp;
	}

	public void setSecondTemp(double secondTemp) {
		this.secondTemp = secondTemp;
	}

	
}
