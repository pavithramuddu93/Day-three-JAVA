package com.bridgelabz.employeewage;

import java.util.Random;

public class Day3UC4 {
    public static void main(String[] args) {

        final int empWagePerHour = 20;
        final int fullTimeHours = 8;
        final int partTimeHours = 4;

        Random r = new Random();
        int attendance = r.nextInt(3);
        System.out.println("\nRandom value is: " + attendance);

        switch (attendance) {
            case 1:
                System.out.println("\nEmployee is Present Full time");
                int ft_dailyWage = empWagePerHour * fullTimeHours;
                System.out.println("wage for the day is " + ft_dailyWage);
                break;
            case 2:
                System.out.println("\nEmployee is Present Part time");
                int pt_dailyWage = empWagePerHour * partTimeHours;
                System.out.println("wage for the day is " + pt_dailyWage);
                break;
            default:
                System.out.println("\nEmployee is Absent");
        }
    }
}