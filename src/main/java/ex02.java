import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int summ;
        int count = 0;
        boolean isSimple;
        while (num != 42) {
            num = sc.nextInt();
            if (num !=0 && num != 1) {
                summ = Summ(num);
                isSimple = Simple(summ);
                if (isSimple) {
                    count++;
                }
            }
        }
        System.out.println("Count of coffee-request - " + count);
    }
    public static int Summ(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
    public static boolean Simple(int num) {
        boolean isSimple = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isSimple = false;
                    break;
                }
            }
            return isSimple;
        }
}
