package sept_2022.designpattern.singleton;

public class SingletonStaticInit {

    private static SingletonStaticInit singletonStaticInit;

    private SingletonStaticInit(){}

    static {
        try{
            singletonStaticInit = new SingletonStaticInit();
        } catch (Exception e) {
            throw new RuntimeException("Exception happens while creating an instance");
        }
    }

    public static SingletonStaticInit getInstance() {
        return singletonStaticInit;
    }
}
