public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_4.2");
        System.out.println();
        //Task 1
        System.out.println("Задача 1.");
        int savings = 0;
        int monthlySavings = 15_000;
        int targetAmount = 2_459_000;
        int months = 0;
        while (savings < targetAmount) {
            savings += monthlySavings;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();
        //Task 2
        System.out.println("Задача 2.");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println();
        //Task 3
        System.out.println("Задача 3.");
        int population = 12_000_000;
        double birthRate = 17.0 / 1000;
        double deathRate = 8.0 / 1000;
        int year = 1;
        while (year <= 10) {
            int births = (int) (population * birthRate);
            int deaths = (int) (population * deathRate);
            population = population + births - deaths;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }
        System.out.println();
        //Task 4
        System.out.println("Задача 4.");
        double initialDeposit = 15_000;
        double monthlyPercent = 0.07;
        double target = 12_000_000;
        double currentAmount = initialDeposit;
        int monthAmount = 0;

        while (currentAmount < target) {
            currentAmount += currentAmount * monthlyPercent;
            monthAmount++;
            System.out.printf("Месяц %d: %.2f рублей\n", monthAmount, currentAmount);
        }
        System.out.printf("Василию понадобится %d месяцев, чтобы собрать %.2f рублей\n", monthAmount, target);

        System.out.println();
        //Task 5
        System.out.println("Задача 5.");
        int totalMonths = 24;
        double savingsPerMonth = 15_000;
        double totalSavings = 0;
        int month = 1;
        do {
            totalSavings += savingsPerMonth;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ": накопления = " + totalSavings);
            }
            month++;
        } while (month <= totalMonths);
        System.out.println();
        //Task 6
        System.out.println("Задача 6.");
        double initialAmount = 15_000;
        double monthlyInterestRate = 0.07;
        int monthTotal = 9 * 12;
        int monthsInterval = 6;
        double totalAmount = initialAmount;
        int monthsPassed = 0;
        System.out.println("Сумма накоплений каждые полгода:");
        while (monthsPassed < monthTotal) {
            for (int i = 1; i <= monthsInterval; i++) {
                totalAmount += totalAmount * (monthlyInterestRate / 100);
                monthsPassed++;
            }
            System.out.printf("После %d месяцев: %.2f рублей\n", monthsPassed, totalAmount);
        }

        System.out.println();
        //Task 7
        System.out.println("Задача 7.");
        int firstFriday = 5;
        int daysInMonth = 31;
        int currentFriday = firstFriday;
        while (currentFriday <= daysInMonth) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет.");
            currentFriday += 7;
        }
        System.out.println();
        //Task 8
        System.out.println("Задача 8.");
        int cometPeriod = 79;
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometYear = 0;
        do {
            if (cometYear >= startYear && cometYear <= currentYear) {
                System.out.println("Комета появилась в году: " + cometYear);
            }
            cometYear += cometPeriod;
        } while (cometYear <= currentYear);
        while (cometYear <= endYear) {
            System.out.println("Следующий год появления кометы: " + cometYear);
            cometYear += cometPeriod;
        }
    }
}