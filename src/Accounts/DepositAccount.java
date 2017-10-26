package Accounts;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class DepositAccount extends Account implements Serializable {
    
    public DepositAccount() {
        super();
    }
    
    public DepositAccount(int id, String password) {
        super(id, password);
    }
    
    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            JOptionPane.showMessageDialog(null, "You Successfully Withdrew: €" +amount);
        } else {
            JOptionPane.showMessageDialog(null, "Your Balance Is: €" + getBalance() + "\nYou Tried To Wirthdraw: €" + amount, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    @Override
    public String toString() {
        return String.format("ID: %d \nPassword: %s \nBalance: €%.2f \nDate Created: %s \nAnnual Interest Rate: %.2f%% \nAccount Type: Deposit Account\n\n" , getId(), getPassword(), getBalance(), getFormattedDateCreated(), getAnnualInterestRate());
    }
    
}
