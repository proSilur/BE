package basics.encapsulation;

public class Main {
    public static void main(String[] args) {
        Father father = new Father();
        father.doSomething(new SonOne());
        father.doSomething(new SonTwo());
        father.doSomething(new SonThree());


    }
}
