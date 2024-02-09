public class TipeDataArray {
    public static void main(String[] args) {
//        Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
//        Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat

        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "veronica";
        stringArray[1] = "maya";
        stringArray[2] = "santi";


        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);


//        array initializer
        String[] namaNama = {
                "tata", "geo", "nathan"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };


//        Operasi di Array
//        operaso array             keterangan
//        array[index]              mengembil data di array
//        array[index] = value      mengubah data di array
//        array.length              mengambil panjang array

        long[] arrayLong2 = {
                10L, 20L, 30L, 40L, 50L
        };

        arrayLong2[0] = 69L;

        System.out.println(arrayLong2[0]);
        System.out.println(arrayLong2[1]);
        System.out.println(arrayLong2.length);


//        array di dalam array
        String[][] members = { {"maya", "santi", "pintar"}, {"tata", "geo"}, {"alex"} };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

        String [] cars = {"volvo", "BMW", "Ford", "mazda"};
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        String[] cats = {"dolly", "lady", "siti"};
        for (String i : cats){
            System.out.println(i);
        }


        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        for (int i = 0; i < myNumbers.length; ++i){
            for (int j = 0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}
