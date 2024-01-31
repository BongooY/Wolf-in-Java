package animalProject.Wolf;

public class Chase implements Command {
	private Prey prey;
	public Chase(Prey prey) {
		this.prey = prey;
	}
	public void execute() {
		prey.run();

	}
	public Prey getPrey() {
		return prey;
	}
	public void setPrey(Prey prey) {
		this.prey = prey;
	}
	

}
