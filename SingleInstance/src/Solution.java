import sun.security.pkcs11.Secmod.Module;

public class Solution {

}

class Moudle {

    private static Moudle instance = new Moudle();

    private Moudle() {

    }

    public static Moudle getInstance() {
        return instance;
    }
}

class Module1 {

    private static Module1 instance;

    private Module1() {

    }

    public static Module1 getInstance() {
        if (instance == null)
            instance = new Module1();
        return instance;
    }
}

class Module2 {
    static class Instance {
        static Module2 instance = new Module2();
    }

    private Module2 getInstance() {
        return Instance.instance;
    }
}

class Module3 {

    private static Module3 instance;

    private Module3() {}

    private static synchronized Module3 getInstance() {
        if (instance == null)
            instance = new Module3();
        return instance;
    }
}

class Module4 {
    private static Module4 instance;

    private Module4(){}

    public static Module4 getInstance() {
        if (instance == null) {
            synchronized(Module4.class) {
                instance = new Module4();
            }
        }
        return instance;
    }
}

class Module5 {
    private static Module5 instance;

    private Module5(){}

    public static Module5 getInstance() {

        if (instance == null) {
            synchronized(Module5.class) {
                if (instance == null)
                    instance = new Module5();
            }
        }

        return instance;
    }
}
