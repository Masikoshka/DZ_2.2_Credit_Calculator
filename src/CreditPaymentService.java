public class CreditPaymentService {
    public int calculate(int amount, int period, double interestRate) {
        double monthlyInterest = interestRate / 100 / 12;
        double monthlyPayment = amount * (monthlyInterest + (monthlyInterest / (Math.pow((monthlyInterest + 1), period) - 1)));
        return (int) monthlyPayment;
    }
}
