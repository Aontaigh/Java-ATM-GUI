package GUIs;

import Accounts.Account;
import MyFileIO.FileIO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class User extends javax.swing.JFrame {
    
    private static int accountID;
    private ArrayList<Account> accounts = new ArrayList<>();
    
    public User(int accountID) {
        initComponents();
        this.accountID = accountID;
        accounts = FileIO.readAndReturn();
        updateBalance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balancePanel = new javax.swing.JPanel();
        balanceLabel = new javax.swing.JLabel();
        balanceTextField = new javax.swing.JTextField();
        depositPanel = new javax.swing.JPanel();
        depositLabel = new javax.swing.JLabel();
        depositAmountInput = new javax.swing.JTextField();
        depositButtonPanel = new javax.swing.JPanel();
        depositButton = new javax.swing.JButton();
        withdrawPanel = new javax.swing.JPanel();
        withdrawLabel = new javax.swing.JLabel();
        withdrawAmountInput = new javax.swing.JTextField();
        withdrawButtonPanel = new javax.swing.JPanel();
        withdrawButton = new javax.swing.JButton();
        closeButtonPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User");

        balancePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        balanceLabel.setText("Balance:");

        balanceTextField.setEditable(false);

        javax.swing.GroupLayout balancePanelLayout = new javax.swing.GroupLayout(balancePanel);
        balancePanel.setLayout(balancePanelLayout);
        balancePanelLayout.setHorizontalGroup(
            balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(balanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balanceTextField)
                .addContainerGap())
        );
        balancePanelLayout.setVerticalGroup(
            balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        balancePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {balanceLabel, balanceTextField});

        depositPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        depositLabel.setText("Deposit:");

        javax.swing.GroupLayout depositPanelLayout = new javax.swing.GroupLayout(depositPanel);
        depositPanel.setLayout(depositPanelLayout);
        depositPanelLayout.setHorizontalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositAmountInput)
                .addContainerGap())
        );
        depositPanelLayout.setVerticalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        depositPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {depositAmountInput, depositLabel});

        depositButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        depositButton.setText("Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout depositButtonPanelLayout = new javax.swing.GroupLayout(depositButtonPanel);
        depositButtonPanel.setLayout(depositButtonPanelLayout);
        depositButtonPanelLayout.setHorizontalGroup(
            depositButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        depositButtonPanelLayout.setVerticalGroup(
            depositButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        withdrawPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        withdrawLabel.setText("Withdraw:");

        javax.swing.GroupLayout withdrawPanelLayout = new javax.swing.GroupLayout(withdrawPanel);
        withdrawPanel.setLayout(withdrawPanelLayout);
        withdrawPanelLayout.setHorizontalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawAmountInput)
                .addContainerGap())
        );
        withdrawPanelLayout.setVerticalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        withdrawPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {withdrawAmountInput, withdrawLabel});

        withdrawButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        withdrawButton.setText("Withdraw");
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout withdrawButtonPanelLayout = new javax.swing.GroupLayout(withdrawButtonPanel);
        withdrawButtonPanel.setLayout(withdrawButtonPanelLayout);
        withdrawButtonPanelLayout.setHorizontalGroup(
            withdrawButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawButton, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );
        withdrawButtonPanelLayout.setVerticalGroup(
            withdrawButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closeButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        closeButton.setText("Finished");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout closeButtonPanelLayout = new javax.swing.GroupLayout(closeButtonPanel);
        closeButtonPanel.setLayout(closeButtonPanelLayout);
        closeButtonPanelLayout.setHorizontalGroup(
            closeButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        closeButtonPanelLayout.setVerticalGroup(
            closeButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(balancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        try {
            double deposit = Double.parseDouble(depositAmountInput.getText());
            
            for(int i = 0; i < accounts.size(); i++) {            
                if(accounts.get(i).getId() == accountID) {
                    accounts.get(i).deposit(deposit);
                    depositAmountInput.setText("");
                    FileIO.writeToFile(accounts);
                    updateBalance();
                    break;
                }                
            }             
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Number", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        try {
            double withdraw = Double.parseDouble(withdrawAmountInput.getText());
            
            for(int i = 0; i < accounts.size(); i++) {            
                if(accounts.get(i).getId() == accountID) {
                    accounts.get(i).withdraw(withdraw);
                    withdrawAmountInput.setText("");
                    FileIO.writeToFile(accounts);
                    updateBalance();
                    break;
                }                
            }              
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Number", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
        Login myLogin = new Login();
        myLogin.setVisible(true); 
    }//GEN-LAST:event_closeButtonActionPerformed
    
    public void updateBalance() {
        for(int i = 0; i < accounts.size(); i++) {            
            if(accounts.get(i).getId() == accountID) {
                balanceTextField.setText(String.format("€%.2f", accounts.get(i).getBalance()));
                break;
            }                
        }         
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User(accountID).setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JPanel balancePanel;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel closeButtonPanel;
    private javax.swing.JTextField depositAmountInput;
    private javax.swing.JButton depositButton;
    private javax.swing.JPanel depositButtonPanel;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JTextField withdrawAmountInput;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JPanel withdrawButtonPanel;
    private javax.swing.JLabel withdrawLabel;
    private javax.swing.JPanel withdrawPanel;
    // End of variables declaration//GEN-END:variables
}
