public class KonversiNumber {

    public static void main(String[] args) {
//        Konversi Tipe Data Number
//        Widening Casting (otomatis) : byte -> short -> int -> long -> double
//        bisa otomatis karena angkanya masih muat
       byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;


//        Narrowing Casting (manual) : double -> float -> long -> int -> char -> short -> byte
float iniFloat2 = (float) iniDouble;
long iniLong2 = (long) iniFloat2;
int iniInt2 = (int) iniLong2;
short iniShort2 = (short) iniInt2;

    }
}
