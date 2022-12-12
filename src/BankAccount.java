public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    void deposit(double sum){
        amount += sum;
    }

    void withDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("запрашиваемая сумма на снятие больше чем остаток денег на счете", amount);
        }
        amount -= sum;
    }
}
