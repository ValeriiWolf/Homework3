public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 11;
        byte b = 1;
        short c = 111;
        long d = 1111L;
        float e = 1f;
        double f = 1.11;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float e2 = 27.12f;
        long d2 = 987678965549L;
        float e3 = 2.786f;
        short c2 = 569;
        short c3 = -159;
        short c4 = 27897;
        byte a2 = 67;
        System.out.println("тип переменной: float, присвоенное имя: e2, присвоенное значение: " + e2);
        System.out.println("тип переменной: long, присвоенное имя: d2, присвоенное значение: " + d2);
        System.out.println("тип переменной: float, присвоенное имя: e3, присвоенное значение: " + e3);
        System.out.println("тип переменной: short, присвоенное имя: c2, присвоенное значение: " + c2);
        System.out.println("тип переменной: short, присвоенное имя: c3, присвоенное значение: " + c3);
        System.out.println("тип переменной: short, присвоенное имя: c4, присвоенное значение: " + c4);
        System.out.println("тип переменной: byte, присвоенное имя: a2, присвоенное значение: " + a2);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        short student = 23 + 27 + 30;
        int listStudent = 480 / student;
        System.out.println("На каждого ученика рассчитано " + listStudent + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int efficiencyTwo = 16;
        int efficiencyTwenty = efficiencyTwo * 10;
        int efficiencyDays = efficiencyTwo * 24 * 30;
        int efficiencyThreeDays = efficiencyDays * 3;
        int efficiencyMonth = efficiencyDays * 30;
        System.out.println("За 20 минут машина произвела " + efficiencyTwenty + " штук бутылок");
        System.out.println("За 1 день машина произвела " + efficiencyDays + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiencyThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + efficiencyMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte totalCansPaint = 120;
        int totalClass = totalCansPaint / 6;
        int cansWhitePaint = 2 * totalClass;
        int cansBrownPaint = 4 * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + cansWhitePaint + " банок белой краски и " + cansBrownPaint + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int massLunch = 5 * 80 + 2 * 105 + 2 * 100 + 4 * 70;
        float massLunchKG = massLunch / (float)1000;
        System.out.println("Завтрак в граммах " + massLunch);
        System.out.println("Завтрак в килограммах " + massLunchKG);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte weightResetKG = 7;
        short weightResetGR = (short) (weightResetKG * 1000);
        short weightMaxResetDay = 500;
        short weightMinResetDay = 250;
        short weightAverageResetDay = (short) ((weightMaxResetDay + weightMinResetDay) / 2);
        byte dayMin = (byte) (weightResetGR / weightMaxResetDay);
        byte dayMax = (byte) (weightResetGR / weightMinResetDay);
        float dayAverage1 = 1f * weightResetGR / weightAverageResetDay;
        byte dayAverage2 = (byte) ((dayMin + dayMax) / 2);//как правильние считать среднее количество дней?
        System.out.println("Минимальное количество дней для похудения " + dayMin);
        System.out.println("Максимальное количество дней для похудения " + dayMax);
        System.out.println("При ежедневном среднем сбросе " + weightAverageResetDay + " грамм, cреднее количество дней для похудения " + dayAverage1);
        System.out.println("Общее среднее количество дней для похудения " + dayAverage2);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int salaryMarryMonth = 67760;
        int salaryDenisMonth = 83690;
        int salaryKristinaMonth = 76230;
        int salaryMarryYearStandart = salaryMarryMonth*12;
        int salaryDenisYearStandart = salaryDenisMonth*12;
        int salaryKristinaYearStandart = salaryKristinaMonth*12;
        int salaryMarryMonthIncreased =salaryMarryMonth+ salaryMarryMonth/10;
        int salaryDenisMonthIncreased =salaryDenisMonth+ salaryDenisMonth/10;
        int salaryKristinaMonthIncreased =salaryKristinaMonth+ salaryKristinaMonth/10;
        int salaryMarryYearIncreased = salaryMarryMonthIncreased*12;
        int salaryDenisYearIncreased = salaryDenisMonthIncreased*12;
        int salaryKristinaYearIncreased = salaryKristinaMonthIncreased*12;
        int salaryIncreasedMarry = salaryMarryYearIncreased - salaryMarryYearStandart;
        int salaryIncreasedDenis = salaryDenisYearIncreased - salaryDenisYearStandart;
        int salaryIncreasedKristina = salaryKristinaYearIncreased - salaryKristinaYearStandart;
        System.out.println("Маша теперь получает "+salaryMarryMonthIncreased+" рублей. Годовой доход вырос на "+salaryIncreasedMarry+" рублей");
        System.out.println("Денис теперь получает "+salaryDenisMonthIncreased+" рублей. Годовой доход вырос на "+salaryIncreasedDenis+" рублей");
        System.out.println("Кристина теперь получает "+salaryKristinaMonthIncreased+" рублей. Годовой доход вырос на "+salaryIncreasedKristina+" рублей");
    }
}