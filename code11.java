class Parent {
    void fun() {
        System.out.println("Parent fun()");
    }
}

class Child extends Parent {
    void fun() {
        super.fun();
        System.out.println("Child fun()");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.fun();
    }
}
