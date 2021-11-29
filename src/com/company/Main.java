package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2(); //было интересно решить тремя способами
//        task2v2();
//        task2v3();
//        task3();
        task4();
//        task5();
    }

    public static void checkLeapYearAndPrintResult(int year) {
        boolean isYearLeap = year % 4 == 0;
        if (year % 100 == 0) {
            isYearLeap = false;
        }
        if (year % 400 == 0) {
            isYearLeap = true;
        }
        if (isYearLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        int year = 2001;
        checkLeapYearAndPrintResult(year);
    }

    public static boolean[] checkVersionOfApplication(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean[] arr = new boolean[2];
        arr[0] = currentYear - clientDeviceYear >= 1;
        arr[1] = clientOS == 0;
        return arr;
    }

    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2021;
        boolean[] arr = checkVersionOfApplication(clientOS, clientDeviceYear);
        System.out.print("Установите ");
        if (arr[0]) {
            System.out.print("облегчённую ");
        }
        System.out.print("версию мобильного приложения для ");
        if (arr[1]) {
            System.out.print("iOS по ссылке");
        } else {
            System.out.print("Android по ссылке");
        }
    }

    public static String checkVersionOfApplicationAndPrintResult(int clientOS, int clientDeviceYear, boolean isNeedPrint) {
        int currentYear = LocalDate.now().getYear();
        String result;
        if (clientOS == 0 && currentYear - clientDeviceYear == 0) {
            result = "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 0) {
            result = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (currentYear - clientDeviceYear != 0) {
            result = "Установите облегченную версию приложения для Android по ссылке";
        } else {
            result = "Установите версию мобильного приложения для Android по ссылке";
        }
        if (isNeedPrint) {
            System.out.println(result);
        }
        return result;
    }

    public static void task2v2() {
        int clientOS = 1;
        int clientDeviceYear = 2021;
        checkVersionOfApplicationAndPrintResult(clientOS, clientDeviceYear, true);
    }

    public static void task2v3() {
        int clientOS = 0;
        int clientDeviceYear = 2021;
        System.out.println(checkVersionOfApplicationAndPrintResult(clientOS, clientDeviceYear, false));
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int daysDelivery = 0;
        if (deliveryDistance <= 20) {
            daysDelivery = 1;
        } else if (deliveryDistance <= 60) {
            daysDelivery += 1;
        } else if (deliveryDistance <= 100) {
            daysDelivery += 2;
        }
        return daysDelivery;
    }

    public static void task3() {
        int deliveryDistance = 95;
        int daysDelivery = calculateDeliveryDays(deliveryDistance);
        if (daysDelivery != 0) {
            System.out.println("Потребуется дней: " + daysDelivery);
        } else {
            System.out.println("Вынуждены принести свои извинения, но доставка далее чем на 100 км не работает.");
        }
    }

    public static void checkDoubles (String alp) {
        char[] alpArray = alp.toCharArray();
        for (int i = 0; i < alpArray.length - 1; i++) {
            if (alpArray[i] == alpArray[i + 1]) {
                System.out.println("В строке присутствует дублирующийся символ - \"" + alpArray[i] + "\".");
                return;
            }
        }
            System.out.println("В строке не обнаружено дублирующихся символов.");

    }
    public static void task4() {
        String alp = "aabccddefgghiijjkk";
//        String alp = "abcde";
        checkDoubles(alp);
    }

    static public void reversingArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void task5() {
        int[] arr = {3, 2, 1, 6, 5};
        reversingArray(arr);
        for (int j : arr) {
            System.out.print(j);
        }

    }
}

