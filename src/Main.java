public class Main {

    public static void main(String[] args) {
        int current = 100; // текущий счет
        int amount = 10_100; // сумма пополнения

        int bonusRuble;
        if (amount > 1000) {
            bonusRuble = amount / 100; //количество бонусов, при пополнении больше, чем на 1000 руб
        } else {
            bonusRuble = 0; //количество бонусов при пополнении меньше, чем на 1000 руб или равно этой сумме
        }
        int finalAmount = current + amount + bonusRuble;

        System.out.println("Количество бонусных рублей: " + bonusRuble); // количество добавленных бонусных рублей
        System.out.println("Итоговый счет: " + finalAmount); // конечный счет клиента

    }
}