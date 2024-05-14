package designPatterns.singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager(){}

    public static SingletonEager getInstance() {
        if (instance == null)
            instance = new SingletonEager();
        return instance;
    }
}
