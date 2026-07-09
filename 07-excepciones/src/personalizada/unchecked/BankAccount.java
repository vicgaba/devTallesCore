package personalizada.unchecked;

import java.awt.image.BandCombineOp;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new NegativeBalanceException("Saldo insuficiente");
        }

        balance -= amount;
        System.out.println("Saldo actual: " + balance);
    }

    public static void main(String[] args) {

        try{
            BankAccount account = new BankAccount(1000);
            account.withdraw(500);
            account.withdraw(1500);
        } catch (NegativeBalanceException e) {
             System.out.println(e.getMessage());
        }
    }
}
