public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyIndex = service.calculate(65.2, 1.70); // вес в килограммах, рост в метрах
        System.out.printf("Ваш индекс массы тела: %.2f", bodyIndex);
        System.out.println();

        double bodyIndex1 = service.calculate(106.6, 1.63);
        System.out.printf("Ваш индекс массы тела: %.2f", bodyIndex1);
        System.out.println();

        double bodyIndex2 = service.calculate(48.3, 1.55);
        System.out.printf("Ваш индекс массы тела: %.2f", bodyIndex2);
        System.out.println();
    }
}
