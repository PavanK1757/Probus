class StudentRunner {
    public static void main(String[] args) {
        String[] names = {"Pavan", "Kumar", "Rahul", "Sneha"};
        String[] studentList = Student.studentNames(names);
        for (int nameIndex = 0; nameIndex < studentList.length; nameIndex++) {
            System.out.println(studentList[nameIndex]);
        }

        int[] ages = {20, 21, 22, 23};
        int[] studentAges = Student.studentAges(ages);
        for (int ageIndex = 0; ageIndex < studentAges.length; ageIndex++) {
            System.out.println(studentAges[ageIndex]);
        }

        double[] marks = {85.5, 90.0, 78.5, 92.0};
        double[] studentMarks = Student.studentMarks(marks);
        for (int markIndex = 0; markIndex < studentMarks.length; markIndex++) {
            System.out.println(studentMarks[markIndex]);
        }

        float[] attendance = {85.0f, 90.5f, 75.0f, 95.0f};
        float[] studentAttendance = Student.studentAttendance(attendance);
        for (int attendanceIndex = 0; attendanceIndex < studentAttendance.length; attendanceIndex++) {
            System.out.println(studentAttendance[attendanceIndex]);
        }

        boolean[] isHosteller = {true, false, true, false};
        boolean[] studentHosteller = Student.studentIsHosteller(isHosteller);
        for (int hostellerIndex = 0; hostellerIndex < studentHosteller.length; hostellerIndex++) {
            System.out.println(studentHosteller[hostellerIndex]);
        }

        char[] grades = {'A', 'B', 'A', 'A'};
        char[] studentGrades = Student.studentGrades(grades);
        for (int gradeIndex = 0; gradeIndex < studentGrades.length; gradeIndex++) {
            System.out.println(studentGrades[gradeIndex]);
        }

        long[] rollNumbers = {201L, 202L, 203L, 204L};
        long[] studentRollNumbers = Student.studentRollNumbers(rollNumbers);
        for (int rollIndex = 0; rollIndex < studentRollNumbers.length; rollIndex++) {
            System.out.println(studentRollNumbers[rollIndex]);
        }
    }
}
