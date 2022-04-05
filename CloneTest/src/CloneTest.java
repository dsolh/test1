
public class CloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Zoo myZoo = new Zoo(3);
		myZoo.setListOfAnimals(0, 1, "lion");
		myZoo.setListOfAnimals(1, 2, "tiger");
		myZoo.setListOfAnimals(2, 3, "bird");
		
		System.out.println("Original :");
		System.out.println(myZoo);
		
		Zoo myZoo_copy = (Zoo)myZoo.clone();
		
		System.out.println("\nOriginal :");
		System.out.println(myZoo);
		System.out.println("Cloned :");
		System.out.println(myZoo_copy);
		
		/*
		myZoo.setListOfAnimals(1, 2, "hippo");
		
		System.out.println("\nOriginal :");
		System.out.println(myZoo);
		System.out.println("Cloned :");
		System.out.println(myZoo_copy);
		*/
	}
}
