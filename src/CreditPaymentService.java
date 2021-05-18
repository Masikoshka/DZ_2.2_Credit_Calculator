public class CreditPaymentService {
    public int calculate(int Amount, int Period, double interestRate) {
        double monthlyInterest = interestRate / 100 / 12;
        double monthlyPayment = Amount * (monthlyInterest + (monthlyInterest / (Math.pow((monthlyInterest + 1), Period) - 1)));
        return (int) monthlyPayment;
    }
}