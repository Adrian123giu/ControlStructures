public class Return {
    public static void main(String[] args) {
        int sum = 0;
        int a = 6;
        int b = 18;
        sum = sum(a, b);
        System.out.println("suma este:" + sum);
        doPrint(sum);

        int c = 17;
        int d = 30;
        sum = sum(c, d);
        System.out.println("suma este:" + sum);
        doPrint(sum);
    }
    public static int sum(int operandone, int operandtwo){
        System.out.println("calculation of: " + operandone + "si " + operandtwo);
        return operandone + operandtwo;
    }
    public static void doPrint(int sum){
        if(sum < 30){
            return;
        }
        System.out.println("aceasta suma imi place");
    }
}
