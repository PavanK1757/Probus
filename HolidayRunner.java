class HolidayRunner{

public static void main(String[] args) {
        int holidays =Holiday.numberOfHolidays(10);
        String name =Holiday.holidayName("Summer Break");
        boolean national =Holiday.isNationalHoliday(false);
        long cost =Holiday.holidayCost(15000);
        double duration =Holiday.holidayDuration(7.0);
        float rating =Holiday.holidayRating(4.2f);

        System.out.println(holidays);
        System.out.println(name);
        System.out.println(national);
        System.out.println(cost);
        System.out.println(duration);
        System.out.println(rating);
    }
}