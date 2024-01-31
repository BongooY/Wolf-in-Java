package animalProject.Wolf;

public class Hunting implements WolfState {

	public void performState(Wolf w) {
		if(w.getStamina() < 0.5) {
			w.setState(new Resting());
			System.out.println("Wolf is resting...");
		}

	}

}
