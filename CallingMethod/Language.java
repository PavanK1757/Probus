class Language {
    public static void main(String[] args) {
        int english = 1;
        int hindi = 2;
        int kannada = 3;
        int telugu = 4;
        int tamil = 5;
        int marathi = 6;

        int[] Languages = {english, hindi, kannada, telugu, tamil, marathi};
        int french = 7;
        Languages[1] = french;
        System.out.println("Updated Language Value: " + Languages[1]);

        for (int lang = 0; lang < Languages.length; lang++) {
            System.out.println(Languages[lang]);
        }
    }
}