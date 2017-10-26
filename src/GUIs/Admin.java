package GUIs;

import Accounts.Account;
import Accounts.CurrentAccount;
import Accounts.DepositAccount;
import MyFileIO.FileIO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

    private ArrayList<Account> accounts = new ArrayList<>();
    
    public Admin() {
        initComponents();
        accounts = FileIO.readAndReturn();
        displayAccounts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPain = new javax.swing.JTabbedPane();
        allAccountsPanel = new javax.swing.JPanel();
        allAccountsInternalPanel = new javax.swing.JPanel();
        listAccountsScrollPane = new javax.swing.JScrollPane();
        listAccountsJTextArea = new javax.swing.JTextArea();
        closeButtonPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        createAccountPanel = new javax.swing.JPanel();
        currentAccountDetailsPanel = new javax.swing.JPanel();
        currentAccountAccountID = new javax.swing.JLabel();
        currentAccountAccountIDInput = new javax.swing.JTextField();
        currentAccountPasswordLabel = new javax.swing.JLabel();
        currentAccountAccountPasswordInput = new javax.swing.JTextField();
        createCurrentAccountPanel = new javax.swing.JPanel();
        createCurrentAccountButton = new javax.swing.JButton();
        depositAccountDetailsPanel = new javax.swing.JPanel();
        depositAccountAccountID = new javax.swing.JLabel();
        depositAccountAccountIDInput = new javax.swing.JTextField();
        depositAccountAccountPassword = new javax.swing.JLabel();
        depositAccountAccountPasswordInput = new javax.swing.JTextField();
        createDepositAccountPanel = new javax.swing.JPanel();
        createDepositAccountButton = new javax.swing.JButton();
        depositPanel = new javax.swing.JPanel();
        depositAccountIDPanel = new javax.swing.JPanel();
        depositAccountIDLabel = new javax.swing.JLabel();
        depositAccountIDInput = new javax.swing.JTextField();
        depositAmountPanel = new javax.swing.JPanel();
        depositAmountLabel = new javax.swing.JLabel();
        depositAmountInput = new javax.swing.JTextField();
        depositButtonPanel = new javax.swing.JPanel();
        depositButton = new javax.swing.JButton();
        withdrawPanel = new javax.swing.JPanel();
        withdrawAccountIDPanel = new javax.swing.JPanel();
        withdrawAccountIDLabel = new javax.swing.JLabel();
        withdrawAccountIDInput = new javax.swing.JTextField();
        withdrawAmountPanel = new javax.swing.JPanel();
        withdrawAmountLabel = new javax.swing.JLabel();
        withdrawAmountInput = new javax.swing.JTextField();
        withdrawButtonPanel = new javax.swing.JPanel();
        withdrawButton = new javax.swing.JButton();
        modifyPanel = new javax.swing.JPanel();
        deleteAccountIDPanel = new javax.swing.JPanel();
        deleteAccountIDLabel = new javax.swing.JLabel();
        deleteAccountIDInput = new javax.swing.JTextField();
        deleteAccountButtonPanel = new javax.swing.JPanel();
        deleteAccountButton = new javax.swing.JButton();
        overdraftLimitPanel = new javax.swing.JPanel();
        overdraftLimitLabel = new javax.swing.JLabel();
        overdraftLimitInput = new javax.swing.JTextField();
        overdraftLimitButtonPanel = new javax.swing.JPanel();
        overdraftLimitButton = new javax.swing.JButton();
        annualInterestRatePanel = new javax.swing.JPanel();
        annualInterestRateLabel = new javax.swing.JLabel();
        annualInterestRateInput = new javax.swing.JTextField();
        annualInterestRateButtonPanel = new javax.swing.JPanel();
        annualInterestRateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        mainTabbedPain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTabbedPainMouseClicked(evt);
            }
        });

        allAccountsInternalPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listAccountsJTextArea.setEditable(false);
        listAccountsJTextArea.setColumns(20);
        listAccountsJTextArea.setRows(5);
        listAccountsScrollPane.setViewportView(listAccountsJTextArea);

        javax.swing.GroupLayout allAccountsInternalPanelLayout = new javax.swing.GroupLayout(allAccountsInternalPanel);
        allAccountsInternalPanel.setLayout(allAccountsInternalPanelLayout);
        allAccountsInternalPanelLayout.setHorizontalGroup(
            allAccountsInternalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allAccountsInternalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listAccountsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
        allAccountsInternalPanelLayout.setVerticalGroup(
            allAccountsInternalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allAccountsInternalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listAccountsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, closeButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout allAccountsPanelLayout = new javax.swing.GroupLayout(allAccountsPanel);
        allAccountsPanel.setLayout(allAccountsPanelLayout);
        allAccountsPanelLayout.setHorizontalGroup(
            allAccountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allAccountsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allAccountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allAccountsInternalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        allAccountsPanelLayout.setVerticalGroup(
            allAccountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allAccountsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(allAccountsInternalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainTabbedPain.addTab("Main", allAccountsPanel);

        currentAccountDetailsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        currentAccountAccountID.setText("Account ID:");

        currentAccountPasswordLabel.setText("Password:");

        javax.swing.GroupLayout currentAccountDetailsPanelLayout = new javax.swing.GroupLayout(currentAccountDetailsPanel);
        currentAccountDetailsPanel.setLayout(currentAccountDetailsPanelLayout);
        currentAccountDetailsPanelLayout.setHorizontalGroup(
            currentAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentAccountDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentAccountDetailsPanelLayout.createSequentialGroup()
                        .addComponent(currentAccountAccountID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentAccountAccountIDInput))
                    .addGroup(currentAccountDetailsPanelLayout.createSequentialGroup()
                        .addComponent(currentAccountPasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentAccountAccountPasswordInput)))
                .addContainerGap())
        );

        currentAccountDetailsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {currentAccountAccountID, currentAccountPasswordLabel});

        currentAccountDetailsPanelLayout.setVerticalGroup(
            currentAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentAccountDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentAccountAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentAccountAccountIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(currentAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentAccountPasswordLabel)
                    .addComponent(currentAccountAccountPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        currentAccountDetailsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {currentAccountAccountID, currentAccountAccountIDInput, currentAccountAccountPasswordInput, currentAccountPasswordLabel});

        createCurrentAccountPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        createCurrentAccountButton.setText("Create Current Account");
        createCurrentAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCurrentAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createCurrentAccountPanelLayout = new javax.swing.GroupLayout(createCurrentAccountPanel);
        createCurrentAccountPanel.setLayout(createCurrentAccountPanelLayout);
        createCurrentAccountPanelLayout.setHorizontalGroup(
            createCurrentAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCurrentAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createCurrentAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        createCurrentAccountPanelLayout.setVerticalGroup(
            createCurrentAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCurrentAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createCurrentAccountButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        depositAccountDetailsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        depositAccountAccountID.setText("Account ID:");

        depositAccountAccountPassword.setText("Password:");

        javax.swing.GroupLayout depositAccountDetailsPanelLayout = new javax.swing.GroupLayout(depositAccountDetailsPanel);
        depositAccountDetailsPanel.setLayout(depositAccountDetailsPanelLayout);
        depositAccountDetailsPanelLayout.setHorizontalGroup(
            depositAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositAccountDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(depositAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositAccountDetailsPanelLayout.createSequentialGroup()
                        .addComponent(depositAccountAccountID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depositAccountAccountIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(depositAccountDetailsPanelLayout.createSequentialGroup()
                        .addComponent(depositAccountAccountPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depositAccountAccountPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        depositAccountDetailsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {depositAccountAccountID, depositAccountAccountPassword});

        depositAccountDetailsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {depositAccountAccountIDInput, depositAccountAccountPasswordInput});

        depositAccountDetailsPanelLayout.setVerticalGroup(
            depositAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositAccountDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(depositAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositAccountAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositAccountAccountIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(depositAccountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositAccountAccountPassword)
                    .addComponent(depositAccountAccountPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        depositAccountDetailsPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {depositAccountAccountID, depositAccountAccountIDInput, depositAccountAccountPassword, depositAccountAccountPasswordInput});

        createDepositAccountPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        createDepositAccountButton.setText("Create Deposit Account");
        createDepositAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDepositAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createDepositAccountPanelLayout = new javax.swing.GroupLayout(createDepositAccountPanel);
        createDepositAccountPanel.setLayout(createDepositAccountPanelLayout);
        createDepositAccountPanelLayout.setHorizontalGroup(
            createDepositAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createDepositAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createDepositAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        createDepositAccountPanelLayout.setVerticalGroup(
            createDepositAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createDepositAccountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createDepositAccountButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout createAccountPanelLayout = new javax.swing.GroupLayout(createAccountPanel);
        createAccountPanel.setLayout(createAccountPanelLayout);
        createAccountPanelLayout.setHorizontalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentAccountDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createCurrentAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositAccountDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createDepositAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        createAccountPanelLayout.setVerticalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentAccountDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createCurrentAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(depositAccountDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createDepositAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainTabbedPain.addTab("Create", createAccountPanel);

        depositAccountIDPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        depositAccountIDLabel.setText("Account ID:");

        javax.swing.GroupLayout depositAccountIDPanelLayout = new javax.swing.GroupLayout(depositAccountIDPanel);
        depositAccountIDPanel.setLayout(depositAccountIDPanelLayout);
        depositAccountIDPanelLayout.setHorizontalGroup(
            depositAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositAccountIDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositAccountIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositAccountIDInput)
                .addContainerGap())
        );
        depositAccountIDPanelLayout.setVerticalGroup(
            depositAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositAccountIDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(depositAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositAccountIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositAccountIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        depositAccountIDPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {depositAccountIDInput, depositAccountIDLabel});

        depositAmountPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        depositAmountLabel.setText("Amount:");

        javax.swing.GroupLayout depositAmountPanelLayout = new javax.swing.GroupLayout(depositAmountPanel);
        depositAmountPanel.setLayout(depositAmountPanelLayout);
        depositAmountPanelLayout.setHorizontalGroup(
            depositAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositAmountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositAmountInput, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        depositAmountPanelLayout.setVerticalGroup(
            depositAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositAmountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(depositAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        depositAmountPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {depositAmountInput, depositAmountLabel});

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(depositButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout depositPanelLayout = new javax.swing.GroupLayout(depositPanel);
        depositPanel.setLayout(depositPanelLayout);
        depositPanelLayout.setHorizontalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositAmountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositAccountIDPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        depositPanelLayout.setVerticalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositAccountIDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositAmountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        mainTabbedPain.addTab("Deposit", depositPanel);

        withdrawAccountIDPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        withdrawAccountIDLabel.setText("Account ID:");

        javax.swing.GroupLayout withdrawAccountIDPanelLayout = new javax.swing.GroupLayout(withdrawAccountIDPanel);
        withdrawAccountIDPanel.setLayout(withdrawAccountIDPanelLayout);
        withdrawAccountIDPanelLayout.setHorizontalGroup(
            withdrawAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawAccountIDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawAccountIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawAccountIDInput)
                .addContainerGap())
        );
        withdrawAccountIDPanelLayout.setVerticalGroup(
            withdrawAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawAccountIDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(withdrawAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawAccountIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawAccountIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        withdrawAccountIDPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {withdrawAccountIDInput, withdrawAccountIDLabel});

        withdrawAmountPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        withdrawAmountLabel.setText("Amount:");

        javax.swing.GroupLayout withdrawAmountPanelLayout = new javax.swing.GroupLayout(withdrawAmountPanel);
        withdrawAmountPanel.setLayout(withdrawAmountPanelLayout);
        withdrawAmountPanelLayout.setHorizontalGroup(
            withdrawAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawAmountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawAmountInput)
                .addContainerGap())
        );
        withdrawAmountPanelLayout.setVerticalGroup(
            withdrawAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawAmountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(withdrawAmountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        withdrawAmountPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {withdrawAmountInput, withdrawAmountLabel});

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
                .addComponent(withdrawButton, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
        withdrawButtonPanelLayout.setVerticalGroup(
            withdrawButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout withdrawPanelLayout = new javax.swing.GroupLayout(withdrawPanel);
        withdrawPanel.setLayout(withdrawPanelLayout);
        withdrawPanelLayout.setHorizontalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(withdrawButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawAccountIDPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawAmountPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        withdrawPanelLayout.setVerticalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawAccountIDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawAmountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        mainTabbedPain.addTab("Withdraw", withdrawPanel);

        deleteAccountIDPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deleteAccountIDLabel.setText("Account ID:");

        javax.swing.GroupLayout deleteAccountIDPanelLayout = new javax.swing.GroupLayout(deleteAccountIDPanel);
        deleteAccountIDPanel.setLayout(deleteAccountIDPanelLayout);
        deleteAccountIDPanelLayout.setHorizontalGroup(
            deleteAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAccountIDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteAccountIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteAccountIDInput)
                .addContainerGap())
        );
        deleteAccountIDPanelLayout.setVerticalGroup(
            deleteAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAccountIDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteAccountIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAccountIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAccountIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteAccountIDPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteAccountIDInput, deleteAccountIDLabel});

        deleteAccountButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deleteAccountButton.setText("Delete Account");
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteAccountButtonPanelLayout = new javax.swing.GroupLayout(deleteAccountButtonPanel);
        deleteAccountButtonPanel.setLayout(deleteAccountButtonPanelLayout);
        deleteAccountButtonPanelLayout.setHorizontalGroup(
            deleteAccountButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAccountButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        deleteAccountButtonPanelLayout.setVerticalGroup(
            deleteAccountButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAccountButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteAccountButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        overdraftLimitPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        overdraftLimitLabel.setText("Overdraft Limit:");

        javax.swing.GroupLayout overdraftLimitPanelLayout = new javax.swing.GroupLayout(overdraftLimitPanel);
        overdraftLimitPanel.setLayout(overdraftLimitPanelLayout);
        overdraftLimitPanelLayout.setHorizontalGroup(
            overdraftLimitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overdraftLimitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overdraftLimitLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overdraftLimitInput)
                .addContainerGap())
        );
        overdraftLimitPanelLayout.setVerticalGroup(
            overdraftLimitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overdraftLimitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(overdraftLimitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overdraftLimitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(overdraftLimitInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        overdraftLimitPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {overdraftLimitInput, overdraftLimitLabel});

        overdraftLimitButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        overdraftLimitButton.setText("Set Overdraft Limit");
        overdraftLimitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overdraftLimitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout overdraftLimitButtonPanelLayout = new javax.swing.GroupLayout(overdraftLimitButtonPanel);
        overdraftLimitButtonPanel.setLayout(overdraftLimitButtonPanelLayout);
        overdraftLimitButtonPanelLayout.setHorizontalGroup(
            overdraftLimitButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overdraftLimitButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overdraftLimitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
        overdraftLimitButtonPanelLayout.setVerticalGroup(
            overdraftLimitButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overdraftLimitButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overdraftLimitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        annualInterestRatePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        annualInterestRateLabel.setText("Annual Interest Rate:");

        javax.swing.GroupLayout annualInterestRatePanelLayout = new javax.swing.GroupLayout(annualInterestRatePanel);
        annualInterestRatePanel.setLayout(annualInterestRatePanelLayout);
        annualInterestRatePanelLayout.setHorizontalGroup(
            annualInterestRatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(annualInterestRatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(annualInterestRateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annualInterestRateInput)
                .addContainerGap())
        );
        annualInterestRatePanelLayout.setVerticalGroup(
            annualInterestRatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(annualInterestRatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(annualInterestRatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annualInterestRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annualInterestRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        annualInterestRatePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {annualInterestRateInput, annualInterestRateLabel});

        annualInterestRateButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        annualInterestRateButton.setText("Set Annual Interest Rate");
        annualInterestRateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualInterestRateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout annualInterestRateButtonPanelLayout = new javax.swing.GroupLayout(annualInterestRateButtonPanel);
        annualInterestRateButtonPanel.setLayout(annualInterestRateButtonPanelLayout);
        annualInterestRateButtonPanelLayout.setHorizontalGroup(
            annualInterestRateButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(annualInterestRateButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(annualInterestRateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        annualInterestRateButtonPanelLayout.setVerticalGroup(
            annualInterestRateButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(annualInterestRateButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(annualInterestRateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout modifyPanelLayout = new javax.swing.GroupLayout(modifyPanel);
        modifyPanel.setLayout(modifyPanelLayout);
        modifyPanelLayout.setHorizontalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteAccountIDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteAccountButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overdraftLimitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overdraftLimitButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annualInterestRatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annualInterestRateButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        modifyPanelLayout.setVerticalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteAccountIDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteAccountButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overdraftLimitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overdraftLimitButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annualInterestRatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annualInterestRateButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainTabbedPain.addTab("Modify", modifyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPain)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createCurrentAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCurrentAccountButtonActionPerformed
        try {
            int id = Integer.parseInt(currentAccountAccountIDInput.getText());
            String password = currentAccountAccountPasswordInput.getText();
            
            if (password.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please Enter A Password", "Error", JOptionPane.WARNING_MESSAGE);
            } else if(isIDAvailable(id) == false) {
                JOptionPane.showMessageDialog(rootPane, "The ID " + id + " Is Taken", "Error", JOptionPane.WARNING_MESSAGE);
            } else {        
                accounts.add(new CurrentAccount(id, password));
                
                if(accounts.size() > 0) {
                    accounts.get(accounts.size() - 1).setAnnualInterestRate(accounts.get(0).getAnnualInterestRate());
                }
                
                FileIO.writeToFile(accounts);

                currentAccountAccountIDInput.setText("");
                currentAccountAccountPasswordInput.setText("");

                JOptionPane.showMessageDialog(rootPane, "Successfully Created Current Account");
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid ID (Integer)", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_createCurrentAccountButtonActionPerformed

    private void mainTabbedPainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTabbedPainMouseClicked
        displayAccounts();
    }//GEN-LAST:event_mainTabbedPainMouseClicked

    private void createDepositAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDepositAccountButtonActionPerformed
        try {
            int id = Integer.parseInt(depositAccountAccountIDInput.getText());
            String password = depositAccountAccountPasswordInput.getText();
            
            if (password.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please Enter A Password", "Error", JOptionPane.WARNING_MESSAGE);
            } else if(isIDAvailable(id) == false) {
                JOptionPane.showMessageDialog(rootPane, "The ID " + id + " Is Taken", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                accounts.add(new DepositAccount(id, password));

                if(accounts.size() > 0) {
                    accounts.get(accounts.size() - 1).setAnnualInterestRate(accounts.get(0).getAnnualInterestRate());
                }
                
                FileIO.writeToFile(accounts);

                depositAccountAccountIDInput.setText("");
                depositAccountAccountPasswordInput.setText("");

                JOptionPane.showMessageDialog(rootPane, "Successfully Created Deposit Account");
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid ID (Integer)", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_createDepositAccountButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        try {    
            boolean error = true;

            int id = Integer.parseInt(depositAccountIDInput.getText());
            double amount = Double.parseDouble(depositAmountInput.getText());

            for(int i = 0; i < accounts.size(); i++) {            
                if(accounts.get(i).getId() == id) {
                    accounts.get(i).deposit(amount);
                    FileIO.writeToFile(accounts);
                    error = false;
                    break;
                } 
            }    

            if(error) {
                JOptionPane.showMessageDialog(rootPane, "Account ID Does Not Exist", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
            depositAccountIDInput.setText("");
            depositAmountInput.setText("");
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Number", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        try {
            boolean error = true;

            int id = Integer.parseInt(withdrawAccountIDInput.getText());
            double amount = Double.parseDouble(withdrawAmountInput.getText());

            for(int i = 0; i < accounts.size(); i++) {            
                if(accounts.get(i).getId() == id) {
                    accounts.get(i).withdraw(amount);
                    FileIO.writeToFile(accounts);
                    error = false;
                    break;
                }
            }          

            if(error) {
                JOptionPane.showMessageDialog(rootPane, "Account ID Does Not Exist", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
            withdrawAccountIDInput.setText("");
            withdrawAmountInput.setText("");
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Number", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        try {
            boolean displayError = true;
            int id = Integer.parseInt(deleteAccountIDInput.getText());
            
            for(int i = 0; i < accounts.size(); i++) {            
                if(accounts.get(i).getId() == id) {
                    accounts.remove(i);
                    FileIO.writeToFile(accounts);
                    deleteAccountIDInput.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Successfully Deleted The Account: " + id);
                    displayError = false;
                    break;
                }                
            }   
            
            if (displayError) {
                JOptionPane.showMessageDialog(rootPane, "Account ID Does Not Exist", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Number", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteAccountButtonActionPerformed

    private void overdraftLimitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overdraftLimitButtonActionPerformed
        try {
            int overdraftLimit = Integer.parseInt(overdraftLimitInput.getText());
            
            CurrentAccount.setOverdraftLimit(overdraftLimit);
            
            JOptionPane.showMessageDialog(rootPane, "Successfully Set Overdraft Limit To: €" + overdraftLimit);
            
            overdraftLimitInput.setText("");
            
            FileIO.writeToFile(accounts);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Number", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_overdraftLimitButtonActionPerformed

    private void annualInterestRateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualInterestRateButtonActionPerformed
        try {
            int annualInterestRate = Integer.parseInt(annualInterestRateInput.getText());
            
            for(int i = 0; i < accounts.size(); i++) {            
                accounts.get(i).setAnnualInterestRate(annualInterestRate); 
            }   
            
            FileIO.writeToFile(accounts);  
            
            annualInterestRateInput.setText("");
            
            JOptionPane.showMessageDialog(rootPane, "Successfully Set AIR To: " + annualInterestRate);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Number", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_annualInterestRateButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
        Login myLogin = new Login();
        myLogin.setVisible(true); 
    }//GEN-LAST:event_closeButtonActionPerformed
    
    public void displayAccounts() {
        String output = "";
        
        for(int i = 0; i < accounts.size(); i++) {            
            output += accounts.get(i).toString();
        }  
        
        listAccountsJTextArea.setText(output);  
    }    
    
    public boolean isIDAvailable(int id) {
        boolean available = true;
        
        for(int i = 0; i < accounts.size(); i++) {   
            if(accounts.get(i).getId() == id){
                available = false;
                break;
            }
        }  
        
        return available;
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allAccountsInternalPanel;
    private javax.swing.JPanel allAccountsPanel;
    private javax.swing.JButton annualInterestRateButton;
    private javax.swing.JPanel annualInterestRateButtonPanel;
    private javax.swing.JTextField annualInterestRateInput;
    private javax.swing.JLabel annualInterestRateLabel;
    private javax.swing.JPanel annualInterestRatePanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel closeButtonPanel;
    private javax.swing.JPanel createAccountPanel;
    private javax.swing.JButton createCurrentAccountButton;
    private javax.swing.JPanel createCurrentAccountPanel;
    private javax.swing.JButton createDepositAccountButton;
    private javax.swing.JPanel createDepositAccountPanel;
    private javax.swing.JLabel currentAccountAccountID;
    private javax.swing.JTextField currentAccountAccountIDInput;
    private javax.swing.JTextField currentAccountAccountPasswordInput;
    private javax.swing.JPanel currentAccountDetailsPanel;
    private javax.swing.JLabel currentAccountPasswordLabel;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JPanel deleteAccountButtonPanel;
    private javax.swing.JTextField deleteAccountIDInput;
    private javax.swing.JLabel deleteAccountIDLabel;
    private javax.swing.JPanel deleteAccountIDPanel;
    private javax.swing.JLabel depositAccountAccountID;
    private javax.swing.JTextField depositAccountAccountIDInput;
    private javax.swing.JLabel depositAccountAccountPassword;
    private javax.swing.JTextField depositAccountAccountPasswordInput;
    private javax.swing.JPanel depositAccountDetailsPanel;
    private javax.swing.JTextField depositAccountIDInput;
    private javax.swing.JLabel depositAccountIDLabel;
    private javax.swing.JPanel depositAccountIDPanel;
    private javax.swing.JTextField depositAmountInput;
    private javax.swing.JLabel depositAmountLabel;
    private javax.swing.JPanel depositAmountPanel;
    private javax.swing.JButton depositButton;
    private javax.swing.JPanel depositButtonPanel;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JTextArea listAccountsJTextArea;
    private javax.swing.JScrollPane listAccountsScrollPane;
    private javax.swing.JTabbedPane mainTabbedPain;
    private javax.swing.JPanel modifyPanel;
    private javax.swing.JButton overdraftLimitButton;
    private javax.swing.JPanel overdraftLimitButtonPanel;
    private javax.swing.JTextField overdraftLimitInput;
    private javax.swing.JLabel overdraftLimitLabel;
    private javax.swing.JPanel overdraftLimitPanel;
    private javax.swing.JTextField withdrawAccountIDInput;
    private javax.swing.JLabel withdrawAccountIDLabel;
    private javax.swing.JPanel withdrawAccountIDPanel;
    private javax.swing.JTextField withdrawAmountInput;
    private javax.swing.JLabel withdrawAmountLabel;
    private javax.swing.JPanel withdrawAmountPanel;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JPanel withdrawButtonPanel;
    private javax.swing.JPanel withdrawPanel;
    // End of variables declaration//GEN-END:variables
}
