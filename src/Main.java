public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(20000);
        Boolean flag = true;
        while (flag){
            try {
                account.withDraw(6000);
                System.out.println("Сняли 6к сом");
                System.out.println("Остаток: " + account.getAmount());
            } catch (LimitException e) {
                try {
                    System.out.println(e.getMessage());
                    double amount = e.getRemainingAmount();
                    account.withDraw((int) amount);
                    System.out.println("Сняли "+ amount +" сом");
                    flag = false;
                } catch (LimitException ex) {
                    System.out.println("Недостаточно средств!");
                }
            }
        }
    }
}