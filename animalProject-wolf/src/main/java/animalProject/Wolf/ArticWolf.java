package animalProject.Wolf;

public class ArticWolf implements Gestation {

	public void defineSpecies(WolfCub wc) {
		wc.setSpecies(new Species());
		wc.getSpecies().setFurColor("White");
	}

	public void definePhysique(WolfCub wc) {
		wc.setPhysique(new Physique());
		wc.getPhysique().setWeight(0.8f);
		wc.getPhysique().setHeight(0.3f);
	}

}
