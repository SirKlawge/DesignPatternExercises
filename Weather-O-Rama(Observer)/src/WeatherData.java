
public class WeatherData {
	
	private int temperature;
	private int humidity;
	private int pressure;
	
	public int getTemperature() {
		return this.temperature;
	}
	
	public int getHumidity() {
		return this.humidity;
	}
	
	public int getPressure() {
		return this.pressure;
	}
	
	/*This method gets called any time the WeatherData obtains new values for any of its
	 * fields.*/
	public void measurementsChanged() {
		
	}
}
