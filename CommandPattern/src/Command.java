
public interface Command {
		
	/*This is the command interface.  In the diner example, this would be called orderUp().*/
	public void execute();
	
	public void undo();
}
