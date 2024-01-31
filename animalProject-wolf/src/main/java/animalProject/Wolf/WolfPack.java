package animalProject.Wolf;

import java.util.ArrayList;
import java.util.List;

public class WolfPack {
	List<Command> commands = new ArrayList<Command>();
	public void hunt() {
		for(Command c : commands) {
			c.execute();
		}
	}
	public List<Command> getCommands() {
		return commands;
	}
	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}
	
	
}
