package animalProject.Wolf;

public class Search implements Command {
	private Prey prey;
	
	public Search(Prey prey) {
		this.prey = prey;
	}
	public void execute() {
		prey.hide();
	}
	public Prey getPrey() {
		return prey;
	}
	public void setPrey(Prey prey) {
		this.prey = prey;
	}
	

}
