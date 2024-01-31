package animalProject.Wolf;

public class Prey {
	private String size;
	
	public void hide() {
		System.out.println("Wolves are searching...");
	}
	public void run() {
		System.out.println("Wolves are chasing the prey!");
	}
	public void dead() {
		System.out.println("Wolves are eating...");
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
