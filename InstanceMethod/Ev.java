class Ev{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void showDetails(){
	price = 2500000;
	System.out.println("Ev price=" + price);
	name = "Electric Vehicle";
	System.out.println("Ev name=" + name);
	isAvailable = true;
	System.out.println("Ev is Available=" + isAvailable);
	type = 'E';
	System.out.println("Ev type=" + type);
	rating = 9.5f;
	System.out.println("Ev ratings=" + rating);
	weight = 2200.60;
	System.out.println("Ev weight=" + weight + "kg");
	number = 1122334455l;
	System.out.println("Ev number=" + number);
}

}


