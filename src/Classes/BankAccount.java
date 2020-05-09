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
    public BankAccount()
    {
        this(234,0.0,"Bob","bob@wp.pl","724102207");
        System.out.println("pusty konstruktor zostal wywolany");
    }
    public BankAccount(int accountNumber,double balance,String customerName, String email, String phoneNumber)
    {
        this.accountNumber =accountNumber;
        this.balance = balance;
        this.customerName =customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

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
        this.balance+=zdeponuj;
        System.out.println("po zdeponowaniu "+ zdeponuj + " mamy nowy balans "+this.balance );

    }
    public void winthdraw (double wyjmij)
    {
        if(this.balance-wyjmij<0)
        {
            System.out.println("można tylko " +this.balance+ " wyjąć z konta ");
        }
        else{
        df.format(this.balance-=wyjmij);
            System.out.println("po wyjeciu kwoty "+ wyjmij + " na koncie pozostało "+this.balance);
    }
}



}
