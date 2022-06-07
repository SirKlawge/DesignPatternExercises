
public class WeatherORama {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		/*The CurrentConditionsDisplay's display() method is called in its update() method, 
		 * so the display is done automatically when the Display gets updated by the 
		 * WeatherData Subject.*/
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 65, 30.4f);
		
	}

}
