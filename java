
package session6;

public class Account {
    String accountNumber;
    String accountHolderName;
    String accountType;
    double balace;


    public Account(){
        System.out.println("Default Construtor Invoked.");
    }

    public Account(String accNo, String name, String accType, double bal) {
         System.out.println("Parameterized Constructor Invoked");
         accountNumber = accNo;
         accountHolderName = name;
         accountType = accType;
         balace = bal;
    }
}


package session7;

import java.security.PrivateKey;

public class Account2 {
    private  String accountNumber;
    private  String accountHolderName;
    private String accountType;
    private  double balace;

    public Account2(){
        System.out.println("Default Consttructor Invoked..");
        accountNumber = "Not Specified";
        accountHolderName = "Not Specified";
        accountType = "Not Specified";
        balace = 0.0;

    }

    public Account2(String accountNumber, String accountHolderName,String accountType, double balace){
        System.out.println("Parameterized Construtor Invoked");

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balace = balace;
    }

    public String getAccountNumber(){
        return  accountNumber;

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalace() {
        return balace;
    }

    public void setBalace(double balace) {
        this.balace = balace;
    }
}



package session3;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        long customerCode;
        String customerName;
        int customerAge;
        double depositAmount;

        System.out.println("Enter the details for the new customer");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Four-digit Customer Code:");
        customerCode = input.nextLong();
        System.out.println("Enter the Customer First Name:");
        customerName = input.next();
        System.out.println("Enter the Customer Age:");
        customerAge = input.nextInt();
        System.out.println("Enther the Amount Deposited:");
        depositAmount = input.nextDouble();
        System.out.println("\nCustomerCode \t\t CustomerName \t\t CustomerAge \t\t DepositedAmount:");
        System.out.println("-------------------------------------------------------------");

        System.out.format("%08d \t\t\t", customerCode);
        System.out.format("%s \t\t\t", customerName);
        System.out.format("%d \t\t\t",customerAge);
        System.out.format("%2f\n", depositAmount);
    }
}


package session5;

public class DisplayNumbers {

    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            System.out.println("Outer while loop");

            while (true) {

                i++;
                System.out.println("i = " + i);
                if (i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }


                if (i == 5) {
                    System.out.println("break");
                    break;
                }
                if (i == 7) ;
                {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}


package session4;

import java.util.Scanner;

public class EmloyeeDetails {

    public static void main(String[] args) {
        int employeeID;
        String employeeName;
        char gender;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Employee Identification Code:");
        employeeID = scan.nextInt();

        if (employeeID > 0 ){
            System.out.println("Enter the Employee Name:");
            Scanner s = new Scanner(System.in);
            employeeName = scan.nextLine();

        if (employeeName.length() <40) {
            System.out.println("Enter the Gender: [M/F] ");
            gender = scan.next("\\D").charAt(0);

            if (gender == 'M' || gender == 'F'){
                System.out.println("Employee Code:" + employeeID);
                System.out.println("Employee Name:" + employeeName);
                System.out.println("Employee Gender:" + gender);
            } else {
                System.out.println("Incorrect Entry for Gender.");
            }
        }
        else {
            System.out.println("Incorrect Entry for EMployee Name.");
        }
        }
        else{
            System.out.println("Incorrect Entry for Employee Indentification Code.");
        }



    }
}


package session5;

public class EvenNumbers {
    public static void main(String[] args) {
        int i = 0 , sum = 0;
        while (i<=20){
            if (i % 2 == 0 ){
                sum += i;

            }

            i++;

        }

        System.out.println("Sum of first 10 event number is:" + sum);
    }
}



package session5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        long fact = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number for factorial calculation:");

        num = input.nextInt();

        do {
            fact = fact * num;
            num--;


        } while (num >= 1);


        System.out.println("Factorial of a Number:" + fact);
    }
    }


package session2;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
    }
}
© 2022 GitHub, Inc.


package session3;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        int orderedShirts , orderedTrouse, points = 0;
        int priceOfShirt = 300;
        int priceOfTrouse = 700;
        int costOfShirts, costOfTrousers, totalCost;
        double discount, netPay;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirts to order:");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of Trousers to oder");
        orderedTrouse = input.nextInt();

        costOfShirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceOfTrouse * orderedTrouse;
        totalCost = costOfShirts + costOfTrousers;

        discount = totalCost > 3000? totalCost * 10 / 100 : 0;
        netPay = totalCost - discount;

        points =  (int) (netPay > 3000? netPay / 100 : 0 );

        System.out.println("\nItem \t\t Quantity \t Price \t Total:");
        System.out.println("--------------------------------------");
        System.out.printf("Shirts \t\t %d \t\t %d \t\t %d \n", orderedShirts, priceOfShirt, costOfShirts);
        System.out.printf("Trouser \t %d \t\t %d \t %2f \n", discount);
        System.out.println("-----------------------------" +"-------------");
        System.out.printf("Net Total \t \t\t \t\t %2f \n", netPay);
        System.out.println("-------------"+"----------");
        System.out.printf("Points Earned \n %d \n", points);



    }
}


package session3;

public class Product {
    public static void main(String[] args) {
        int productID = 19845;
        String productName ="MensTrouser";
        char productType = 'A';
        short quantity = 148;
        double productPrice = 15_25_4.65;
        int barcodeNumber = 0b1101_0101_0001_1010;
        boolean availableStatus = true;
        System.out.println("\tProduct Details");
        System.out.println("------------------------");
        System.out.println("Product Identification Code:" + productID);
        System.out.println("Product Name:" + productID);
        System.out.println("Product Category (A:Apparels G:Gadgets:)"+ productType) ;
        System.out.println("Product Quantity:" + quantity);
        System.out.println("Product Price:$" + productPrice);
        System.out.println("Product Barcode Number:" +barcodeNumber);
        System.out.println("Product Availability:" +availableStatus);


    }
}

package session5;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int row;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the maximum number of rows for displaying status");
        row = input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int space = row; space >=i; space--){
               System.out.println(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.println("*");
            }

            System.out.println();
        }

        }
    }
    
    package session6;

public class TestAccount {
    public static void main(String[] args) {

        Account objAccount1;
        objAccount1 = new Account();

        System.out.println("Account Number" + objAccount1.accountNumber);
        System.out.println("Account Holder Name:" + objAccount1.accountHolderName);
        System.out.println("Account Type:" +objAccount1.accountType);
        System.out.println("Balance:" + objAccount1.balace);
        System.out.println("============");

        Account objAccount2 = new Account("Acc001", "John Smith" , "Saving", 6500.789);
        System.out.println("Account Number" + objAccount2.accountNumber);
        System.out.println("Account Holder Name:" + objAccount2.accountHolderName);
        System.out.println("Account Type:" +objAccount2.accountType);
        System.out.println("Balance:" + objAccount2.balace);
        System.out.println("============");
    }
} 

package session7;

import session7.Account2;

public class TestAccount2 {
    public static void main(String[] args) {
        Account2 objAccount2 = new Account2();

        objAccount2.setAccountNumber("Acc001");
        objAccount2.setAccountHolderName("Nam");
        objAccount2.setAccountType("Savings");
        objAccount2.setBalace(6500.789);


        System.out.println("Account Details");
        System.out.println("Account Number:" +objAccount2.getAccountNumber());
        System.out.println("Account Holder Name:" + objAccount2.getAccountHolderName());
        System.out.println("Account Type:" +objAccount2.getAccountType());
        System.out.println("Balance:" +objAccount2.getBalace());
    }
}

