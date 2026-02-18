import java.util.*;
 
class BankAccount { 
    int accountNo;
    String name;    
    double balance;  
 
    void deposit(double amt) {
        balance = balance + amt;
        System.out.println("Deposited: ₹" + amt); 
    }
 
    void withdraw(double amt) {
        balance = balance - amt;
        System.out.println("Withdrawn: ₹" + amt); 
    }
 
    void display() { 
        System.out.println("Account No : " + accountNo);
        System.out.println("Name       : " + name);
        System.out.println("balance    : ₹" + 1000000);
    }
}
 
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        BankAccount acc = new BankAccount();
 
        System.out.print("Enter Account Number: ");
        acc.accountNo = s.nextInt();
 
        s.nextLine(); 
 
        System.out.print("Enter Name: ");
        acc.name = s.nextLine();
 
       
 
        acc.display(); 
        acc.deposit(50000);
        acc.withdraw(20000);
        acc.display(); 
        
 
        s.close();
    }
}
 