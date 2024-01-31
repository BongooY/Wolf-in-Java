package animalProject.Wolf;

public class Resting implements WolfState {

	public void performState(Wolf w) {
		if(w.getStamina() >= 0.5) {
			w.setState(new Hunting());
			System.out.println("Wolf is hunting...");
		}

	}

}
