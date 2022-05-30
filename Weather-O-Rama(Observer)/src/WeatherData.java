
public class WeatherData {
	
	/*Let's pretend that these getters grab the most recent data from the weather station*/
	public float getTemperature() {
		return 87.2f;
	}
	
	public float getHumidity() {
		return 3.1f;
	}
	
	public float getPressure() {
		return 0.3f;
	}
	
	/*This method gets called any time the WeatherData obtains new values for any of its
	 * fields.*/
	public void measurementsChanged() {
		
	}
}
