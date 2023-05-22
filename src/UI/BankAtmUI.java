package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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


}
