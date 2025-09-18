class SongRunner {
    public static void main(String[] args) {
        Singer singer = new Singer("Arijit Singh", 15);
        Song song = new Song("Tum Hi Ho", 4.5, singer);
        song.songDetails();
    }
}