public class Main {
    public static void main(String[] args) {
        // Задание 1

        byte a = 5;
        short b = 10;
        int c = 20;
        long d = 100L;
        float e = 4.5f;
        double f = 34.43;
        boolean g = true;
        char i = 34;
        var j = 555;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + i + " " + j );

        // Задание 2

        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;

        System.out.println("Общий вес бойцов: " + (firstBoxerWeight + secondBoxerWeight));
        System.out.println("Разница между весами бойцов: " + (secondBoxerWeight - firstBoxerWeight));

        // Задание 3

        int bananasWeight = 5 * 80;
        int milkWeight = 200 / 100 * 105;
        int icecreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int totalWeight = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
        int grPerKg = 1000;
        float totalWeightInKilograms = totalWeight/(float)grPerKg;

        System.out.println("Общий вес завтрака в граммах: " + totalWeight);
        System.out.println("Общий вес завтрака в килограммах: " + totalWeightInKilograms);

        // Задание 4

        double excessWeight = 7;
        double weightLoss1 = 0.250;
        double weightLoss2 = 0.5;
        System.out.println("Количество дней при убывании веса 250 г: " + (excessWeight / weightLoss1));
        System.out.println("Количество дней при убывании веса 500 г: " + (excessWeight / weightLoss2));
        System.out.println("Количество дней в среднем: " + (excessWeight / ((weightLoss1 + weightLoss2) / 2)));

        // Задание 5

        int mashasSalary = 67_760;
        int denisSalary = 83_690;
        int kristinasSalary = 76_230;
        int mashasNewSalary = mashasSalary + mashasSalary / 100 * 10;
        int denisNewSalary = denisSalary + denisSalary / 100 * 10;
        int kristinasNewSalary = kristinasSalary + kristinasSalary / 100 * 10;

        System.out.println("Маша теперь получает " +  mashasNewSalary + " рублей. Годовой доход вырос на " + ((mashasNewSalary - mashasSalary) * 12) + " рублей");
        System.out.println("Денис теперь получает " +  denisNewSalary + " рублей. Годовой доход вырос на " + ((denisNewSalary - denisSalary) * 12) + " рублей");
        System.out.println("Кристина теперь получает " +  kristinasNewSalary + " рублей. Годовой доход вырос на " + ((kristinasNewSalary - kristinasSalary) * 12) + " рублей");


    }
}
