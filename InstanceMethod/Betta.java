class Betta {
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;

	public void displayDetails() {
		price = 300;
		System.out.println("Betta price=" + price);
		name = "Betta";
		System.out.println("Betta name=" + name);
		isAvailable = true;
		System.out.println("Betta is Available=" + isAvailable);
		type = 'B';
		System.out.println("Betta type=" + type);
		rating = 7.9f;
		System.out.println("Betta ratings=" + rating);
		weight = 0.15;
		System.out.println("Betta weight=" + weight + "kg");
		number = 10007l;
		System.out.println("Betta number=" + number);
	}
}

