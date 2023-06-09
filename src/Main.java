public class Main {
    public static void main(String[] args) {

        int score = 200; // Первоночальный счёт
        int deposit = 1350; // Сумма пополнения

        System.out.println("Итоговый счёт при пополнении на 1350 рублей: ");
        System.out.println((deposit / 100) + score + deposit + " рублей ");
        System.out.println();
        System.out.println("Бонусных рублей при пополнении на 1350 рублей: ");
        System.out.println(deposit / 100 + " рублей ");


    }
}
