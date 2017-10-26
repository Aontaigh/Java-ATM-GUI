package Accounts;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class CurrentAccount extends Account implements Serializable {
    private static double overdraftLimit = 0;
    
    public CurrentAccount() {
        super();
    }
    
    public CurrentAccount(int id, String password) {
        super(id, password);
    }
    
    public static double getOverdraftLimit() {
        return overdraftLimit;
    }

    public static void setOverdraftLimit(double aOverdraftLimit) {
        overdraftLimit = aOverdraftLimit;
    }    
    
    @Override
    public void withdraw(double amount) {
        double realOverdraftLimit = overdraftLimit * -1;
        
        if((getBalance() - amount) >= realOverdraftLimit) {
            setBalance(getBalance() - amount);
            JOptionPane.showMessageDialog(null, "You Successfully Withdrew: €" +amount);
        } else {
             JOptionPane.showMessageDialog(null, "€" + amount + " Is Too Much To Withdraw Due To The Overdraft Limit" , "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    @Override
    public String toString() {
        return String.format("ID: %d \nPassword: %s \nBalance: €%.2f \nDate Created: %s \nAnnual Interest Rate: %.2f%% \nOverdraft Limit: €%.2f \nAccount Type: Current Account\n\n" , getId(), getPassword(), getBalance(), getFormattedDateCreated(), getAnnualInterestRate(), getOverdraftLimit());
    }
}