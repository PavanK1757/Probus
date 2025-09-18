class Song {
    public String title;
    public double duration;
    public Singer singer;

    public Song(String title, double duration, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.singer = singer;
    }

    public void songDetails() {
        System.out.println("Song: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Singer: " + singer.name);
        System.out.println("Experience: " + singer.experience + " years");
    }
}