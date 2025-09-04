class Country {
    public static void main(String[] args) {
        int india = 1400;
        int usa = 330;
        int china = 1440;
        int japan = 125;
        int germany = 83;
        int brazil = 210;

        int[] Countries = {india, usa, china, japan, germany, brazil};
        int canada = 38;
        Countries[4] = canada;
        System.out.println("Updated Country Value: " + Countries[4]);

        for (int country = 0; country < Countries.length; country++) {
            System.out.println(Countries[country]);
        }
    }
}