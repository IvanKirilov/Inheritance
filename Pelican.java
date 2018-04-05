package OOP;

public class Pelican extends Bird {
	private int beakLength;

	public Pelican(String name, int yearBorn, boolean hasBeak, int beakLength) {
		super(name, yearBorn, hasBeak);
		this.setBeakLength(beakLength);
	}

	public int getBeakLength() {
		return beakLength;
	}

	public void setBeakLength(int beakLength) {
		this.beakLength = beakLength;
		if(beakLength<0){
			this.setBeakLength(0);
			System.out.println("The beak length must be a positive digit!");
		}
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb
		.append("The pelican's name is ")
		.append(this.getName())
		.append("It was born in ")
		.append(this.getYearBorn())
		.append(this.isHasBeak())
		.append("It's beak is ")
		.append(this.getBeakLength());
		return sb.toString();
	}
	

}
