class Jeep{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price = 1200000;
	System.out.println("Jeep price=" + price);
	name = "Jeep";
	System.out.println("Jeep name=" + name);
	isAvailable = true;
	System.out.println("Jeep is Available=" + isAvailable);
	type = 'S';
	System.out.println("Jeep type=" + type);
	rating = 9.2f;
	System.out.println("Jeep ratings=" + rating);
	weight = 1800.75;
	System.out.println("Jeep weight=" + weight + "kg");
	number = 9876543210l;
	System.out.println("Jeep number=" + number);
}

}


