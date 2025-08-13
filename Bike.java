class Bike{

public static void main(String[] args){

int xl=100;
int pulser=200;
int yamaha=150;
int bmw=1000;
int bajaj=125;
int royalEnf=650;

int [] Bikes={xl,pulser,yamaha,bmw,bajaj,royalEnf};
int apache=160;
Bikes[4]=apache;
System.out.println(Bikes[4]);


//int name=0;
for(int name=0;name<Bikes.length;name++){
	System.out.println(Bikes[name]);
}
}
}