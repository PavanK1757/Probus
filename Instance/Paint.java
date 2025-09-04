class Paint{
public String color="Red";
public int price;
public double viscocity;
public float density;
public long batch;
public boolean dark;
public char word;

 
 public   String paint(){
	 
	 System.out.println(color);
	 color="Blue";
	 System.out.println(color);
	 
return color;

 }
 public   int amount(){
	 
	 System.out.println(price);
	 price=25;
	 System.out.println(price);
	 
return price;
 
 }
  public   double visco(){
	 
	 System.out.println(viscocity);
	 viscocity=3.5;
	 System.out.println(viscocity);
	 
return viscocity;
  }
  
  public   float drowingPoint(){
	 
	 System.out.println(density);
	 density=67.9f;
	 System.out.println(density);
	 
return density;
  }
  
  public   char code(){
	 
	 System.out.println(word);
	 word='D';
	 System.out.println(word);
	 
return word;
  }
}