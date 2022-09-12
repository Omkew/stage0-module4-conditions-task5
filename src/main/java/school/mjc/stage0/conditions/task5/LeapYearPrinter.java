package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
    boolean god = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

    if (god){
        System.out.println("leap");
    }else {
        System.out.println("not leap");
    }
    }
}
