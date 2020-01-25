package Classes;

import com.company.PrimeNumber;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BankAccount {
    private static DecimalFormat df = new DecimalFormat("0.00");


    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void deposite (double zdeponuj)
    {
        df.format(balance+=zdeponuj);
    }
    public void winthdraw (double wyjmij)
    {
        df.format(balance-=wyjmij);
    }




}
