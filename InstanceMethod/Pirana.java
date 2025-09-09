class Pirana{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price = 5000;
	System.out.println("Pirana price=" + price);
	name = "Pirana";
	System.out.println("Pirana name=" + name);
	isAvailable = true;
	System.out.println("Pirana is Available=" + isAvailable);
	type = 'F';
	System.out.println("Pirana type=" + type);
	rating = 7.8f;
	System.out.println("Pirana ratings=" + rating);
	weight = 1.25;
	System.out.println("Pirana weight=" + weight + "kg");
	number = 1234567890l;
	System.out.println("Pirana number=" + number);
}

}


