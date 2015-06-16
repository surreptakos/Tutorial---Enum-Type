public class App {

	/*
	 * public static final int DOG = 0; public static final int CAT = 1; public
	 * static final int MOUSE = 2;
	 */

	public static void main(String[] args) {

		/*
		 * Problems with this implementation: -animal is only supposed to be one
		 * of 3 values, but we can easily break that functionality by assigning
		 * it any other value
		 * 
		 * -you can't tell from the assignment below what you're actually
		 * assigning to animal. You need to look above at the declarations.
		 */

		/*
		 * Enum (short for enumerator/enumerate) is a special type to represent
		 * fixed sets with set values
		 */

		/*
		 * int animal = CAT;
		 * 
		 * switch(animal) { case DOG: System.out.println("Dog"); break; case
		 * CAT: System.out.println("Cat"); break;
		 * 
		 * }
		 */

		// ******** Correct Implementation ***********//

		Animal animal = Animal.CAT;

		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			break;
		default:
			break;
		}
		System.out.println(Animal.DOG);
		System.out.println("Enum name as a string: " + Animal.DOG.name());

		System.out.println(Animal.DOG.getClass());

		System.out.println(Animal.DOG instanceof Animal);
		System.out.println(Animal.DOG instanceof Enum);

		System.out.println(Animal.MOUSE.getName());

		// finds the right enum (bc enum constants are not actually Strings,
		// they are objects
		Animal animal2 = Animal.valueOf("CAT");

		System.out.println(animal2);

	}

}
