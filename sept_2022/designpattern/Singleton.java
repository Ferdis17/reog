package sept_2022.designpattern;

public class Singleton {
    private static Singleton mySingletonObject;

    private Singleton() {}

    public static Singleton getInstance(){
        return mySingletonObject == null? new Singleton() : mySingletonObject;
    }

    public void singletonInstance() {
        System.out.println("just Singleton instance is here");
    }
}
