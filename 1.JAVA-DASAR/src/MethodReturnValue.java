public class MethodReturnValue {
    public static void main(String[] args) {
    var result = sum(100, 100);
    System.out.println(result);

    System.out.println(sum(200, 200));

    }
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }
}
