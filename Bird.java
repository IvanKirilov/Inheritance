package OOP;

public class Bird extends Animal {
	private boolean hasBeak;

	public Bird(String name, int yearBorn, boolean hasBeak) {
		super(name, yearBorn);
		this.setHasBeak(isHasBeak());
	}

	public boolean isHasBeak() {
		return hasBeak;
	}

	public void setHasBeak(boolean hasBeak) {
		this.hasBeak = true;
	}
	

}
