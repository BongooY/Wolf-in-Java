package animalProject.Wolf;

public class GreyWolf implements Gestation {

	public void defineSpecies(WolfCub wc) {
		wc.setSpecies(new Species());
		wc.getSpecies().setFurColor("Grey");
	}

	public void definePhysique(WolfCub wc) {
		wc.setPhysique(new Physique());
		wc.getPhysique().setWeight(0.5f);
		wc.getPhysique().setHeight(0.23f);
	}
}
