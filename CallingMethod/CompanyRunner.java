class CompanyRunner{
public static void main (String[]args){
	
        String [] Cnames={"Nvidia","Google","Amazon","Flipkart"};//
        Company.companies(Cnames);




        int[] nums = {10, 20, 30, 40, 50};
        Company.numbers(nums);
    
	
        double[] priceList = {10.5, 20.75, 30.99, 45.6};
        Company.prices(priceList);
    
	
        char[] letters = {'A', 'B', 'C', 'D'};
        Company.alphabets(letters);
    	
	
        boolean[] states = {true, false, true, false};
        Company.status(states);
    	
	
        long[] pops = {1000000L, 2000000L, 3000000L};
        Company.population(pops);
    


        float[] ratings = {4.5f, 3.8f, 5.0f, 4.2f};
        Company.ratings(ratings);
    

        short[] codes = {100, 200, 300, 400};
        Company.codes(codes);
    

        byte[] signals = {1, 2, 3, 4};
        Company.signals(signals);
    
	
        String[] names = {"Alice", "Bob", "Charlie"};
        //int[] ages = {20, 22, 19};
        Company.students(names);
    	
	
	
	
	
}	
	
}