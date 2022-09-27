/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountPinAmount;

/**
 *
 * @author jeffrey.schneider
 */
public class AccountPinAmount {
    static int permanentCounter = 0;
    private String accountNumber;
    private String pin;
    private double amount;
    

    public AccountPinAmount(String accountNumber, String pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        ++permanentCounter;
    }

    public AccountPinAmount(String accountNumber, String pin, double amount) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.amount = amount;
        ++permanentCounter;
    }


    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getAmount() {
        return amount;
    }

    public void changeAmount(double change){
        this.amount += change;
    }
        
    @Override
    public String toString() {
        return "AccountPinAmount{" + "accountNumber=" + 
                accountNumber + ", pin=" + 
                pin + ", amount=" + amount + '}';
    }
}
