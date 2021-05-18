public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYear = service.calculate(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платеж: " + monthlyPaymentOneYear);

        int monthlyPaymentTwoYears = service.calculate(1_000_000, 24, 9.99);
        System.out.println("Ежемесячный платеж: " + monthlyPaymentTwoYears);

        int monthlyPaymentThreeYears = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Ежемесячный платеж: " + monthlyPaymentThreeYears);
    }
}
