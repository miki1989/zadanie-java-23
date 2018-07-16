public class CalendarConverter {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber){
        switch (dayNumber){
            case CalendarConverter.MONDAY:
                return "Poniedziałek";
                //break;
            case CalendarConverter.TUESDAY:
                return "Wtorek";
                //break;
            case CalendarConverter.WEDNESDAY:
                return "Środa";
                //break;
            case CalendarConverter.THURSDAY:
                return "Czwartek";
                //break;
            case CalendarConverter.FRIDAY:
                return "Piątek";
                //break;
            case CalendarConverter.SATURDAY:
                return "Sobota";
                //break;
            case CalendarConverter.SUNDAY:
                return "Niedziela";
                //break;
            default:
                return "Błąd";
        }
    }
}
