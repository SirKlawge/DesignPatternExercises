
public class HeatIndexDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private float heatIndex;

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.heatIndex = this.calculateHeatIndex(temp, humidity);
		display();
	}

	@Override
	public void display() {
		System.out.println("Heat index: " + this.calculateHeatIndex(0, 0));
	}
	
	private float calculateHeatIndex(float temperature, float humidity) {
		return 2.3f;
	}

}
