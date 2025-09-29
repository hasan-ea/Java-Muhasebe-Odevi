package muhasebe;

import java.util.Scanner;

public class primhesabı {
    public static void main(String[] args) {
        System.out.println("Çalışanın gün bilgisini giriniz:");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        if (day <32 && day>=0  ){
        }
        else {
            System.out.println("çalışan aylık çalıştığı gün sayısı 31 den büyük olamaz ve negatif olamaz");
            System.exit(0);
        }

        int prim;
        int a=2000;

        if (day <= 20 ) {
            prim= 0;
        }
        else if (day<=25) {
            prim= (day-20)*1000;
        }
        else  {
            prim= (day-25)*3000;
        }


        int maas=(a*day)+prim;
        System.out.println("Çalışan bu ay "+prim+"TL"+" "+"prim haketmiştir");
        System.out.println("Çalışanın toplam maaşı= "+maas+"TL'dir");


    }
}