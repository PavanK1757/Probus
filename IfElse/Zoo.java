class Zoo{
public static int tktPrice(String name,int price){
int snaks=0;
if (name=="Tiger" || price ==20){
	snaks=15;
	System.out.println("you bought snaks rs- "+snaks);
}
else if (name=="Elephant"||price==10){
	snaks=10;
		System.out.println("you bought snaks rs- "+snaks);
	
}
else {
		System.out.println("buy Anything");

}return snaks;
}
}