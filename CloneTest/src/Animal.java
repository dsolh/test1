
public class Animal implements Cloneable{
	private int animalNumber;
	private String name;
	
	public int getAnimalNumber() {
		return animalNumber;
	}

	public void setAnimalNumber(int animalNumber) {
		this.animalNumber = animalNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	/*
	public String toString() {
		return animalNumber + ":" + name;
	}
	*/
}
