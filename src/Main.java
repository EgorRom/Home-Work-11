public class Main {
    public static void checkingTheYear(int years) {
        if ((years > 1584 && years % 4 == 0 || years % 400 == 0) && years % 100 != 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void currentYear(int y, int c) {
        if (y >= 2015 && c == 0) {
            System.out.println("Установить обычную версию для айфона");

        } else if (y >= 2015 && c == 1) {
            System.out.println("Установить обычную версию для смартфона");
        } else if (y < 2015 && c == 0) {
            System.out.println("Установить облегчённую версию для айфона");
        } else if (y < 2015 && c == 1) {
            System.out.println("Установить облегчённую версию для смартфона");
        } else {
            System.out.println("К сожалению у нас нет приложения на ваше устройство");
        }
    }

    public static void checkOs(int os) {
        if (os == 0) {
            System.out.println(" для айфона");
        } else if (os == 1) {
            System.out.println(" для смартфона");
        }
    }

    public static void weWillSendItVia(int days) {
        if (days <= 20) {
            System.out.println("1 день");
        } else if (days <= 60) {
            System.out.println("2 дня");

        } else if (days <= 100) {
            System.out.println("3 дня");
        } else {
            System.out.println("Доставки не будет");
        }
    }


    public static void main(String[] args) {
        System.out.println("Задание №1");
        int year = 2021;
        checkingTheYear(year);
        System.out.println("Задание №2");

        int clientDeviceYear = 2011;
        int clientOs = 1;
        currentYear(clientDeviceYear, clientOs);

        System.out.println("Задание №3");
        int deliveryDistance = 95;
        int days = 0;

        weWillSendItVia(deliveryDistance);


    }


}