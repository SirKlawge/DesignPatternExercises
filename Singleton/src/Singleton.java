
public class Singleton {
	private Singleton instance;
	
	private Singleton() {
		
	}
	
	public synchronized Singleton getInstance() {
		if(this.instance == null) {
			this.instance = new Singleton();
		}
		
		return this.instance;
	}
}
