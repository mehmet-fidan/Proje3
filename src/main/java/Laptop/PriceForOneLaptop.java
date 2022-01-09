package Laptop;


public class PriceForOneLaptop {

    /*
        int getPrice(int laptopID);  methodu veriliyor.
        Bu method, Data class dan AllData methodunu çağıracaktir.
        Bu Methodun Calculation class taki tüm methodları çağırması, price alması ve
        totalAmount return etmesi gerekir.
     */
    Data d1 = new Data();
    Calculation c1 = new Calculation();


    public int getPrice(int laptopID) {

        c1.getRam(d1.AllData(laptopID));
        c1.getColor(d1.AllData(laptopID));
        c1.getCPU(d1.AllData(laptopID));
        c1.getSize(d1.AllData(laptopID));

        return c1.price;
    }

     /*
        int getDiscount(int amount , int discount);  methodu veriliyor.
        amount'dan (miktar), discount(indirim, % olarak) kadar indirim yapın.
        indirilmiş fiyatı return edin
        Örnek:
        amount = 100 ve discount = 20 ise
        20% indirimden sonra sonuç 80 olmalı
     */

    public int getDiscount(double amount, double discount) {

        double discountPrice = amount* ((100-discount)/100);
        int discounted =(int)  discountPrice;

        return discounted;
    }


}
