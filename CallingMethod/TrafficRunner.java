class TrafficRunner{
public static void main(String[] args) {
        int vehicles =Traffic.numberOfVehicles(10000);
        String type =Traffic.trafficType("Rush Hour");
        boolean heavy =Traffic.isHeavy(true);
        long delay =Traffic.averageDelay(45);
        double km =Traffic.roadLength(12.5);
        float rating =Traffic.trafficRating(2.9f);

        System.out.println(vehicles);
        System.out.println(type);
        System.out.println(heavy);
        System.out.println(delay);
        System.out.println(km);
        System.out.println(rating);
    }
}