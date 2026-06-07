public class Ex10 {
    public static final void main(String args[]) {
        int a = 0;
        switch(a) {
            default: System.out.println("default");
            break;
            case 1: System.out.println(1);
            case 2: System.out.println(2);
            case 3: System.out.println(3);
        }
    }
}

enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    private DayOfWeek getWeekDay(int day) {
        int otherDay = day;
        final int Sunday = 0;
        final int thursday = 3;
        switch(otherDay) {
            default: //
            // case 1: continue;
            case thursday: return DayOfWeek.THURSDAY; //
            case 2, 10: break;
            case Sunday: return DayOfWeek.SUNDAY; //
            case 5: return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
}

// E