public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp = b;
        int temp1 = c;
        b = a;
        c = temp;
        a = temp1;

        System.out.printf("%d\n%d\n%d\n", a, b, c);
    }
}