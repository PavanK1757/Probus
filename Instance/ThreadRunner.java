class ThreadRunner {
    public static void main(String[] args) {

        Thread typeThread = new Thread();
        typeThread.threadType();

        Thread speedThread = new Thread();
        speedThread.threadSpeed();

        Thread lengthThread = new Thread();
        lengthThread.threadLength();

        Thread thicknessThread = new Thread();
        thicknessThread.threadThickness();

        Thread gradeThread = new Thread();
        gradeThread.threadGrade();
    }
}
