import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private List<Observer> observers;
	public float temperature;
	public float humidity;
	public float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
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
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

}
