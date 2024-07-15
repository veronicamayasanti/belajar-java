public class MethodParameter {
    public static void main(String[] args) {
    sayHello("veronica", "maya");
    sayHello("geonathan", "wijaya");
    sayHello("michelina", "samantha");

    }
    static  void  sayHello(String firstName, String lastName){
        System.out.println("hello " + firstName + " " + lastName);
    }
}
