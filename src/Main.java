public class Main {
    public static void main(String[] args) {

        int score = 200; // Первоночальный счёт
        int deposit1 = 300; // Сумма первого пополнение
        int deposit2 = 1350; // Сумма вторго пополнения

        if (deposit1 < 1000) {
            System.out.println("Итоговый счёт при полнении на 300 рублей: ");
            System.out.println(score + deposit1 + " рублей ");
            System.out.println("Итоговый счёт при пополнении на 1350 рублей: ");
            System.out.println((deposit2 / 100) + score + deposit2 + " рублей ");
            System.out.println("Бонусных рублей при пополнении на 1350 рублей: ");
            System.out.println(deposit2 / 100 + " рублей ");}





    }
}
