import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TipeDataChar {

//    data character di Java direpresentasikan oleh char
//    untuk menggunakan data char di Java menggunakan tanda ' petik satu di awal dan di akhir karakter
//    jika lebih satu kata menggunakan tanda kutib " di awal dan akhir

    public static void main(String[] args) {
        char m = 'm';
        char a = 'a';
        char y = 'y';

        System.out.println(m);
        System.out.println(a);
        System.out.println(y);
//  perintah println secara default belakang ada baris atau enter sehingga hasil output akan turun ke bawah
//        m
//        a
//        y

//  supaya hasil output baris lurus maka pada println diubah hanya menjadi print saja
        System.out.print(m);
        System.out.print(a);
        System.out.print(y);
    }


}
