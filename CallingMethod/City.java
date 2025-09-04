class City {
    public static void main(String[] args) {
        int bangalore = 100;
        int delhi = 200;
        int mumbai = 300;
        int chennai = 400;
        int kolkata = 500;
        int hyderabad = 600;

        int[] Cities = {bangalore, delhi, mumbai, chennai, kolkata, hyderabad};
        int pune = 700;
        Cities[5] = pune;
        System.out.println("Updated City Value: " + Cities[5]);

        for (int city = 0; city < Cities.length; city++) {
            System.out.println(Cities[city]);
        }
    }
}