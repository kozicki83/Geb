package clouser

class EnclosedInInnerClass {
    class Inner {
        Closure cl = { owner }
    }

    void run() {
        def inner = new Inner()
        assert inner.cl() == inner
    }
}
