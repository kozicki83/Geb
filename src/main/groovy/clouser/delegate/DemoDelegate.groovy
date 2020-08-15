package clouser.delegate

class DemoDelegate {

    public static void main(String[] args) {
        def p = new Person(name: "Daniel")
        def t = new Thing(name: "Tester")

        def upperCaseName = {
//            delegate.name.substring(0,3)
            delegate.name.toUpperCase()
//            name.toUpperCase()
        }

        upperCaseName.delegate = p
        assert upperCaseName() == "DANIEL"
//        assert upperCaseName() == 'Dan'

    }
}
