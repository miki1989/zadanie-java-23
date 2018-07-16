public class ConverterTest {
    public static void main(String[] args) {

        CalendarConverter calendarConverter = new CalendarConverter();
        //System.out.println(CalendarConverter.convertDayToString(2));

        for(int i = 1; i <= 7; i++){
           String zmienna = CalendarConverter.convertDayToString(i);
            System.out.println(i + " dzień tygodnia to " +zmienna);
        }

    }
}
