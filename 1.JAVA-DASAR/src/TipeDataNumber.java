public class TipeDataNumber {

    public static void main(String[] args) {
//        interger number
//        byte -128 sampai dengan 127 ukuran 1byte default 0
//        short -32.768 sampai dengan 32.767 ukuran 2bytes default 0
//        int -2.147.483.648 sampai dengan 2.147.483.647 ukuran 4 bytes default 0
//        long -9,223,372,036,854,775,808 sampai dengan 9,223,372,036,854,775,807 ukuran 8 bytes default 0

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 100000;
        long iniLong = 10000000;
        long iniLong2 = 100000000L;
//      pada iniLong2 number panjang bisa ditambhkan huruf L

// Floating Point Number
//        float min 3.4e-038 max 3.4e+038 ukuran 4 bytes default 0.0
//        double min 1.7e-308 max 1.7e+308 ukuran 8 bytes default 0.0

        float iniFloat = 10.12F;
        double iniDouble = 12.2424;

//  Literals Numbers
//  desimal langsung ketikan biasa
        int decimalInt = 25;

//  hexsa desimal
        int hexInt = 0xA123B;

//  binary
        int binInt = 0b01010101;
// angka binary hanya 0 dan 1 jika dimasukan angka lain maka akan error

//        underscore
        long amount = 1_000_000_000;


    }

}
