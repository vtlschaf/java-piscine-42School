package day01.ex00;

public class Transaction {
    // Описывает денежный перевод между двумя пользователями.
    // Определить уникальный идентификатор как строку вида UUID.
        // UUID - Universally Unique Identifier java.util.UUID
            // UUID uuid = UUID.randomUUID(); sout(uuid.toString());
//    Поля:
    // Идентификатор
    // Получатель (тип User)
    // Отправитель (тип User)
    // Категория перевода (приход, расход)
    // Сумма перевода

    private String uuid;
    private User recipient;
    private User sender;
    private String category;
    private double amount;

    public Transaction(String uuid,User recipient, User sender, String category, double amount) {
        this.uuid = uuid;
        this.recipient = recipient;
        this.sender = sender;
        this.category = category;
        this.amount = amount;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Trans.:"
                + "| uuid= '" + uuid + '\''
                + "| recipient= " + recipient.getUsername()
                + "| sender= " + sender.getUsername()
                + "| category= " + category
                + "| amount= " + amount
                + '|';
    }
}
