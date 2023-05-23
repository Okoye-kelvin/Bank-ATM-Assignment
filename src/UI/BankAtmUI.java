package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import BankFile.Bankfile;

public class BankAtmUI {
        JFrame myFrame = new JFrame("Welcome To Bank");

        JLabel enterPinLabel = new JLabel(" Enter PIN");

        JTextField InputPin = new JTextField("Input Pin");

        JFrame LoginFrame = new JFrame("Choose Account Type");
        JButton LoginButton = new JButton("Login");

        // Savings Account
        JFrame SavingsAccountFrame = new JFrame("Savings Account");
        JButton SavingsAccountButton = new JButton("Savings Account");

        // Savings Account Frame
        JButton SavingsDepositButton = new JButton("Deposit");
        JButton SavingsWithdrawButton = new JButton("Withdraw");

        // Savings Deposit Frame
        JFrame SavingsDepositFrame = new JFrame("Enter Deposit Details");
        JTextField enterSavingsDepositAmount = new JTextField(" Amount ");
        JButton SavingsDeposit = new JButton("Deposit");

        // Savings Withdraw Frame
        JFrame SavingsWithdrawFrame = new JFrame("Enter Deposit Details");
        JTextField enterSavingsWithdrawAmount = new JTextField(" Amount ");
        JButton SavingsWithdraw = new JButton("Withdraw");

        // Current Account
        JFrame CurrentAccountFrame = new JFrame("Current Account");
        JButton CurrentAccountButton = new JButton("Current Account");

        // Current Account Frame
        JButton CurrentDepositButton = new JButton("Deposit");
        JButton CurrentWithdrawButton = new JButton("Withdraw");

        // Current Deposit Frame
        JFrame CurrentDepositFrame = new JFrame("Enter Deposit Details");
        JTextField enterCurrentDepositAmount = new JTextField(" Amount ");
        JButton CurrentDeposit = new JButton("Deposit");

        // Current Withdraw Frame
        JFrame CurrentWithdrawFrame = new JFrame("Enter Withdraw Details");
        JTextField enterCurrentWithdrawAmount = new JTextField(" Amount ");
        JButton CurrentWithdraw = new JButton("Withdraw");

        public void BankUI() {
                myFrame.add(enterPinLabel);
                myFrame.add(InputPin);
                myFrame.add(LoginButton);
                myFrame.setSize(800, 400);
                myFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
                myFrame.setVisible(true);
                myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                LoginButton.addActionListener(e -> {
                        System.out.println("Choose Account Type");

                        double PIN = Double.parseDouble(InputPin.getText());

                        if (PIN == 5555) {
                                drawLoginUI();
                        } else {
                                JOptionPane.showMessageDialog(null, "Insert correct PIN");
                        }

                });
        }

        public void drawLoginUI() {
                LoginFrame = new JFrame("Choose Account Type");
                LoginFrame.add(SavingsAccountButton);
                LoginFrame.add(CurrentAccountButton);
                LoginFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
                LoginFrame.setSize(800, 400);
                LoginFrame.setVisible(true);

                SavingsAccountButton.addActionListener(e -> {
                        SavingsAccountButton.setSize(20, 20);
                        drawSavingsAccountUI();

                });
                CurrentAccountButton.addActionListener(e -> {
                        drawCurrentAccountUI();

                });

        }

        public void drawSavingsAccountUI() {
                SavingsAccountFrame = new JFrame("Savings Account");
                SavingsAccountFrame.add(SavingsDepositButton);
                SavingsAccountFrame.add(SavingsWithdrawButton);
                SavingsAccountFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
                SavingsAccountFrame.setSize(800, 400);
                SavingsAccountFrame.setVisible(true);

                SavingsDepositButton.addActionListener(e -> {
                        drawSavingsDepositUI();
                });

                SavingsWithdrawButton.addActionListener(e -> {
                        drawSavingsWithdrawUI();
                });

        }

        public void drawSavingsDepositUI() {
                SavingsDepositFrame = new JFrame("Enter Deposit Details");
                SavingsDepositFrame.add(enterSavingsDepositAmount);
                SavingsDepositFrame.add(SavingsDeposit);
                SavingsDepositFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
                SavingsDepositFrame.setSize(800, 400);
                SavingsDepositFrame.setVisible(true);

                SavingsDeposit.addActionListener(e -> {
                        try {
                                double Amount = Double.parseDouble(enterSavingsDepositAmount.getText());
                                double Deposit = Account_Balance.getAccountBalance() + Amount;
                                JOptionPane.showMessageDialog(null, "Amount: " + Amount + " \n Avail Bal: " + Deposit);
                                Bankfile.appendData("--Deposit: " + Amount + "||");
                        } catch (NumberFormatException nfe) {
                                JOptionPane.showMessageDialog(null, "Pls Input an Amount");

                        } catch (IOException ex) {
                                throw new RuntimeException(ex);
                        }

                });
        }

