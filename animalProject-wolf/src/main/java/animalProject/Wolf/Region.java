package animalProject.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String continent;
	private List<Habitat> habitats = new ArrayList<Habitat>();

	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public List<Habitat> getHabitats() {
		return habitats;
	}
	public void setHabitats(List<Habitat> habitats) {
		this.habitats = habitats;
	}
	
	
	
	
}
