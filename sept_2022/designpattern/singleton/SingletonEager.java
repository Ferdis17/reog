package sept_2022.designpattern.singleton;

public class SingletonEager {

    private static final SingletonEager eager = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance() {
        return eager;
    }
}
