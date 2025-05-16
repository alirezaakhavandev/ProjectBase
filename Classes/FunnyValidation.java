package com.application;


import java.util.Scanner;

public class FunnyValidation {
    public static void main(String[] args) {
        boolean isUserAnIdiot = true;
        int countHowIdiot_User_is = 0;
        while (isUserAnIdiot) {
            System.out.print("Enter the day of the week : ");
            try {
                DaysOfTheWeek toDay = DaysOfTheWeek.valueOf(new Scanner(System.in).nextLine().toUpperCase());
                switch (toDay) {
                    case MONDAY,
                         TUESDAY,
                         WEDNESDAY,
                         THURSDAY,
                         FRIDAY -> System.out.println("Go to work!");
                    case SATURDAY, SUNDAY -> System.out.println("Sleep and rest!");

                }
                isUserAnIdiot = false;
            } catch (IllegalArgumentException e) {
                countHowIdiot_User_is++;
                if (countHowIdiot_User_is >= 5){
                    System.out.println(" ====== I think you need to visit a doctor and get a brain scan you idiot! ======");
                    isUserAnIdiot = false;
                }
                else System.out.println("Wrong input | Choose in (MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)");

            }
        }

    }
}

enum DaysOfTheWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

