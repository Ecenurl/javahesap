package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İki  Deger Giriniz(İlk Deger Büyük Olacak Şekilde): ");
        int say1 = sc.nextInt();
        int say2 = sc.nextInt();
        System.out.println("Bu degerleri Toplama için1'e\n Çarpmak için 2'ye\n Bölmek için 3'e\n Çıkarmak için 4'e basınız");
        int hesap = sc.nextInt();
        switch (hesap) {
            case 1:
                System.out.print(say1 + say2);
                break;

            case 2:
                System.out.print(say1 * say2);
                break;

            case 3:
                System.out.print(say1 / say2);
                break;

            case 4:
                System.out.print(say1 - say2);
                break;
        }
    }
}
