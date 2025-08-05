import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        boolean isSimple = true;
        int number = console.nextInt();
        if (number <=1) {
            System.out.println("IllegalArgument");
            System.exit(-1);
        } else {
            count = 1;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i != 0) {
                    count++;
                }
                else {
                    isSimple = false;
                    break;
                    }
                }
        }
        System.out.println(isSimple);
        System.out.println(count);
    }
}
