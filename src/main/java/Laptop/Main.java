package Laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Data d1 = new Data();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter discount rate");
        int discountRate = scan.nextInt();

        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int total =p1.getPrice(1100006 );
        int lastPrice =p1.getDiscount(total,discountRate);
        System.out.println(lastPrice);
    }
}
