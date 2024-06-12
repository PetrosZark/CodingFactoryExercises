package gr.aueb.cf.ch13.bankApp.model;

import gr.aueb.cf.ch13.bankApp.model.Account;

public class OverdraftAccount {


    private String ssn;
    private double balance;

    public OverdraftAccount() {

    }

    public OverdraftAccount(String ssn, double balance) {
        this.ssn = ssn;
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void overdraft(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn is not valid exception");
            }

            balance -= amount;
            System.out.println("Overdraft of " + amount + " success.");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public double getAccountBalance() {
        System.out.println("Overdraft Successful");
        return getBalance();
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

}
