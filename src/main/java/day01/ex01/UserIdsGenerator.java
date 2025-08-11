package day01.ex01;

// содержит последний сгенерированный идентификатор в качестве состояния
// Singleton LazyInitialized

public class UserIdsGenerator {
    private static UserIdsGenerator instance;
    private int id;
    public int generateId() {
        return id++;
    }
    private UserIdsGenerator() {}
    public static UserIdsGenerator getInstance() {
        if (instance == null) {
            instance = new UserIdsGenerator();
        }
        return instance;
    }
}
