package Utlity;

public class MyFunc {
    public static void bekle(int sn)  {
        // bekle islemi
        try {
            Thread.sleep(1000*sn);   // Thread.sleep(1000*sn); sleep altinda kirmizi hata cizgi
        } catch (InterruptedException e) { //cikiyor, onu tiklatip sagtaraftan duzeltme seceneginden
            throw new RuntimeException(e); //try catch secenegini seciyoruz.
        }
    }
}
