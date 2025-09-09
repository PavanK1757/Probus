class Tuna {
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;

	public void displayInfo() {
		price = 2000;
		System.out.println("Tuna price=" + price);
		name = "Tuna";
		System.out.println("Tuna name=" + name);
		isAvailable = false;
		System.out.println("Tuna is Available=" + isAvailable);
		type = 'M';
		System.out.println("Tuna type=" + type);
		rating = 9.1f;
		System.out.println("Tuna ratings=" + rating);
		weight = 4.50;
		System.out.println("Tuna weight=" + weight + "kg");
		number = 10002l;
		System.out.println("Tuna number=" + number);
	}
}

