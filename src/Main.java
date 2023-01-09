import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
       printIsLeapYear(2024);
        recommendApplicationVersion(0,2022);
        calculateDeliveryDays(80);
    }

    // Задача №1

        /* Реализуйте метод, который получает в качестве параметра год, проверяет,
        является ли он високосным, и выводит результат в консоль.

        Эту проверку вы уже реализовывали в задании по условным операторам.
        Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
        Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
        «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
         */

   private static void printIsLeapYear(int year) {
       System.out.println("Задача №1");

       if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
           System.out.println(year + " - високосный ");
       } else {
           System.out.println(year + " - невисокосный");
       }
   }

        // Задача №2

        /* Напишите метод, куда подаются два параметра: тип операционной системы
        (0 — iOS, 1 — Android ) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить облегченную версию.
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную — ввести в переменную числовое значение.
        В результате программа должна выводить в консоль сообщение, какую версию
        приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
         */

        public static void recommendApplicationVersion(int clientOS, int deviceYear) {
            System.out.println("Задача №2");

            boolean deviceIsOld = isDeviceOld(deviceYear);
            System.out.print("Установите ");
            if (deviceIsOld) {
                System.out.print("облегченную ");
            }
            System.out.print("версию для ");
            if (clientOS == 0) {
                System.out.println("IOS");
            } else {
                System.out.println("Android");
            }
        }

    private static boolean isDeviceOld(int deviceYear) {
             int currentYear = LocalDate.now().getYear();
             return  deviceYear <= currentYear;
    }

    // Задача №3

        /* Ваша задача — доработать код, а именно написать метод, который на вход принимает
           дистанцию и возвращает итоговое количество дней доставки.

            Правила доставки такие:

            Доставка в пределах 20 км занимает сутки.
            Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
            Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
            Свыше 100 км доставки нет.
            */
        private static void calculateDeliveryDays(int deliveryDistance) {

            System.out.println("Задача №3");
            int deliveryDays = 1;
            if (deliveryDays > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDays++;
            } else if (deliveryDistance > 100) {
                System.out.println("Невозможно рассчитать срок доставки");
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }
}
