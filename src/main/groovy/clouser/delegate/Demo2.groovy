package clouser.delegate

class Demo2 {
    public static void main(String[] args) {

        def p = new Person(name: "Daniel")
        def t = new Thing(name: "Kasia")

        assert p.toString() == "Ma name is Daniel"
        p.pretty.delegate = t
        p.pretty.resolveStrategy = Closure.DELEGATE_FIRST
        assert p.toString() == "Ma name is Daniel"

    }
}
