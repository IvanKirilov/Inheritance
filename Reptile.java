package OOP;

public class Reptile extends Animal {
private int waterPerWeek;

public Reptile(String name, int yearBorn, int waterPerWeek) {
	super(name, yearBorn);
	this.setWaterPerWeek(waterPerWeek);
}

public int getWaterPerWeek() {
	return waterPerWeek;
}

public void setWaterPerWeek(int waterPerWeek) {
	this.waterPerWeek = waterPerWeek;
	if(waterPerWeek<0){
		this.setWaterPerWeek(0);
	}
}

}
