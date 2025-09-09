class Salmon {
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;

	public void showDetails() {
		price = 1500;
		System.out.println("Salmon price=" + price);
		name = "Salmon";
		System.out.println("Salmon name=" + name);
		isAvailable = true;
		System.out.println("Salmon is Available=" + isAvailable);
		type = 'F';
		System.out.println("Salmon type=" + type);
		rating = 8.9f;
		System.out.println("Salmon ratings=" + rating);
		weight = 3.25;
		System.out.println("Salmon weight=" + weight + "kg");
		number = 10001l;
		System.out.println("Salmon number=" + number);
	}
}

