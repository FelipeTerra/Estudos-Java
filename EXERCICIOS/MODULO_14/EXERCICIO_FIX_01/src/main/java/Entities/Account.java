package Entities;

import Exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){};

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() { return number; }

    public void setNumber(Integer number) { this.number = number; }

    public String getHolder() { return holder; }

    public void setHolder(String holder) { this.holder = holder; }

    public Double getBalance() { return balance; }

    public Double getWithdrawLimit() { return withdrawLimit; }

    public void setWithdrawLimit(Double withdrawLimit) { this.withdrawLimit = withdrawLimit; }

    public void deposit (Double amount){
        balance += amount;
    }

    public void withdraw (Double amount){
        if(balance < 0.0){
           throw new DomainException("Not enouth balance");
        }
        if(balance < amount) {
            throw new DomainException("Not enouth balance");
        }
        if(amount > withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        balance -= amount;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" | Number Account: ").append(getNumber()).append("\n");
        sb.append(" | Holder: ").append(getHolder()).append("\n");
        sb.append(" | Balance: ").append(getBalance()).append("\n");
        sb.append(" | Withdraw Limit: ").append(getWithdrawLimit()).append("\n");
        return sb.toString();
    }
}
