
public class Zoo implements Cloneable{
	private Animal[] listOfAnimals;
	private int size;
	
	public Zoo(int size) {
		this.size = size;
		listOfAnimals = new Animal[size];
		
		for(int i = 0; i < size; i++) {
			listOfAnimals[i] = new Animal();
		}
	}
	
	public Object clone() throws CloneNotSupportedException {
		Zoo cloneZoo = (Zoo)super.clone();
		
		//cloneZoo.listOfAnimals = (Animal[])listOfAnimals.clone();
		
		for(int i = 0; i < size; i++) {
			cloneZoo.listOfAnimals[i] = (Animal)listOfAnimals[i].clone();
		}
		
		return cloneZoo;
	}
	
	public Animal[] getListOfAnimals() {
		return listOfAnimals;
	}

	public void setListOfAnimals(int index, int animalNumber, String name) {
		listOfAnimals[index].setAnimalNumber(animalNumber);
		listOfAnimals[index].setName(name);
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		String result = "{ ";
		for(int i = 0; i < size; i++) {
			result += listOfAnimals[i].toString();
			if(i < size - 1) result += ", ";
		}
		result += " }";
		return result;
	}
}
