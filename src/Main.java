public class Main {
    public static void main(String[] args) {

        //Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        //Задача 2
        int clientDeviceYear = 2013;
        int clientOS2 = 1;
        if (clientOS2 == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS2 == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Задача 3
        int year = 2024;
        if ((year % 4 == 0) && year % 100 != 0)
        {
            System.out.println(year + " год високосный");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            System.out.println(year + " год високосный.");
        }
        else
        {
            System.out.println(year + " год невисокосный.");
        }

        //Задача 4
        int deliveryDistance = 100;
        int distance = 1;
        if (deliveryDistance > 20){
            distance++;
        } if (deliveryDistance > 60) {
            distance++;
        }
        System.out.println("Потребуется дней: " + distance);

        //Задача 5
        int monthNumber = 2;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - это зима");
                break;
            case 2:
                System.out.println("Ферваль - это зима");
                break;
            case 3:
                System.out.println("Март - это весна");
                break;
            case 4:
                System.out.println("Апрель - это весна");
                break;
            case 5:
                System.out.println("Май - это весна");
                break;
            case 6:
                System.out.println("Июнь - это лето");
                break;
            case 7:
                System.out.println("Июль - это лето");
                break;
            case 8:
                System.out.println("Август - это лето");
                break;
            case 9:
                System.out.println("Сентябрь - это осень");
                break;
            case 10:
                System.out.println("Октябрь - это осень");
                break;
            case 11:
                System.out.println("Ноябрь - это осень");
                break;
            case 12:
                System.out.println("Декабрь - это зима");
                break;
        }
    }
}