class Game {
    public static void main(String[] args) {
        int cricket = 11;
        int football = 22;
        int hockey = 16;
        int kabaddi = 7;
        int tennis = 2;
        int badminton = 2;

        int[] Games = {cricket, football, hockey, kabaddi, tennis, badminton};
        int volleyball = 12;
        Games[2] = volleyball;
        System.out.println("Updated Game Value: " + Games[2]);

        for (int game = 0; game < Games.length; game++) {
            System.out.println(Games[game]);
        }
    }
}
