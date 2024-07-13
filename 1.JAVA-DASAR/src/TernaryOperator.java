public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;

//        cara biasa
//        String ucapan;
//        if(nilai >= 75) {
//            ucapan = "selamat anda lulus";
//        } else  {
//            ucapan = "silahkan coba lagi";
//        }

        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba lagi";
        System.out.println(ucapan);
    }
}
