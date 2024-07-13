public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "veronica", "maya", "santi", "alex", "hendra", "wijaya"
        };

        for(var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("dibawah adalah hasil dengan for each");

        for(String name: names){
            System.out.println(name);
        }
    }
}
