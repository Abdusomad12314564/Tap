import java.util.Scanner;

public class Tap10 {
    public static void main(String[] args) {
        System.out.print("Сан бер: ");
        System.out.println(contains(new Scanner(System.in).nextInt(), -1,-2,-3,-4,-5,6,7,8,9,10));
    }
    static boolean contains (int a, int ... varargs) {
        for (int i:varargs) {
            if (i==a){
                return true;
            }
        }return false;
    }
}

