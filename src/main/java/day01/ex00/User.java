package day01.ex00;

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
        this.id = ID++;
        this.username = username;
       this.balance = balance;
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