        public void drawSavingsWithdrawUI() {
                SavingsWithdrawFrame = new JFrame("Enter Withdraw Details");
                SavingsWithdrawFrame.add(enterSavingsWithdrawAmount);
                SavingsWithdrawFrame.add(SavingsWithdraw);
                SavingsWithdrawFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
                SavingsWithdrawFrame.setSize(800, 400);
                SavingsWithdrawFrame.setVisible(true);

                SavingsWithdraw.addActionListener(e -> {
                        try {
                                double Amount = Double.parseDouble(enterSavingsWithdrawAmount.getText());

                                if (Amount > 20000) {
                                } else {
                                        double Withdraw = Account_Balance.getAccountBalance() - Amount;
                                        JOptionPane.showMessageDialog(null,
                                                        "Amount: " + Amount + "\n Avail Bal: " + Withdraw);

                                        Bankfile.appendData("--Withdrawn" + Amount + "||");

                                }
                        } catch (NumberFormatException nfe) {
                                JOptionPane.showMessageDialog(null, "Pls Input an Amount");

                        } catch (IOException ex) {
                                throw new RuntimeException(ex);
                        }
                });
        }

        public void drawCurrentAccountUI() {
                this.CurrentAccountFrame = new JFrame("Current Account");
                this.CurrentAccountFrame.add(this.CurrentDepositButton);
                this.CurrentAccountFrame.add(this.CurrentWithdrawButton);
                this.CurrentAccountFrame.setLayout(new FlowLayout(3));
                this.CurrentAccountFrame.setSize(800, 400);
                this.CurrentAccountFrame.setVisible(true);

                CurrentDepositButton.addActionListener(e -> {
                        drawCurrentDepositUI();
                });

                CurrentWithdrawButton.addActionListener(e -> {
                        drawCurrentWithdrawUI();
                });
        }

        public void drawCurrentDepositUI() {
                this.CurrentDepositFrame = new JFrame("Enter Deposit Details");
                this.CurrentDepositFrame.add(this.enterCurrentDepositAmount);
                this.CurrentDepositFrame.add(this.CurrentDeposit);
                this.CurrentDepositFrame.setLayout(new FlowLayout(3));
                this.CurrentDepositFrame.setSize(800, 400);
                this.CurrentDepositFrame.setVisible(true);

                CurrentDeposit.addActionListener(e -> {
                        try {
                                double Amount = Double.parseDouble(enterCurrentDepositAmount.getText());
                                double Deposit = Account_Balance.getAccountBalance() + Amount;
                                JOptionPane.showMessageDialog(null, "Amount: " + Amount + " \n Avail Bal: " + Deposit);
                                Bankfile.appendData("--Deposit: " + Amount + "||");
                        } catch (NumberFormatException nfe) {
                                JOptionPane.showMessageDialog(null, "Pls Input an Amount");
                        } catch (IOException ex) {
                                throw new RuntimeException(ex);
                        }
                });
        }

        public void drawCurrentWithdrawUI() {
                this.CurrentWithdrawFrame = new JFrame("Enter Withdraw Details");
                this.CurrentWithdrawFrame.add(this.enterCurrentWithdrawAmount);
                this.CurrentWithdrawFrame.add(this.CurrentWithdraw);
                this.CurrentWithdrawFrame.setLayout(new FlowLayout(3));
                this.CurrentWithdrawFrame.setSize(800, 400);
                this.CurrentWithdrawFrame.setVisible(true);

                CurrentWithdraw.addActionListener(e -> {
                        try {
                                double Amount = Double.parseDouble(enterCurrentWithdrawAmount.getText());
                                double Withdraw = Account_Balance.getAccountBalance() - Amount;
                                JOptionPane.showMessageDialog(null, "Amount: " + Amount + " \n Avail Bal: " + Withdraw);
                                Bankfile.appendData("--Withdrawn: " + Amount + "||");
                        } catch (NumberFormatException nfe) {
                                JOptionPane.showMessageDialog(null, "Pls Input an Amount");
                        } catch (IOException ex) {
                                throw new RuntimeException(ex);
                        }
                });
        }

}
