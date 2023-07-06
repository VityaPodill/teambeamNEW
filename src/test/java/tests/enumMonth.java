package tests;

import java.util.Locale;

public enum enumMonth {
    JANUARY("Січеня", 1),
    FEBRUARY("Лютого", 2),
    MARCH("Березеня", 3),
    APRIL("Квітня", 4),
    MAY("Травня", 5),
    JUNE("Червня", 6),
    JULY("Липня", 7),
    AUGUST("Серпня", 8),
    SEPTEMBER("Вересня", 9),
    OCTOBER("Жовтня", 10),
    NOVEMBER("Листопада", 11),
    DECEMBER("Грудня", 12);

    private String ukrainianName;
    private int number;

    enumMonth(String ukrainianName, int number) {
        this.ukrainianName = ukrainianName;
        this.number = number;
    }

    public String getString() {
        return ukrainianName;
    }

    public int getNumber() {
        return number;
    }

    public static enumMonth monthByString(String ukrainianName) {
        for (enumMonth month : values()) {
            if (month.ukrainianName.equalsIgnoreCase(ukrainianName)) {
                return month;
            }
        }
        throw new IllegalArgumentException("Invalid Ukrainian month name: " + ukrainianName);
    }
}
