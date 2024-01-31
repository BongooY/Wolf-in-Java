package animalProject.Wolf;

public class Eat implements Command {
	private Prey prey;
	public Eat(Prey prey) {
		this.prey = prey;
	}
	public void execute() {
		prey.dead();

	}
	public Prey getPrey() {
		return prey;
	}
	public void setPrey(Prey prey) {
		this.prey = prey;
	}
	

}
