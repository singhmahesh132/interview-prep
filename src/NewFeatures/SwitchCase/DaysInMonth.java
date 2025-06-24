package src.NewFeatures.SwitchCase;

import java.time.Month;
import java.time.Year;

public class DaysInMonth {
    public int getNoOfDays(Month month, int year){
        int noOfDays = 0;
        switch (month){
            case APRIL :
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER: noOfDays = 30;
                            break;
            case FEBRUARY:
                noOfDays = Year.isLeap(year) ? 29 : 28;
                break;

            default: noOfDays = 31;
        }
        return noOfDays;
    }

    //Enhanced Switch
    public int getNoOfDaysV2(Month month, int year){
        return switch (month){
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
            default -> 31;
        };
    }

    //using yield in code block
    public int getNoOfDaysV3(Month month, int year){
        return switch (month){
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> {
                yield Year.isLeap(year) ? 29 : 28;
            }
            default -> 31;
        };
    }

    //exhaustive nature of enhanced switch to cover all cases then default not required
    public int getNoOfDaysV4(Month month, int year){
        return switch (month){
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> {
                yield Year.isLeap(year) ? 29 : 28;
            }
            //default -> 31;
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
        };
    }

    public static void main(String[] args){
        DaysInMonth d = new DaysInMonth();
        System.out.println(d.getNoOfDays(Month.FEBRUARY, 2026));
        System.out.println(d.getNoOfDays(Month.FEBRUARY, 2024));

        System.out.println(d.getNoOfDaysV2(Month.FEBRUARY, 2026));
        System.out.println(d.getNoOfDaysV2(Month.FEBRUARY, 2024));
        System.out.println(d.getNoOfDaysV2(Month.AUGUST, 2026));
        System.out.println(d.getNoOfDaysV2(Month.JUNE, 2024));

        System.out.println(d.getNoOfDaysV3(Month.FEBRUARY, 2026));
        System.out.println(d.getNoOfDaysV3(Month.AUGUST, 2026));
        System.out.println(d.getNoOfDaysV3(Month.JUNE, 2024));

        System.out.println(d.getNoOfDaysV4(Month.DECEMBER, 2026));
        System.out.println(d.getNoOfDaysV4(Month.AUGUST, 2026));
        System.out.println(d.getNoOfDaysV4(Month.JUNE, 2024));
    }
}
