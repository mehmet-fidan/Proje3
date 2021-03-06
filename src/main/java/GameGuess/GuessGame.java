package GameGuess;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

       /*
        int randomGenerator();  methodu oluşturun.
        Bu method 0 ile 100 arasında random bir sayı oluşturmalı.
        Bu method random sayıyı return etmeli.
     */
    // Method yazmaya buradan başlayın

    public int randomGenerator() {
         int  randomS = (int)(Math.random()*100);
            return randomS;
        }

    /*
        void letsGuess ()  methodunu oluşturalım.
        Bu method parametre olarak bir int almalı.
        Bu method, kullanici doğru sayıyı bulana ya da tahmin etme limitine ulaşana kadar sormaya devam edecek.
        Girilen sayı random sayıdan küçükse "Your number is too low" yazdıralım.
        Girilen sayı random sayıdan büyükse "Your number is too high" yazdıralım.
        Girilen sayı random sayıya eşit olduğunda "You got it !!" yazdıralım
        Ve loop sonlandırılsın.
        Tahmin girişiminiz maksimum 5'tir.
        Eğer tahmininiz  5'e ulaşırsa "Anlamadım dostum !!!"

        Not:
         1) Sayıları tahmin ederken Scanner Class kullanmanız gerekir.
         2) Bu methodların her ikisi de statik bir method değildir
    */
    // Method yazmaya buradan başlayın


        public void letsGuess(int random){
            Scanner scanner = new Scanner(System.in);

            int count = 0;
            disDongu: while (count<5){
                System.out.print("Guess the number: ");
                int guess = scanner.nextInt();

                if (random == guess) {
                    System.out.println("You got it !!");
                    break disDongu;
                }
                else if (guess < random) System.out.println("Your number is too low.");
                else System.out.println("Your number is too high.");

                count++;
            }

            if (count>4) System.out.println("Anlamadim dostum!");

        }

    }

