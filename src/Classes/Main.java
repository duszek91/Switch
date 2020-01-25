package Classes;

import java.text.DecimalFormat;

public class Main {
    public static void main (String[]args)
    {
//    Car porshe = new Car();
//    Car holden = new Car();
//    porshe.setModel("carrera");
//        System.out.println("model is "+porshe.getModel());
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());
//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());
BankAccount konto1 = new BankAccount();
        DecimalFormat df = new DecimalFormat("0.00");
konto1.setAccountNumber(45145);
konto1.setBalance(1000);
konto1.setCustomerName("stefan");
konto1.setEmail("stefan@o2.pl");
konto1.setPhoneNumber("724102014");
        System.out.println(konto1.getBalance());
        konto1.deposite(514.15);
        System.out.println(konto1.getBalance());
        konto1.winthdraw(514.13);
        System.out.println(konto1.getBalance());
        System.out.println(konto1.getAccountNumber());
        System.out.println(konto1.getCustomerName());
    }
}
