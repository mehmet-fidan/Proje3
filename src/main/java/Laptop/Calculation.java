package Laptop;

import java.util.ArrayList;

public class Calculation {

    int price;

    /*
       Parametresi  ArrayList<String> olan  getRam(); methodunu oluşturun
       Eğer ram 32 gb ise price 300 ekle
       Eğer ram 16 gb ise price 200 ekle
       Eğer ram 8 gb ise price 100 ekle
       Eğer ram 4 gb ise price 50 ekle
       return  price  olmalı.
    */
    // Method yazmaya buradan başlayın
    public int getRam(ArrayList<String> ram) {

        if (ram.get(2).toLowerCase().equals("32 gb")) {
            price += 300;
        } else if (ram.get(2).toLowerCase().equals("16 gb")) {
            price += 200;
        } else if (ram.get(2).toLowerCase().equals("8 gb")) {
            price += 100;
        } else if (ram.get(2).toLowerCase().equals("4 gb")) {
            price += 50;
        }
        return price;
    }

    /*
      Parametresi  ArrayList<String> olan  getCPU(); methodunu oluşturun
      Eğer CPU i3 ise price 200 ekle
      Eğer CPU i5 ise price 300 ekle
      Eğer CPU i7 ise price 500 ekle
      return  price  olmalı
   */
    // Method yazmaya buradan başlayın
    public int getCPU(ArrayList<String> islemci) {

        if (islemci.get(3).toLowerCase().equals("i7")) {
            price += 500;
        } else if (islemci.get(3).toLowerCase().equals("i5")) {
            price += 300;
        } else if (islemci.get(3).toLowerCase().equals("i3")) {
            price += 200;
        }
        return price;
    }
 /*
        Parametresi  ArrayList<String> olan getColor(); methodunu oluşturun
        return türü int olmalı
        Eğer Color Red ise ise price 400 ekle
        Eğer Color Orange ise price 300 ekle
        Eğer Color Silver ise price 200 ekle
        Eğer Color Black ise price 150 ekle
        return  price  olmalı
     */
    // Method yazmaya buradan başlayın
    public int getColor(ArrayList<String> color){
        if (color.get(4).toLowerCase().equals("red")){
            price+=400;
        } else if (color.get(4).toLowerCase().equals("orange")){
            price+=300;
        } else if (color.get(4).toLowerCase().equals("silver")){
            price+=200;
        } else if (color.get(4).toLowerCase().equals("black")) {
            price+=150;
        } return price;
    }

    /*
        Parametresi  ArrayList<String> olan getSize(); methodunu oluşturun
        return türü int olmalı
        Eğer Size "Mini" içeriyorsa price 100 ekle
        Eğer Size "Middle" içeriyorsa price 200 ekle
        Eğer Size "Max" içeriyorsa price 300 ekle
        return  price  olmalı
    */
    // Method yazmaya buradan başlayın

    public int getSize(ArrayList<String> size) {
        if (size.get(1).toLowerCase().contains("mini")) {
            price+=100;
        } else if (size.get(1).toLowerCase().contains("middle")){
            price+=200;
        } else if (size.get(1).toLowerCase().contains("max")) {
            price+=300;
        } return price;
    }

}
