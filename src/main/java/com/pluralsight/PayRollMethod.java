package com.pluralsight;
import java.util.Scanner;
public class PayRollMethod {

    //Importing Scanner in class
    static Scanner theScanner = new Scanner(System.in);

    //Main method
    public static void main(String[] args) {
    String usersName = usersName();
    double hoursWorked = hoursWorked();
    double hourlyWage = hourlyWage();
    double payFormula = payFormula(hourlyWage,hoursWorked);

    }
    }

    //usersName method
    public static String usersName() {
        System.out.println("What is your name?");
       return theScanner.nextLine();
    }

    //hoursWorked method
    public static double hoursWorked(){
        System.out.println("How many hours did you work?");
        return theScanner.nextDouble();
    }

    //hourlyWage method
    public static double hourlyWage(){
        System.out.println("What is your hourly Wage?");
        return theScanner.nextDouble();
    }

    //overtimeFormula Method
    public static double payFormula(double hourlyWage, double hoursWorked){
        double grossPay = 0;
        if (hoursWorked > 40){
            double overtimeHours = hoursWorked - 40;
            double overTimeGrossPay = (hourlyWage * 40) + (overtimeHours * hourlyWage * 1.5);
           return overTimeGrossPay;
        }else{
            grossPay = hourlyWage * hoursWorked;
            return grossPay;
        }
    }
}


