public class Main {
    public static void checkingTheYear(int years) {
        if ((years > 1584 && years % 4 == 0 || years % 400 == 0) && years % 100 != 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void currentYear(int y) {
        if (y >= 2015) {
            System.out.print("Установить обычную версию");

        } else {
            System.out.print("Установить облегчённую версию");
        }
    }

    public static void checkOs(int os) {
        if (os == 0) {
            System.out.println(" для айфона");
        } else if (os == 1) {
            System.out.println(" для смартфона");
        }
    }

    public static int weWillSendItVia(int days) {
        if (days <= 20) {
            System.out.println("1 день");
        } else if (days <= 60) {
            System.out.println("2 дня");

        } else if (days <= 100) {
            System.out.println("3 дня");
        } else {
            System.out.println("Доставки не будет");
        }
        return days;
    }


    public static void main(String[] args) {
        System.out.println("Задание №1");
        int year = 2021;
        checkingTheYear(year);
        System.out.println("Задание №2");

        int clientDeviceYear = 2016;
        int clientOs = 1;
        currentYear(clientDeviceYear);
        checkOs(clientOs);

        System.out.println("Задание №3");
        int deliveryDistance = 95;
        weWillSendItVia(deliveryDistance);


    }


}