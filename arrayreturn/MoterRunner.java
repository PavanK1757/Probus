class MoterRunner{
	
	
	public static void main (String [] args){
		
		String [] names ={"Jp moter","Indus moter","Kirloskar","E moter"};
		String [] moter=Moter.moterName(names);
		for (int name=0;name<moter.length;name++){
			
			System.out.println(moter[name]);
		}

		
		int [] amount ={2000,3000,4000,5000};
		int [] moterPrice=Moter.moterPrice(amount);
		for (int price=0;price<moterPrice.length;price++){
			
			System.out.println(moterPrice[price]);
		}	
		
		
		double [] rotation ={26.800,300.2,408.50,546.90};
		double [] moterRotation=Moter.moterRotation(rotation);
		for (int rotate=0;rotate<moterRotation.length;rotate++){
			
			System.out.println(moterRotation[rotate]);
		}
		
		
		float [] speed ={20.90f,30.80f,40.60f,50.89f};
		float [] moterSpeed=Moter.moterSpeed(speed);
		for (int mSpeed=0;mSpeed<moterSpeed.length;mSpeed++){
			
			System.out.println(moterSpeed[mSpeed]);
		}
		
		
		boolean [] quality ={true,true,true,false};
		boolean [] moterquality=Moter.moterIsGood(quality);
		for (int mQuality=0;mQuality<moterquality.length;mQuality++){
			
			System.out.println(moterquality[mQuality]);
		}
		
		
		char [] symbol ={'M','O','T','E','R'};
		char [] moterLetter=Moter.moterSymbol(symbol);
		for (int mSymbol=0;mSymbol<moterLetter.length;mSymbol++){
			
			System.out.println(moterLetter[mSymbol]);
		}
		
		
		long [] number ={6876636,768374873,438738239,76348029};
		long [] moterNum=Moter.moterNumber(number);
		for (int num=0;num<moterNum.length;num++){
			
			System.out.println(moterNum[num]);
		}
		
		
		
		
		
	}
}