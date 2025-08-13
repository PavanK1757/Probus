class FestivalRunner{

public static void main(String[] args) {
        int festivals =Festival.numberOfFestivals(5);
        String name =Festival.festivalName("Diwali");
        boolean holiday =Festival.isPublicHoliday(true);
        long budget =Festival.festivalBudget(500000);
        double duration =Festival.festivalDuration(3.5);
        float rating =Festival.festivalRating(4.8f);

        System.out.println(festivals);
        System.out.println(name);
        System.out.println(holiday);
        System.out.println(budget);
        System.out.println(duration);
        System.out.println(rating);
    }

}