package Accounts;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public abstract class Account implements Serializable {
    
    private int id;
    private String password;
    private double balance = 0;
    private double annualInterestRate;
    private final Date dateCreated = Calendar.getInstance().getTime();
    
    public Account() {
        
    }
    
    public Account(int id, String password) {
        this.id = id;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public String getFormattedDateCreated() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        String reportDate = df.format(dateCreated);
        
        return reportDate;
    }
    
    public void deposit(double amount) {
        balance += amount;
        JOptionPane.showMessageDialog(null, "You Successfully Deposited: €" +amount);
    }
    
    public abstract void withdraw(double amount);
}
