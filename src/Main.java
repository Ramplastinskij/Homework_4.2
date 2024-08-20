public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_4.2");
        System.out.println();
        //Task 1
        System.out.println("Задача 1.");
        double savings = 0;
        int months = 0;
        while (savings < 2459000) {
            savings += 15000;
            savings *= 1.01;
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
        int population = 12000000;
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
        double initialDeposit = 15000;
        double monthlyPercent = 0.07;
        double target = 12000000;
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
        double savingsPerMonth = 15000;
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
        double initialAmount = 15000.0;
        double monthlyInterestRate = 0.07;
        int years = 9;
        double amount = initialAmount;
        int period = 1;
        System.out.println("Начальная сумма: " + amount);
        while (period <= 2 * years) {
            amount *= (1 + monthlyInterestRate);
            if (period % 2 == 0) {
                System.out.println("Сумма накоплений через " + (period / 2) + " полгода: " + amount);
            }
            period++;
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
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int cometYear = 0;
        int year1 = startYear;
        System.out.println("Годы, когда проходила комета за последние 200 лет:");
            do {
                    if ((year1 - cometYear) % 79 == 0) {
                        System.out.println(year1);
                    }
                    year1++;
                } while (year1 <= currentYear);
                cometYear = year1 - 1 + (79 - (year1 - 1) % 79);
                System.out.println("Следующий год появления кометы: " + cometYear);
            }
        }


