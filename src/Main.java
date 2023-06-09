public class Main {
    public static void main(String[] args) {

        int score = 100; // Первоночальный счёт
        int deposit = 1350; // Сумма пополнения

        int bonus = deposit > 1000 ? deposit / 100 : 0;

        int finalScore = score + deposit + bonus;

        System.out.println("Итоговый счёт при пополнении на 1350 рублей: ");
        System.out.println(finalScore);

        System.out.println("Бонусных рублей при пополнении на 1350 рублей: ");
        System.out.println(bonus);


    }
}
