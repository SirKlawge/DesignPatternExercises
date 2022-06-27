
public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No Command");
	}

	public Receiver getReceiver() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "nothing";
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
