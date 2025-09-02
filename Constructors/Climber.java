class Climber { 

Climber(){
	System.out.println("Default constructor");
}
Climber(int age){
	System.out.println("age = "+age);
}
Climber(double height,String name){
	System.out.println("Height "+height+"Name "+name);
}
Climber( String name,int age){
	System.out.println("Name"+name+"age"+age);
}
Climber(float weight,double height){
	System.out.println("weight"+weight+"height"+height);
}
Climber(char Group,String batch){
	System.out.println("group"+Group+"batch"+ batch);
}
Climber(boolean Married,int Children){
	System.out.println("Married"+Married+"Children"+Children);
}
Climber(long Mobno,char code ){
	System.out.println("Mobno"+Mobno+"code"+code);
}
}