public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65.2;                     // вес в килограммах
        double height = 1.70;                    // рост в метрах
        double bodyIndex = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела: " + bodyIndex);

        BmiService service1 = new BmiService();
        double weight1 = 106.6;
        double height1 = 1.63;
        double bodyIndex1 = service1.calculate(weight1, height1);
        System.out.println("Ваш индекс массы тела: " + bodyIndex1);

        BmiService service2 = new BmiService();
        double weight2 = 48.3;
        double height2 = 1.55;
        double bodyIndex2 = service2.calculate(weight2, height2);
        System.out.println("Ваш индекс массы тела: " + bodyIndex2);
    }
}
