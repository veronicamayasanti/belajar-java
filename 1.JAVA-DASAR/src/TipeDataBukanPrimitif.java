public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
//        tipe data bukan primitif
//        tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. tipe data primitif tidak bisa diubah lagi
//        String adalah tipe data bukan primitif sehingga tidak memiliki default dan bisa bernilai null
//        di java semua tipe data primitif memiliki representasi tipe data bukan primitif nya

//      Representasi tipe data primitif
        /*
        tipe data primitif       tipe data bukan primitif / o b je ct
        byte                        Byte
        short                       Short
        int                         Integer
        long                        Long
        float                       Float
        doble                       Double
        char                        Character
        boolean                     Boolean

        */


        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort; // hasil akan null atau error
        iniShort  = 100;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniBoolean);
        System.out.println(iniShort);







    }
}
