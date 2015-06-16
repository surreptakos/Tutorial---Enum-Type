public enum Animal {
	// / Cat, dog and mouse are objects of the type Animal
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");

	private String name;

	private Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This animal is called " + name;
	}

}
