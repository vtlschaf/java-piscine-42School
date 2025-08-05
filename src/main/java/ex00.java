public class ex00 {
    public static void main(String[] args) {
        int number = 479599;
        int summ = 0;
    while (number != 0) {
        summ += (number % 10);
        number /= 10;
    }
        System.out.println(summ);
    }
}
