class Swordfish {
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;

	public void viewDetails() {
		price = 3000;
		System.out.println("Swordfish price=" + price);
		name = "Swordfish";
		System.out.println("Swordfish name=" + name);
		isAvailable = true;
		System.out.println("Swordfish is Available=" + isAvailable);
		type = 'W';
		System.out.println("Swordfish type=" + type);
		rating = 9.0f;
		System.out.println("Swordfish ratings=" + rating);
		weight = 6.75;
		System.out.println("Swordfish weight=" + weight + "kg");
		number = 10006l;
		System.out.println("Swordfish number=" + number);
	}
}

