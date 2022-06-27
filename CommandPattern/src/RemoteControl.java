
public class RemoteControl {
	Command[][] buttons; //Thre will be 7 rows of buttons.  Two buttons per row
	
	public RemoteControl() {
		//Initialize the button array
		this.buttons = new Command[7][2];
		
		//Set their default functions to NoCommand Commands.
		Command noCommand = new NoCommand();
		for(int i = 0; i < this.buttons.length; i++) {
			for(int j = 0; j < this.buttons[i].length; j++) {
				this.buttons[i][j] = noCommand; 
			}
		}
	}
	
	//Use this to set a single command to a button at a specified row and column
	public void setCommand(int row, int col, Command command) {
		this.buttons[row][col] = command;
	}
	
	//Use this to set both the on and the off commands for the buttons in the same row.
	public void setOnOffCommands(int row, Command onCommand, Command offCommand) {
		this.buttons[row][0] = onCommand;
		this.buttons[row][1] = offCommand;
	}
	
	//Execute when a button is pushed.
	public void buttonWasPushed(int row, int col) {
		this.buttons[row][col].execute();;
	}
	
	public String toString() {
		String result = "";
		
		for(int i = 0; i < this.buttons.length; i++) {
			for(int j = 0; j < this.buttons[i].length; j++) {
				result += "Button at row " + i + " and column " + j + " does " + 
			this.buttons[i][j] + " ";
			}
			result += "\n";
		}
		
		return result;
	}
	
}
