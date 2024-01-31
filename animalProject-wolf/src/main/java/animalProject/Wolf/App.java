package animalProject.Wolf;
public class App {

	public static void main(String[] args) {
		Wolf w = new Wolf();
	
		// Setting wolf habitat
		TypeTundra tundraType = TypeTundra.ARTIC;
		Tundra tundra = new Tundra();
        tundra.setType(tundraType);
        tundra.setClimate("Cold");
        Fauna fauna = new Fauna();
        fauna.setRiver(true);
        fauna.setVegetation("Conifer Florest");
        Region region = new Region();

        region.setContinent("North America");
        region.getHabitats().add(tundra);
        region.getHabitats().add(fauna);
        w.setRegion(region);
        
        System.out.println("Continent: " + region.getContinent());
        System.out.println("Type of Tundra: " + tundra.getType());
        System.out.println("Climate: " + tundra.getClimate());
        System.out.println("Vegetation: " + fauna.getVegetation());
        System.out.println("River: " + fauna.isRiver()+ "\n");
        
        // A wolf cub is born: (CONSTRUCTOR PATTERN)
     	FemaleWolf fm = new FemaleWolf();
     	fm.setGestation(new ArticWolf());
     	WolfCub wc1 = fm.pregnancy();
     	wc1.setGender("Male");
     	wc1.setBicolorFur(true);
     	fm.setGestation(new GreyWolf());
     	WolfCub wc2 = fm.pregnancy();
     	wc2.setGender("Female");
     	wc2.setBicolorFur(false);
     	System.out.println("A wolf cub is born! [ArticWolf Cub]\nFur Color: " 
     	+ wc1.getSpecies().getFurColor() + 
     	"\nWeight(kg): " + wc1.getPhysique().getWeight()+
     	"\nHeight(m): "+ wc1.getPhysique().getHeight()+
     	"\nGender: "+ wc1.getGender()+
     	"\nBicolorFur:"+ wc1.isBicolorFur());
     	System.out.println("\n");     
     	System.out.println("A wolf cub is born! [GreyWolf Cub]\nFur Color: " 
     	+ wc2.getSpecies().getFurColor() + 
     	"\nWeight(kg): " + wc2.getPhysique().getWeight()+
     	"\nHeight(m): "+ wc2.getPhysique().getHeight()+
     	"\nGender: "+ wc2.getGender()+
     	"\nBicolorFur:"+ wc2.isBicolorFur());
     	System.out.println("\n");      	
		
		// Wolf State (STATE PATTERN)
		System.out.println(w.getState());
		w.setStamina(0.6f);
		System.out.println(w.getState());
		System.out.println("\n");
		
		
		// Hunting time!(COMMAND PATTERN)
		Prey p = new Prey();
		WolfPack wp = new WolfPack();
		wp.getCommands().add(new Search(p));
		wp.getCommands().add(new Chase(p));
		wp.getCommands().add(new Eat(p));
		wp.hunt();	

	}

}
