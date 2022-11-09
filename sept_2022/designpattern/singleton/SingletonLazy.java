package sept_2022.designpattern.singleton;

public class SingletonLazy {
    // this is regular implementation easy for single thread environment
    private static SingletonLazy lazy;

    private SingletonLazy() {

    }

    public static SingletonLazy getLazy() {
        if(lazy == null) {

            lazy = new SingletonLazy();
        }
        return lazy;
    }
}
