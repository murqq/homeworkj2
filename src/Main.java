public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для стоимости билета и количества рублей для одной бонусной мили
        double ticketCost = 13676;
        double milesPerRub = 20;

        // Рассчитываем количество бонусных миль, используя значения переменных
        int bonusMiles = (int) (ticketCost / milesPerRub);

        // Выводим результат на экран
        System.out.println(" За билет стоимостью " + ticketCost + " рублей начислено " + bonusMiles + " миль ");
    }
}

