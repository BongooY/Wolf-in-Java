package animalProject.Wolf;

public class Wolf {
	private String gender;
	private float stamina;
	private WolfState state = new Resting();
	private Physique physique;
	private Species species;
	private Region region;

	public void changeState() {
		state.performState(this);
	}
	public Physique getPhysique() {
		return physique;
	}

	public void setPhysique(Physique physique) {
		this.physique = physique;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getStamina() {
		return stamina;
	}

	public void setStamina(float stamina) {
		this.stamina = stamina;
		changeState();
	}

	public WolfState getState() {
		return state;
	}

	public void setState(WolfState state) {
		this.state = state;
	}

	
	
	
	

}
