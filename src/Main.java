public class Main {
    public static void main(String[] args) {
        // ДЗ-8 Циклы. Урок 2
        // Урок 1 Задание 1
        int i = 1;
        int salary = 200000;
        int bank = 0;
        while (bank < 2459000) {
            bank = bank + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей " +
                    "с тем количеством месяцев, необходимым для накопления данной суммы!");
            i++;
        }
        // Урок 1 Задание 2
        int iM = 1;
        while (iM < 11) {
            System.out.print(iM + " ");
            iM++;
        }
        System.out.println();
        iM = 10;
        while (iM > 0) {
            System.out.print(iM + " ");
            iM--;
        }
        System.out.println();

        // Урок 1 Задание 3
        int population = 12000000;
        double death = (double) 17 / 1000;
        double birth = (double) 8 / 1000;
        int years = 2009;
        while (years < 2020) {
            population = (int) (population + (population * death) - (population * birth));
            years++;
            System.out.println("Год " + years + ",численность населения составляет " + population);
        }
        // Урок 2 Задание 1,2
        int vasya = 15000;
        int vasyaBank = 1;
        int iN = 1;
        while (vasyaBank < 12_000_000) {
            vasyaBank += vasyaBank / 7;
            vasyaBank = vasya + vasyaBank;
            if (iN % 6 == 0) {  // Урок 2 Задание 2
                System.out.println("Месяц " + iN + ", сумма накоплений равна " + vasyaBank + " рублей!");
            }
            iN++;
        } // Урок 2 Задание 3
        int iW = 1;
        int total = 0;
        while (iW < 9 * 12) {
            total = total + total / 100 * 7;
            total = total + vasya;
            if (iW % 6 == 0) {
                System.out.println("Месяц " + iW + ", сумма накоплений равна " + total + " рублей!");
            }
            iW++;
        }
        // Урок 2 Задание 4
        int iF = 1;
        while (iF < 31) {
            if (iF % 7 == 2) {
                System.out.println("Сегодня пятница, " + iF + "-е число. Необходимо подготовить отчет.");
            }
            iF++;
        }
        // Урок 3 Задание 1
        int earthA = 2122;
        int yearsY = 1822;
        for (int iQ = 0; iQ <= earthA; iQ = iQ + 79) {
            if (iQ >= yearsY) {
                System.out.println(iQ);
            }
        }
        // Урок 3 Задание 2
        int table1 = 0;
        int table2 = 2;
        System.out.print(table1 + " ");
        System.out.print(table2 + " ");

        int iR = 0;
        do {
            int tmp = table2;
            table2 = table1 + table2;
            table1 = tmp;
            iR++;
            System.out.print(table2 + " ");
        }
        while (iR != 8);
    }
}