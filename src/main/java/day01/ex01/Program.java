package day01.ex01;

import day01.ex00.Transaction;
import day01.ex00.User;

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
//        UUID Uuid = UUID.randomUUID(); // неправильно, нужно генерировать при каждом создании объекта
        day01.ex00.User user1 = new day01.ex00.User("John P.", -100.00);
        day01.ex00.User user2 = new User("Mike B.", 200.00);
        System.out.println(user1);
        System.out.println(user2);
        Transaction transaction1 = new Transaction(user1 , user2 ,"IN", 50); // recipient, sender, category, amount
        Transaction transaction2 = new Transaction(user1 , user2 ,"IN", 100); // recipient, sender, category, amount
        Transaction transaction3 = new Transaction(user1 , user2 ,"OUT", 150); // recipient, sender, category, amount
        System.out.println(checkTransaction(transaction1));
        System.out.println(transaction1);
        if(checkTransaction(transaction1)){
            goTransaction(transaction1);
        }
        System.out.println(transaction2);
        System.out.println(transaction3);
    }

    public static boolean checkTransaction(Transaction transaction) {
        boolean result=false;
        if (transaction.getCategory().equals("IN")) {
            if (transaction.getAmount() > 0) result = true; // всегда ставим {}
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
