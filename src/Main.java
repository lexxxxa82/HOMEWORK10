import java.time.LocalDate;
public class Main {
    public static void checkLeapYear(int year) {
        if ((year % 4) == 0 && (year % 400) == 0||(year % 100) == 0 ) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void whichApplicationInstall(int clientOS1, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS1 == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("ошибка");
        }
    }
    public static void deliveryPeriod(int deliveryDistance){
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней 1");
        }else if ( deliveryDistance <=60){
            System.out.println ("Потребуется дней 2");
        }else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней 3");
        } else {
            System.out.println("не достовляется");
        }
    }
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        int checkYear = 2001;
        checkLeapYear(checkYear);

        System.out.println("Задача № 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2006;
        whichApplicationInstall(clientOS1, clientDeviceYear);

        System.out.println("Задача № 3");
        int deliveryDistance = 95;
        deliveryPeriod(deliveryDistance);

    }
}

