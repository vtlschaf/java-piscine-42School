package day01.ex00;

import java.util.Scanner;
import java.util.UUID;

// Обеспечить проверку начального баланса для User'a (он не может быть отрицательным)
// исходящая транзакция (только отрицательная сумма)
// входящая транзакция (только положительная сумма)
// get/set методы
// Создание
// инициализация
// вывод содержимого объектов в консоль
// все данные для полей классов захардкодить в Program
public class Program {
    public static void main(String[] args) {
        UUID Uuid = UUID.randomUUID();
        Scanner sc = new Scanner(System.in);
        User user1 = new User("John P.", -100.00);
        User user2 = new User("Mike B.", 200.00);
        System.out.println(user1);
        System.out.println(user2);
        Transaction transaction1 = new Transaction(Uuid.toString() ,user1 , user2 ,"IN", 50); // recipient, sender, category, amount
        System.out.println(checkTransaction(transaction1));
        System.out.println(transaction1);
        if(checkTransaction(transaction1)){
            goTransaction(transaction1);
        }
    }

    public static boolean checkTransaction(Transaction transaction) {
        boolean result=false;
        if (transaction.getCategory().equals("IN")) {
            if (transaction.getAmount() > 0) result = true;
            else result = false;
        } else if (transaction.getCategory().equals("OUT")) {
            if (transaction.getAmount() < 0) result = true;
            else result = false;
        }
        return result;
    }

    public static void goTransaction(Transaction transaction) {

    }
}
