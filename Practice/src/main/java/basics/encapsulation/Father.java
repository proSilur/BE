package basics.encapsulation;

public class Father {
    void a() {
        System.out.println("Father.a()");
    }

    void b() {
        System.out.println("Father.b()");
    }

    void c() {
        System.out.println("Father.c()");
    }


    void doSomething(Father father) {
        father.a();
        father.b();
        father.c();
    }
}
