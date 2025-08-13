 class AdvertisementRunner{
 
    public static void main(String[] args) {
        int ads =Advertisement.numberOfAds(15);
        String title = Advertisement.adTitle("Super Sale");
        boolean popular =Advertisement.isPopular(true);
        long cost =Advertisement.adCost(200000);
        double duration =Advertisement.adDuration(30.5);
        float rating =Advertisement.adRating(4.6f);

        System.out.println(ads);
        System.out.println(title);
        System.out.println(popular);
        System.out.println(cost);
        System.out.println(duration);
        System.out.println(rating);
    }
	}
	