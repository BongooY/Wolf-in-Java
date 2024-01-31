package animalProject.Wolf;

public class FemaleWolf {
	private Gestation gestation;
	
	public WolfCub pregnancy() {
		WolfCub wc = null;
		if(gestation != null) {
			wc = new WolfCub();
			gestation.defineSpecies(wc);
			gestation.definePhysique(wc);
		}
		return wc;
	}

	public Gestation getGestation() {
		return gestation;
	}

	public void setGestation(Gestation gestation) {
		this.gestation = gestation;
	}

}
