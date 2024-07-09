import java.net.SocketOption;

public class OperasiMatematika {
    public static void main(String[] args) {
//        operasi matematika
//        +  penjumlahan
//        -  pengurangan
//        * perkalian
//        / pembagian
//        %  sisa pembagian

        int a = 100;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a % b);

//      Augmented Assigments
//        operasi variable ke dirinya sendiri
//        operasi matematika            augmented assignments
//        a = a + 10                    a += 10
//        a = a - 10                    a -= 10
//        a = a * 10                    a *= 10
//        a = a / 10                    a /= 10
//        a = a % 10                    a %= 10

        int c = 100;
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

//        unary operator
//        operator          keterangan
//        ++                a=a+1
//        --                a=a-1
//        -                 negative
//        +                 positive
//        !                 Boolean kebalikan

         int d = +100;
         int e = -10;

         d++;
         System.out.println(d);

         d--;
        System.out.println(d);

        System.out.println(!true);
        
    }
}
