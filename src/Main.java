public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы часть 2, задача 1");
        int cash = 15000;//введите сумму в рублях//
        int total = 0;
        int mount = 1;
        while (total <= 2_459_000) {
            total = total + cash;
            mount = mount + 1;
            System.out.println("Месяц " + mount + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Циклы часть 2, задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(" " + number + " ");
        }
        {
            System.out.println();
        }
        for (number = 10; number >= 1; number = number - 1) {
            System.out.print(" " + number + " ");
        }
        {
            System.out.println();
        }
        System.out.println("Циклы часть 2, задача 3");
        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int mortalPer1000 = 8;
        int year1 = 1;
        for (int year = year1; year <= 10; year++) {
            population = population + ((population / 1000) * birthRatePer1000) - ((population / 1000) * mortalPer1000);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Циклы часть 2, задача 4");
        int deposit = 15_000;
        double interestOnTheDeposit = 0.07;
        int totalMoney = 12_000_000;
        int mount1 = 0;
        while (deposit <= totalMoney) {
            deposit += deposit * interestOnTheDeposit;
            mount1 = mount1 + 1;
            System.out.println("Месяц " + mount1 + " накопления " + deposit);
        }
        System.out.println("Циклы часть 2, задача 5");
        int deposit1 = 15_000;
        double interestOnTheDeposit1 = 0.07;
        int totalMoney1 = 12_000_000;
        int mount2 = 1;
        int totalMount2 = 99;
        while (mount2 <= totalMount2) {
            deposit1 += deposit1 * interestOnTheDeposit1;
            mount2++;

            if (mount2 % 6 == 0) {
                System.out.println("Месяц " + mount2 + " , сумма накоплений: " + deposit1);
            }

        }
        System.out.println("Циклы часть 2, задача 6");
        int deposit2 = 15_000;
        double interestOnTheDeposit2 = 0.07;
        int totalMoney2 = 12_000_000;
        int mount3 = 1;
        int totalMount3 = 9 * 12;//колличество месяцев в 9 годах
        while (mount3 <= totalMount3) {
            deposit2 += deposit2 * interestOnTheDeposit2;
            mount3++;

            if (mount3 % 6 == 0) {
                System.out.println("Месяц " + mount3 + ", сумма накоплений: " + deposit2);
            }

        }
        System.out.println("Циклы часть 2, задача 7");
        int totalDays = 31;
        for (int friday = 1; friday <= totalDays; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + " число, пора делать отчет");
        }

        System.out.println("Циклы часть 2, задача 8");
        int yearlastFlight = 2024 - 200;
        int yearfutureFlight = 2024 + 100;
        for (int year = yearlastFlight; year <yearfutureFlight; year++ ){
            if (year % 79 == 0){
                System.out.println(year);}
        }





    }


}


