class HometownRunner{
    public static void main(String[] args) {
        int places =Hometown.numberOfPlaces(8);
        String name =Hometown.townName("Bangalore");
        boolean famous =Hometown.isFamous(true);
        long people =Hometown.population(13000000);
        double size =Hometown.areaSize(709.0);
        float rating =Hometown.townRating(4.5f);

        System.out.println(places);
        System.out.println(name);
        System.out.println(famous);
        System.out.println(people);
        System.out.println(size);
        System.out.println(rating);
   }
}