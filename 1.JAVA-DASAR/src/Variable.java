public class Variable {
    public static void main(String[] args) {
//        variable adalah tempat menyimpan data
//        Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama.
//        untuk membuat variable menggunakan nama tipe data lalu diikuti dengan nama variablenya
//        nama variable tidak boleh mengandung whitespace(spasi, enter, tab) dan tidak boleh seluruhnya number.

        String name;
        name = "veronica maya santi";

        int age = 30;
        String address = "tenjo";


        System.out.println(name);
        System.out.println(age);
        System.out.println(address);


        name = "Rasmus Wijaya";

        System.out.println(name);



//  kata kunci var
//        Java mendukung pembuatan variable dengan kata kunci var, sehingga tidak perlu menyebutkan tipe datanya terlebih dahulu
//        namun harus menginisiasi value dari var terlebih dahulu secara langsung

//        var name; hasil akan errro
//        name = "alexander";

//        harusnya
        var nama = "samantha";
        var umur = 6;
        var alamat = "Bogor";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);


//        kata kunci final
//        secara default, variable di Java bisa diubah-ubah nilainya
//        dengan kata kunci final, maka data pada variable tidak boleh diubah
//        istilahnya const jika pada javascript

//        final String project = "belajar java";
//        project = "semangat";   hasil akan error


//  Declare Many Variables
//         to declare more than one variable of the same type, can use a comma separate list:
        int x = 5;
        int y = 6;
        int z = 7;

        System.out.println(x+y+z);

//   simply write
    int a = 5, b = 6, c = 10;
    String ibu = "maya", anak = "tata", anak2 = "geo", ayah ="alex";

    System.out.println(a+b+c);
    System.out.println(anak2);


//    one value to multiple variables
//        you can assign the same value to multiple variables in one line:
        int e, f, g;
        e=f=g = 88;
        System.out.println(e+f+g);

//  the general rules for naming variables are:
//        names can contain letters, digits, underscores, and dollar signs
//        names must begin/ diawali with a letter
//        names should start with a lowercase letter and it cannot contain whitespace
//        names can also begin with $ and _
//        names are case sensitive ("myVar" and "myvar" are different variables)
//        reserved word (like Java keywords, such as int or boolean) cannot be used as names
        

        }


    }

