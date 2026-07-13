package program.Example;

import java.time.LocalDate;

public class CurrentDayMonth {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        int day = currentDate.getDayOfWeek().getValue();
        int month = currentDate.getMonthValue();

        switch (day) {
            case 1:
                System.out.println("Current Day: Monday");
                break;
            case 2:
                System.out.println("Current Day: Tuesday");
                break;
            case 3:
                System.out.println("Current Day: Wednesday");
                break;
            case 4:
                System.out.println("Current Day: Thursday");
                break;
            case 5:
                System.out.println("Current Day: Friday");
                break;
            case 6:
                System.out.println("Current Day: Saturday");
                break;
            case 7:
                System.out.println("Current Day: Sunday");
                break;
        }

        switch (month) {
            case 1:
                System.out.println("Current Month: January");
                break;
            case 2:
                System.out.println("Current Month: February");
                break;
            case 3:
                System.out.println("Current Month: March");
                break;
            case 4:
                System.out.println("Current Month: April");
                break;
            case 5:
                System.out.println("Current Month: May");
                break;
            case 6:
                System.out.println("Current Month: June");
                break;
            case 7:
                System.out.println("Current Month: July");
                break;
            case 8:
                System.out.println("Current Month: August");
                break;
            case 9:
                System.out.println("Current Month: September");
                break;
            case 10:
                System.out.println("Current Month: October");
                break;
            case 11:
                System.out.println("Current Month: November");
                break;
            case 12:
                System.out.println("Current Month: December");
                break;
        }
    }
}