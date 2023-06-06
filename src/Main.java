public class Main {
    public static void main(String[] args) {

        int score = 200; // Первоночальный счёт
        int deposit2 = 1350; // Сумма пополнения

        if (deposit2 > 1000) {

            System.out.println("Итоговый счёт при пополнении на 1350 рублей: ");
            System.out.println((deposit2 / 100) + score + deposit2 + " рублей ");
            System.out.println();
            System.out.println("Бонусных рублей при пополнении на 1350 рублей: ");
            System.out.println(deposit2 / 100 + " рублей ");
        }


    }
}
