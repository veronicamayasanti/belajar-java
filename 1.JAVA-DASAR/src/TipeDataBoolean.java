public class TipeDataBoolean {

    public static void main(String[] args) {
//        Tipe data boolean adalah tipe data yang memiliki nilai benar dan salah
//        Tipe data boolean di Java direpresentasikan dengan kata kunci boolean
//        Nilai benar direpesentasikan dengan kata kunci true
//        Nilai salah direpresentasikan dengan kata kunci false
//        Default value untuk boolean adalah false

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);


//      Boolean Expression

        int x = 10;
        int y = 9;

        System.out.println(x > y);

//      atau yang lebih mudah lagi

        System.out.println(10 > 9);

//       in the example below, we use the equal to (==) operator to evaluate an expression:

        int a = 7;
        System.out.println(a == 7);
//       hasilnya true karena nilai a adalah 7
//       contoh lain
        System.out.println(10 == 15); // hasilnya false karena 10 tidak sama dengan 15

//       Real Life Example
//       we use the >= comparison operator to find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18:

        int myAge = 25;
        int votingAge = 18;

        System.out.println(myAge >= votingAge); // maka hasilnya adalah true

        if (myAge >= votingAge){
            System.out.println("old enough to vote");
        } else {
            System.out.println("Not old enough to vote");
        }

    }
}
