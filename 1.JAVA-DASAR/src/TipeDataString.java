public class TipeDataString {

    public static void main(String[] args) {
//        Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau teks
//        Tipe data direpresentasikan dengan kata kunci String
//        menggunakan karakter " (petik dua) sebelum dan sesudah teks nya
//        default value untuk String adalah null

        String firstName = "veronica ";
        String lastName = "maya";
//      the + operator can be used between string to combine them. this is called concatenation / penggabungan
        String fullName = firstName + " " + lastName;

//      concat() method to concatenate two strings
        System.out.println(firstName.concat(lastName));

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);

//      String length
//      A String in Java actually an object, which contain methods that can perform/melakukan certain/tertentu operations on string.
//      For example, the length of a string can be found with length() method:

        String txt = "AkuAdalahSeorangProgrammerJava";
        System.out.println("The length of the txt string is: " + txt.length());

//      toUpperCase() and toLowerCase()
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

//      finding a character in a string with indexOf() method return the index(the position)
        System.out.println(txt.indexOf("a"));

//      Java numbers and strings
//        java uses the + operator for both addition and concatenation
//        numbers are added. string are concatenated
//        if add two numbers, the result will be a number:
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);

//        if add two string, the result will be a string concatenation:
        String a = "10";
        String b = "20";
        String c = a + b ;
        System.out.println(c);

//        if add a number and string, the result will be a string concatenation:
        String d = "50";
        int e = 80;
        String f = d + e;
        System.out.println(f);


//        Strings - Special Characters
//        \'  result '
//        \" result "
//        \\ result \
//        \n result new line
        String special = "ini adalah \'spesial\' karakter untuk \"string\" aku juga \\cinta java setelah ini \n akan enter ";
        System.out.println(special);






    }
}
