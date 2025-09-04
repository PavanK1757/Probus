class VegetableRunner{
public static void main(String[]args){
       int vegetables=Vegetable.numberOfVegetables( 20);
	   char Category=Vegetable.vegetableCategory('L');
	   boolean areThere=Vegetable.areThere(true);
	   long price=Vegetable.vegetablePrice(24);
	   double coast=Vegetable.VegitableCoast(14.6);
	   String name=Vegetable.nameOfVegetable("Cabbage");
	   float ratings=Vegetable.vegitableRatings(3.5f);
	   
	   System.out.println(vegetables);
	   System.out.println(Category);
	   System.out.println(areThere);
	   System.out.println(price);
	   System.out.println(coast);
	   System.out.println(name);
	   System.out.println(ratings);
	   
	
}
}