package lesson12;

public enum DayOfWeek {
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THR"),
    FRIDAY("FRI"),
    SATURDAY("SAT", false),
    SUNDAY("SUN") {
        @Override
        public boolean isWorkday() {
            test();
            return false;
        }

        public void test() {
            System.out.println("test");
        }
    };

    private final String shortName;
    private final boolean workday;

    DayOfWeek(String shortName) {
        this(shortName, true);
    }

    DayOfWeek(String shortName, boolean workday) {
        this.shortName = shortName;
        this.workday = workday;
    }

    public String getShortName() {
        return shortName;
    }

    public boolean isWorkday() {
        return workday;
    }


}
