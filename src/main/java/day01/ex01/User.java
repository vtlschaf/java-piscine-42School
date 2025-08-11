package day01.ex01;

public class User {
    //Идентификатор (любое целое число. Логика в след. задании)
    //Имя
    //Баланс
    private static int ID = 1;
    private int id;
    private String username;
    private double balance;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public User(String username, double balance) {
        this.id = UserIdsGenerator.getInstance().generateId();
        this.username = username;
        if(balance >= 0) this.balance = balance;
        else {
            this.balance = 0;
            System.out.println("Balance is negative");
        }
    }
    @Override
    public String toString() {
        return "User:  "
                + "| id= " + id
                + " | username= " + username
                + "| balance= " + balance
                + '|';
    }
}

